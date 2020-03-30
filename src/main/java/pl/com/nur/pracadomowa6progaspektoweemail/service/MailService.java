package pl.com.nur.pracadomowa6progaspektoweemail.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private JavaMailSender javaMailSender; // 1

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendSimpleEmail(String to, String subject, String content) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setFrom("Akademia Springa <akademia.springa@interia.pl>");
        msg.setSubject(subject);
        msg.setText(content);

        javaMailSender.send(msg);
    }



}
