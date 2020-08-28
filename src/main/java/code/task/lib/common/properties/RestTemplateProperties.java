package code.task.lib.common.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = RestTemplateProperties.PREFIX)
public class RestTemplateProperties {
    static final String PREFIX = "application.rest-template";

    private HttpClientConnectionPool httpClientConnectionPool;
    private RequestConfig requestConfig;

    @Getter
    @Setter
    public static class HttpClientConnectionPool {
        private Integer maxTotal;
        private Integer defaultMaxPerRoute;
    }

    @Getter
    @Setter
    public static class RequestConfig {
        private Integer connectionRequestTimeout;
        private Integer connectTimeout;
        private Integer socketTimeout;
        private Integer readTimeout;
    }
}
