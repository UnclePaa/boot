package by.tms.boot.configs;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile("prod")
public class ProdConfig implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("PROD");
    }
}
