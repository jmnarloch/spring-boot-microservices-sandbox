package com.sample.authentication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

/**
 *
 */
@Configuration
@EnableGlobalAuthentication
public class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {

        // @formatter:off
        auth.inMemoryAuthentication()
                    .withUser("j.doe")
                        .password("password")
                        .roles("USER", "ADMIN")
                .and()
                    .withUser("j.smith")
                        .password("password")
                        .roles("USER", "ADMIN");
        // @formatter:on
    }

}
