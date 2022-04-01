package com.cybage.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
@Override
public void configure(AuthenticationManagerBuilder auth) throws Exception
{
auth.inMemoryAuthentication().withUser("Ajay").password("1234").roles("USER");
}
@Bean
public PasswordEncoder getPasswordEncoder()
{
return NoOpPasswordEncoder.getInstance();
}

}