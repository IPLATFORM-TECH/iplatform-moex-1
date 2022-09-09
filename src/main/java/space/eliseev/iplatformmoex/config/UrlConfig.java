package space.eliseev.iplatformmoex.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:url-config.yml")
public class UrlConfig {

    @Value("${feign.engine.url}")
    private String engineUrl;

    @Value("${feign.securities.url}")
    private String securitiesUrl;

}
