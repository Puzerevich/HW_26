package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

public class WebConfig {
    @Bean
    public Controller orderController() {
        return new Controller();
    }
}
