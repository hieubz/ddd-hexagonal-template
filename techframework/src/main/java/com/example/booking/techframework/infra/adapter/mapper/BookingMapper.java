package com.example.booking.techframework.infra.adapter.mapper;

import com.example.booking.domain.aggregateroots.BookingDomainEntity;
import com.example.booking.techframework.infra.adapter.inbound.rest.requests.BookingRequest;
import com.example.booking.techframework.infra.adapter.outbound.repositories.mysql.entities.BookingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {

  @Mapping(target = "createdOn", ignore = true)
  BookingDomainEntity toBookingDomainEntity(BookingRequest request);

  BookingEntity toBookingJPAEntity(BookingDomainEntity entity);

  List<BookingDomainEntity> toBookingDomainEntity(List<BookingEntity> entities);
}
