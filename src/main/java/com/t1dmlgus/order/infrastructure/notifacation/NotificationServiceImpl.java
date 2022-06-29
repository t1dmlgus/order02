package com.t1dmlgus.order.infrastructure.notifacation;

import com.t1dmlgus.order.domain.notification.NotifacationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class NotificationServiceImpl implements NotifacationService {
    @Override
    public void sendEmail(String email, String title, String description) {
      log.info("sendEmail");
    }

    @Override
    public void sendKakao(String phoneNo, String description) {
        log.info("sendKakao");
    }
}
