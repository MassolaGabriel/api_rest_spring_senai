package swagger.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http
	        .httpBasic(withDefaults())
	        .authorizeHttpRequests(authz -> authz
	        	.requestMatchers("/api/publico").permitAll()
	            .requestMatchers("/api/usuarios/**").hasRole("USER")  
	            .anyRequest().hasAnyRole("ADMIN", "USER") 
	        )
	        .csrf(csrf -> csrf.disable());
	    return http.build();
	}
	 
	 @Bean
	    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
	        UserDetails user1 = User.withUsername("user1")
	            .password(passwordEncoder.encode("senha1"))
	            .roles("USER")
	            .build();

	        UserDetails admin = User.withUsername("admin")
	            .password(passwordEncoder.encode("senha2"))
	            .roles("ADMIN")
	            .build();

	        return new InMemoryUserDetailsManager(user1, admin);
	    }
}
