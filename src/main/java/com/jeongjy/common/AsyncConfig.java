package com.jeongjy.common;

import java.util.concurrent.Executor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class AsyncConfig {
  @Bean
  public Executor asyncThreadTaskExecutor() {
    ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
    threadPoolTaskExecutor.setCorePoolSize(3);
    threadPoolTaskExecutor.setMaxPoolSize(30);
    threadPoolTaskExecutor.setQueueCapacity(10);
    threadPoolTaskExecutor.setThreadNamePrefix("Async-");
    threadPoolTaskExecutor.initialize();
    return threadPoolTaskExecutor;
  }
}