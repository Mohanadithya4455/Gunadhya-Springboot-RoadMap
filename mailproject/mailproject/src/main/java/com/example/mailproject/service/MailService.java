package com.example.mailproject.service;

import com.example.mailproject.model.MailInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String fromMail;
    public String mailsend(String mail, MailInfo mailInfo){
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom(fromMail);
        simpleMailMessage.setTo(mail);
        simpleMailMessage.setText(mailInfo.getMessage());
        simpleMailMessage.setSubject(mailInfo.getSubject());
        javaMailSender.send(simpleMailMessage);
        return "Mail send successfully";
    }
}

