package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {

            NotificationService notificationService =
                    context.getBean(NotificationService.class);
            notificationService.notifyUser("alice@example.com", "Your order has shipped!");

            AlertService alertService = context.getBean(AlertService.class);
            alertService.alert("+256700000000", "Security alert!");
        }
    }
}
