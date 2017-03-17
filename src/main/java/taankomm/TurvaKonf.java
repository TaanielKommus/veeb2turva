package taankomm;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class TurvaKonf extends WebSecurityConfigurerAdapter{
  @Override
  protected void configure(HttpSecurity http) throws Exception{
      http.authorizeRequests().antMatchers("/algus").permitAll().
      anyRequest().authenticated();
  }
}
