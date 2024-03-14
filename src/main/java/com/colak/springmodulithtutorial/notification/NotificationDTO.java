package com.colak.springmodulithtutorial.notification;

import java.time.LocalDateTime;


public record NotificationDTO(
        String productName,
        String format,
        LocalDateTime date) {
}
