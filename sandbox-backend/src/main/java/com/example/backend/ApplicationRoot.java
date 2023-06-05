package com.example.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@SpringBootApplication
@EnableScheduling
public class ApplicationRoot implements ApplicationRunner {

  private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationRoot.class);

  public static void main(String[] args) {
    SpringApplication.run(ApplicationRoot.class, args);
  }

  public void run(ApplicationArguments args) {
    LOGGER.info("Hello World from run.");
  }
}
