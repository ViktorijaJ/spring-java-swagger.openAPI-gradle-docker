package com.server.shopserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//nereikia nurodyti kontroleryje consumes dalies prie veiksmu
@EnableWebMvc
public class BookServerApplication {
    public static void main(String[] args) {
    	SpringApplication.run(BookServerApplication.class, args);
    }
}
