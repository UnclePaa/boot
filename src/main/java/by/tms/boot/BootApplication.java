package by.tms.boot;

import by.tms.boot.model.CalcAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {

    @Autowired
    private CalcAction calcAction;

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        calcAction.run();
    }
}