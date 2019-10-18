package by.tms.boot.configs;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Configuration
@Profile("dev")
public class DevConfig implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("DEV");
        System.out.println(Arrays.toString(environment.getActiveProfiles()));

    }
}
