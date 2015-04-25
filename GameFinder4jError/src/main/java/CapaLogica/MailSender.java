package CapaLogica;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {

    public void enviaCorreo(String Nombre,String Destinatario){
        
        String from = "gfinder4j@gmail.com";//change accordingly
        final String username = "gfinder4j@gmail.com";//change accordingly
        final String password = "CursoBases2";//change accordingly

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(Destinatario));

            // Set Subject: header field
            message.setSubject("Cuenta de Game Finder!");

            // Now set the actual message
            message.setText("Bienvenido a GameFinder4j muchas gracias por ser parte de nuestro"
                    + " equipo de gamers, su nombre de usuario es "+ Nombre);

            // Send message
            Transport.send(message);

            System.out.println("Envio exitoso");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        MailSender ms = new MailSender();
        ms.enviaCorreo("Blkfx", "ldflores92@gmail.com");
    }
}
