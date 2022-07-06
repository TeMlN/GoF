package com.java.gof.structural_patterns.facade;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {

    private final MailSettings mailSettings;

    public MailSender(MailSettings mailSettings) {
        this.mailSettings = mailSettings;
    }

    public void sendMail(MailMessage mailMessage) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", mailSettings.getHost());

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailMessage.getFrom()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailMessage.getTo()));
            message.setSubject(mailMessage.getSubject());
            message.setText(mailMessage.getText());

            Transport.send(message);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
