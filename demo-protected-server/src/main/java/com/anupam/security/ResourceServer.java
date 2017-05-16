package com.anupam.security;

/**
 * Created by ac-agogoi on 5/16/17.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * Resource Server. The resource server authorizes the REST urls based on
 * the access_token received from {@link AuthServer}
 *
 * @author brisatc186.gogoi
 */
@Configuration
@EnableResourceServer
public  class ResourceServer extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId("SECURED_RESOURCE");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/ping").authenticated();
    }
}
