package com.anupam.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

/**
 * If the user is Authenticated, it issues a access_token. The access_token is
 * used to call every REST service.
 *
 * @author brisatc186.gogoi
 */
@Configuration
@EnableAuthorizationServer
public class AuthServer extends AuthorizationServerConfigurerAdapter {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private DataSource dataSource;

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager);

	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.jdbc(dataSource);

	}

	/**
	 * We will not pass the client_id and client_secret in Authorization Header. Instead we will
	 * send them as request parameters.
	 * @param security
	 * @throws Exception
	 */
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.allowFormAuthenticationForClients();
	}

	/**
	 * We are providing a custom logic to generate access_token. Otherwise
	 * Spring reuses previously generated key and we did not want it.
	 *
	 * @return
	 */
	@Bean
	public TokenStore tokenStore() {
		return new JdbcTokenStore(dataSource);
	}
}
