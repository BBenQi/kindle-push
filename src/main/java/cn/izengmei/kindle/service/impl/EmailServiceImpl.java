package cn.izengmei.kindle.service.impl;

import cn.izengmei.kindle.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String emailAdress, String filePath) throws Exception  {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("466659581@qq.com");
        mimeMessageHelper.setTo(emailAdress);
        mimeMessageHelper.setSubject("Kindle书籍发送");

        mimeMessageHelper.setText("Kindle推送系统");

        FileSystemResource fileSystemResource = new FileSystemResource(new File(filePath));
        String[] filePathArr = filePath.split("/");
        mimeMessageHelper.addAttachment(filePathArr[filePathArr.length-1],fileSystemResource);
        javaMailSender.send(mimeMessage);
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("466659581@qq.com");
//        message.setTo("1406235107@qq.com");
//        message.setSubject("简单邮件测试");
//        message.setText("邮件内容");
//        javaMailSender.send(message);
    }


}
