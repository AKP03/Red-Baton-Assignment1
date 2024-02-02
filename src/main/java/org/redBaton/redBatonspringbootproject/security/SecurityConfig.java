package org.redBaton.redBatonspringbootproject.security;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Bean
    public HttpFirewall defaultHttpFirewall() {
        return new DefaultHttpFirewall();
    }
}
