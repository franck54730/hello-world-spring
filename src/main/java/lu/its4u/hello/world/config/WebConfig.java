package lu.its4u.hello.world.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Web configuration.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lu.its4u")
public class WebConfig extends WebMvcConfigurerAdapter {

}

