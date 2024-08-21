package com.market.order;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryMessage {
    private UUID orderId;
    private UUID paymentId;

    private String userId;

    private Integer productId;
    private Integer productQuantity;

    private Integer payAmount;

    private String errorType;
}
