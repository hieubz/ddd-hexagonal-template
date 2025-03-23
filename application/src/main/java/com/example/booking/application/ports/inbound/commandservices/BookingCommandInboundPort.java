package com.example.booking.application.ports.inbound.commandservices;

import com.example.booking.application.ports.outbound.repositories.persistence.BookingRepositoryOutboundPort;
import com.example.booking.domain.aggregateroots.BookingDomainEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BookingCommandInboundPort {

  private final BookingRepositoryOutboundPort bookingRepositoryOutboundPort;

  public BookingCommandInboundPort(BookingRepositoryOutboundPort bookingRepositoryOutboundPort) {
    this.bookingRepositoryOutboundPort = bookingRepositoryOutboundPort;
  }

  public void save(BookingDomainEntity entity) {
    log.info("Saving BookingDomainEntity");
    bookingRepositoryOutboundPort.save(entity);
  }
}
