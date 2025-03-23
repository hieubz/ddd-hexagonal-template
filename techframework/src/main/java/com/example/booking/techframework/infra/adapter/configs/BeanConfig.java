package com.example.booking.techframework.infra.adapter.configs;

import com.example.booking.application.ports.inbound.commandservices.BookingCommandInboundPort;
import com.example.booking.application.ports.outbound.repositories.persistence.BookingRepositoryOutboundPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Initialize BookingCommandInboundPort bean here to avoid using Spring framework in the Application module
 */
@Configuration
@ComponentScan(basePackages = {"com.example.booking.techframework"})
public class BeanConfig {

  @Bean
  BookingCommandInboundPort bookingCommandInboundPort(final BookingRepositoryOutboundPort bookingRepositoryOutboundPort) {
    return new BookingCommandInboundPort(bookingRepositoryOutboundPort);
  }
}
