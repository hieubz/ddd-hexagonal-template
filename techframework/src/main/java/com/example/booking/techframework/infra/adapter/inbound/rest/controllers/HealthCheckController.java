package com.example.booking.techframework.infra.adapter.inbound.rest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

  @GetMapping("/")
  public String ping() {
    return "pong";
  }
}
