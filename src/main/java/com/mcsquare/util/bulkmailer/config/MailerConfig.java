package com.mcsquare.util.bulkmailer.config;

//@Configuration
public class MailerConfig {

    /*@Value("${outlook.smtp.server}")
    private String smtpServer;
    @Value("${outlook.smtp.server}")
    private String port;
    @Value("${outlook.smtp.server}")
    private String userName;
    @Value("${outlook.smtp.server}")
    private String password;

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(smtpServer);
        mailSender.setPort(587);

        mailSender.setUsername(userName);
        mailSender.setPassword(password);

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }*/
}
