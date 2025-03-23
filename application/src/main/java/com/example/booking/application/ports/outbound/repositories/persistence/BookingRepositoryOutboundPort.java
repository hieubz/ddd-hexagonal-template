package com.example.booking.application.ports.outbound.repositories.persistence;

import com.example.booking.domain.aggregateroots.BookingDomainEntity;

import java.util.List;

public interface BookingRepositoryOutboundPort {

  List<BookingDomainEntity> findAll();

  void save(BookingDomainEntity entity);
}
