package org.management.employee_database_management.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class MySecurityConfig {
    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;
    private final LogoutHandler logoutHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf((csrf)->csrf.disable())
                .authorizeHttpRequests()
                .requestMatchers("/api/users/**")
                .permitAll();
//
//                .and()
//                .authorizeRequests()
//                .antMatchers("/api/users/**").permitAll()
//                .antMatchers("/hr/**").hasAuthority("HR")
//                .antMatchers("/manager/**").hasAuthority("Manager")
//                .antMatchers("/devops/**").hasAuthority("DevOps")
//                .antMatchers("/development/**").hasAuthority("Development")
//                .antMatchers("/infrastructure/**").hasAuthority("Infrastructure")
//                .antMatchers("/cto/**").hasAuthority("CTO")
//                .antMatchers("/appsupport/**").hasAuthority("AppSupport")
//                .antMatchers("/accountant/**").hasAuthority("Accountant")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll();

    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
