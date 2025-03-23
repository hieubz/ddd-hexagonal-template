package com.example.booking.techframework.infra.adapter.inbound.rest.controllers;

import com.example.booking.application.ports.inbound.commandservices.BookingCommandInboundPort;
import com.example.booking.techframework.infra.adapter.inbound.rest.requests.BookingRequest;
import com.example.booking.techframework.infra.adapter.inbound.rest.requests.BookingResponse;
import com.example.booking.techframework.infra.adapter.mapper.BookingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bookings")
@RequiredArgsConstructor
public class BookingController {

  private final BookingCommandInboundPort bookingCommandInboundPort;

  private final BookingMapper mapper;

  @PostMapping(
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingRequest request) {
    bookingCommandInboundPort.save(mapper.toBookingDomainEntity(request));
    return ResponseEntity.ok().build();
  }
}
