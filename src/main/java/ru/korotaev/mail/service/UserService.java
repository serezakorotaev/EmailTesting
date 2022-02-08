package ru.korotaev.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.korotaev.mail.model.Mail;
import ru.korotaev.mail.model.User;
import ru.korotaev.mail.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository repository;
    private final MailService mailService;

    @Value("${spring.mail.username}")
    private String mailFrom;
    @Autowired
    public UserService(UserRepository repository , MailService mailService) {
        this.repository = repository;
        this.mailService = mailService;
    }


    public List<User> findAll() {
        return repository.findAll();
    }

    public void save(User user) {
        user.setPassword(UUID.randomUUID().toString());
        repository.save(user);
        Mail mail = convertMail(user);
        mailService.sendMail(mail);
    }

    private Mail convertMail(User user) {
        Mail mail = new Mail();
        mail.setMailSubject("Example letter - Welcome!");
        mail.setMailContent(buildMessage(user.getLogin(), user.getPassword()));
        mail.setMailFrom(mailFrom);
        mail.setMailTo(user.getMail());
        return mail;
    }

    private String buildMessage(String login , String password) {
        return "Learn How to send Email using Spring Boot!!!" +
                "\n\n" +
                "You login: " + login + "\n\n" +
                "You password: " + password +
                "\n\n" +
                "www.google.com";
    }
}
