package cn.mediinfo.javastackspringbootstarter.config;

import cn.mediinfo.javastackspringbootstarter.model.DemoProperties;
import cn.mediinfo.javastackspringbootstarter.service.TestService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnProperty(name = "java.starter.enabled",havingValue = "true")
public class TestServiceAutoConfiguration {

    private final DemoProperties  properties;
    public TestServiceAutoConfiguration(DemoProperties properties) {
        this.properties = properties;
    }

    @Bean
    public TestService demo() {
        return new TestService(this.properties.getMessage());
    }
}
