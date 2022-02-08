package ru.korotaev.mail.controller;

import org.springframework.web.bind.annotation.*;
import ru.korotaev.mail.model.Mail;
import ru.korotaev.mail.service.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {

    public final MailService service;

    public MailController(MailService service) {
        this.service = service;
    }

    @GetMapping()
    public String test(@RequestParam String text) {
        return text;
    }

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Mail mail) {
        service.sendMail(mail);
        return "message sent";
    }
}
