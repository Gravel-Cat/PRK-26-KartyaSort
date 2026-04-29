package hu.nye.progkorny.config;

import hu.nye.progkorny.Database;
import hu.nye.progkorny.MySQLDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "hu.nye.progkorny")
public class AppConfig {
    @Bean
    public Database mySQLDatabase() {
        return new MySQLDatabase();
    }
}
