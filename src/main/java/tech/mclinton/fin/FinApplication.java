package tech.mclinton.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import tech.mclinton.fin.repository.HealthRepository;

@SpringBootApplication
@EnableMongoRepositories
public class FinApplication {

    @Autowired
    HealthRepository healthRepository;

    public static void main(String[] args) {
        SpringApplication.run(FinApplication.class, args);
    }

}
