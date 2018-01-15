package io.pivotal.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloAppApplication.class, args);
  }

//  @Bean
  public HelloService helloService() {
    return new ConsoleHelloService("Hello", "!");
  }

}
