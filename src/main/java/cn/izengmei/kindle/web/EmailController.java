package cn.izengmei.kindle.web;

import cn.izengmei.kindle.model.SendVo;
import cn.izengmei.kindle.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@CrossOrigin
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public void sendEmail(@RequestBody SendVo sendVo) throws Exception {
        this.emailService.sendEmail(sendVo.getUserEmail(),sendVo.getFilePath());
    }

    @RequestMapping("/get")
    public SendVo getVo(){
        return new SendVo("email","path");
    }
}
