package com.example.mailproject.controller;

import com.example.mailproject.model.MailInfo;
import com.example.mailproject.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    MailService mailService;
    @PostMapping("/mails/{mail}")
    public String mailSend(@PathVariable("mail") String mail, @RequestBody MailInfo mailInfo){
        return mailService.mailsend(mail,mailInfo);
    }
}
