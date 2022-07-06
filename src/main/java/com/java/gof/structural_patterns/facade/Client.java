package com.java.gof.structural_patterns.facade;

public class Client {
    public static void main(String[] args) {
        MailSettings mailSettings = new MailSettings();
        mailSettings.setHost("127.0.0.1");
        MailSender mailSender = new MailSender(mailSettings);
        MailMessage message = new MailMessage();

        message.setFrom("taemin");
        message.setTo("martial");
        message.setSubject("오징어게임");
        message.setText("밖은 더 지옥이더라고..");

        mailSender.sendMail(message);
    }
}
