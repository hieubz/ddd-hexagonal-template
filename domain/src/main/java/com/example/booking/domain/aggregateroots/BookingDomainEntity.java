package com.example.booking.domain.aggregateroots;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class BookingDomainEntity {
  private long id;
  private long userId;
  private long totalAmount;
  private String pickUpAddress;
  private String dropOffAddress;
  private LocalDateTime createdOn;
}
