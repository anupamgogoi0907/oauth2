package com.anupam;

import org.mule.api.MuleContext;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

/**
 * Created by ac-agogoi on 9/13/17.
 */
public class Main {
    public static void main(String[] args) throws Exception
    {
        DefaultMuleContextFactory defaultMuleContextFactory=new DefaultMuleContextFactory();
        SpringXmlConfigurationBuilder springXmlConfigurationBuilder=new SpringXmlConfigurationBuilder("authorization-code.xml");
        MuleContext muleContext=defaultMuleContextFactory.createMuleContext(springXmlConfigurationBuilder);
        muleContext.start();

    }
}
