package entities.concretes;

import entities.abstracts.Notification;

public class EmailNotification implements Notification {
    @Override
    public String sendNotification() {
        return "Email gonderildi ";

    }
}
