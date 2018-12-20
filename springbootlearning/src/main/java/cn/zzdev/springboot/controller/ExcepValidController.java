package cn.zzdev.springboot.controller;

import cn.zzdev.springboot.exception.CommonException;
import cn.zzdev.springboot.req.DemoReq;
import cn.zzdev.springboot.util.ValidatorUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
public class ExcepValidController {

    @GetMapping("/demo")
    public String demo() {
        throw new CommonException("01001", "发送异常");
    }

    @GetMapping("/demo/valid")
    public String demoValid(@Valid DemoReq req) {
        //手动校验
        ValidatorUtil.validate(req);
        return req.getCode() + "," + req.getName();
    }
}
