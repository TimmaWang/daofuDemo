package com.daofu.demo.service;

@Sl4j
@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMessage(String to, String subject, String text){
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("xxxx@xx.com");
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);
            mailSender.send(message);
        }catch (Exception e){
            log.error("sendMessage error.",e);
        }

    }
}
