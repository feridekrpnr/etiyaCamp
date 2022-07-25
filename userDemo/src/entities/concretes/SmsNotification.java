package entities.concretes;

import entities.abstracts.Notification;

public class SmsNotification implements Notification {
    @Override
    public String sendNotification() {
        return "SMS gonderildi ";
    }
}
