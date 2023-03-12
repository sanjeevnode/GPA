
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

    public static boolean send(String to, String from,String subject, String msg) {
            boolean flag =false;
        
            
            Properties properties =new Properties();
            properties.put("mail.smtp.auth", true);
            properties.put("mail.smtp.starttls.enable", true);
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            
            String username ="graphicalpassauthentication";
//            String pass="qfigicdwqhonvupa"; 
            String pass ="lsekxpgttscbjhqd";
            
            
            Session session = Session.getInstance(properties, new Authenticator(){
            
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username,pass);
            }
            
            });
                    
            try{
                Message message = new MimeMessage(session);
                
                message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
                message.setFrom(new InternetAddress(from));
                
                message.setSubject(subject); 
                message.setText(msg);
                
                Transport.send(message);
                
                flag=true;
       
            }
            catch(MessagingException e){
                System.out.print(e.getMessage());
            }
            
            
            
           return flag;
    }
}
