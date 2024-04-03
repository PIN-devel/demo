package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  @Value("${server.port}")
  private String serverPort;

  @GetMapping("/")
  public String getDemo() {
    return "Hello World!3 port:" + serverPort;
  }

}
