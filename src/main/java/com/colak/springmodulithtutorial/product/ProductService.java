package com.colak.springmodulithtutorial.product;


import com.colak.springmodulithtutorial.notification.NotificationDTO;
import com.colak.springmodulithtutorial.notification.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final NotificationService notificationService;

    public void create(ProductDTO productDTO) {
        NotificationDTO notificationDTO = new NotificationDTO(productDTO.name(), "SMS", LocalDateTime.now());
        notificationService.createNotification(notificationDTO);
    }
}
