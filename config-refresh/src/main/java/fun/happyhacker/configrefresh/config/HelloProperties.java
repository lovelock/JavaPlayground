package fun.happyhacker.configrefresh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "hello")
@Data
public class HelloProperties {

    private String bob;

    private String star;
}
