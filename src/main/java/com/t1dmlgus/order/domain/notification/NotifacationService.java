package com.t1dmlgus.order.domain.notification;

public interface NotifacationService {

    void sendEmail(String email, String title, String description);
    void sendKakao(String phoneNo, String description);
}
