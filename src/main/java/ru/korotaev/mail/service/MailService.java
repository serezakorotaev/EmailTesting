package ru.korotaev.mail.service;

import ru.korotaev.mail.model.Mail;

public interface MailService {
    void sendMail(Mail mail);
}
