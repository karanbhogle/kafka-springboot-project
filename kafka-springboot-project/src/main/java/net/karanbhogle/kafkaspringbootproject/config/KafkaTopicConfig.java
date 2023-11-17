package net.karanbhogle.kafkaspringbootproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    NewTopic javaGuidesTopic() {
        return TopicBuilder.name("javaguides").build();
    }
}
