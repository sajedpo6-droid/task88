package com.example.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    private final MessageSender sender;

    public AlertService(@Qualifier("smsSender") MessageSender sender) {
        this.sender = sender;
    }

    public void alert(String user, String message) {
        sender.send(user, message);
    }
}