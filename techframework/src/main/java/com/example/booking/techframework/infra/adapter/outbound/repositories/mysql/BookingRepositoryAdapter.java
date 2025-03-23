package com.example.booking.techframework.infra.adapter.outbound.repositories.mysql;

import com.example.booking.application.ports.outbound.repositories.persistence.BookingRepositoryOutboundPort;
import com.example.booking.domain.aggregateroots.BookingDomainEntity;
import com.example.booking.techframework.infra.adapter.mapper.BookingMapper;
import com.example.booking.techframework.infra.adapter.outbound.repositories.mysql.entities.BookingEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingRepositoryAdapter implements BookingRepositoryOutboundPort {

  private final BookingRepository bookingRepository;
  private final BookingMapper mapper;

  @Override
  public List<BookingDomainEntity> findAll() {
    List<BookingEntity> entities = bookingRepository.findAll();
    return mapper.toBookingDomainEntity(entities);
  }

  @Override
  public void save(BookingDomainEntity entity) {
    // Transform Aggregate Root 's states into JPA Entity 's states before saving them into database
    bookingRepository.save(mapper.toBookingJPAEntity(entity));
  }
}
