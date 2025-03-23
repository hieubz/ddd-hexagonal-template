package com.example.booking.techframework.infra.adapter.outbound.repositories.mysql.entities;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookingEntity {
  private long id;
  private long userId;
  private long totalAmount;
  private String pickUpAddress;
  private String dropOffAddress;
  private LocalDateTime createdOn;
}
