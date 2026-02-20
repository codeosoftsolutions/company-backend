package com.codeo.company.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.codeo.company.security.JwtAuthFilter;

@Configuration
public class SecurityConfig {
	
	
	private final JwtAuthFilter jwtAuthFilter;

	public SecurityConfig(JwtAuthFilter jwtAuthFilter) {
	    this.jwtAuthFilter = jwtAuthFilter;
	}

   /* @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                        "/public/**",
                        "/admin/login",
                        "/admin/create"
                ).permitAll()
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults()); // ✅ REQUIRED

        return http.build();
    }*/
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

	    http
	        .csrf(csrf -> csrf.disable())
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers(
	                    "/public/**",
	                    "/admin/**",
	                    "/api/services",
	                    "/api/home"
	            ).permitAll()
	            .anyRequest().authenticated()
	        )
	        .addFilterBefore(
	                jwtAuthFilter,
	                UsernamePasswordAuthenticationFilter.class
	        )
	        .httpBasic(Customizer.withDefaults());

	    return http.build();
	}
	
	
	
	
	
}