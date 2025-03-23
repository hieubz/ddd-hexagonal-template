package com.example.booking.techframework.infra.adapter.inbound.rest.requests;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BookingRequest {
  private long userId;
  private long totalAmount;
  private String shippingAddress;
}
