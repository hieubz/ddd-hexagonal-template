package com.example.booking.techframework.infra.adapter.outbound.repositories.mysql;

import com.example.booking.techframework.infra.adapter.outbound.repositories.mysql.entities.BookingEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Dummy repository => should be an interface and extend JpaRepository
public class BookingRepository {

  List<BookingEntity> findAll() {
    return List.of(BookingEntity.builder().build());
  }

  BookingEntity save(BookingEntity entity) {
    // dummy save method
    return entity;
  }
}
