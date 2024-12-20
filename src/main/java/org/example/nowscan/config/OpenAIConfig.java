package org.example.nowscan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OpenAIConfig {

    @Value("${openai.api.key}")
    private String apiKey;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((req, body, execution) -> {
            req.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            req.getHeaders().add("Authorization", "Bearer " + apiKey);
            return execution.execute(req, body);
        });

        return restTemplate;
    }

}
