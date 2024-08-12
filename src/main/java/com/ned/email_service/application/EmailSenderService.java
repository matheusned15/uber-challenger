package com.ned.email_service.application;

import com.ned.email_service.adapters.EmailSenderGateway;
import com.ned.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService  implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway gateway){
        this.emailSenderGateway = gateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to,subject,body);
    }
}
