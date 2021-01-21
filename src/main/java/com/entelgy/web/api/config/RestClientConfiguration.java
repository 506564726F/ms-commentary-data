package com.entelgy.web.api.config;

import com.entelgy.web.api.client.proxy.CommentaryProxyInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RestClientConfiguration {

    @Value("${entelgy.commentary.url}")
    private String API_URL;

    @Bean
    CommentaryProxyInterface getCommentary() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(CommentaryProxyInterface.class);
    }
}
