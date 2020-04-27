package fun.happyhacker.configrefresh.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class ValueConfig {
    @Value(value = "${foo.bar}")
    private String bar;
}
