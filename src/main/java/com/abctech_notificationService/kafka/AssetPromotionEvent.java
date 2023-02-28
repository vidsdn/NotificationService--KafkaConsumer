package com.abctech_notificationService.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetPromotionEvent {

    private String message;
    private String status;
    private Long programId;
}