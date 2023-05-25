package cn.mediinfo.javastackspringbootstarter.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "java.starter")
public class DemoProperties {
    private String message;
    private boolean enabled;
}
