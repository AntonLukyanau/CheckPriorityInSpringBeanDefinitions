package pack;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    public MyBean myBeanConfig() {
        return new MyBean("from", "config");
    }

}
