package com.abctech_notificationService.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.abctech_notificationService.kafka.AssetPromotionEvent;
@Service
@Slf4j
public class AssetPromotionConsumer {
        @KafkaListener(
                topics = "${spring.kafka.topic.name}"
                ,groupId = "${spring.kafka.consumer.group-id}"
        )
        public void consume(AssetPromotionEvent event){
            log.info("Received Notification for Promotion Event - {} {}", event.getProgramId(),event.getStatus());

        }
}
