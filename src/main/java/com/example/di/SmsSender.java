package com.example.di;

import org.springframework.stereotype.Component;

@Component("smsSender")
public class SmsSender implements MessageSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS to " + recipient + ": " + message);
    }
}
