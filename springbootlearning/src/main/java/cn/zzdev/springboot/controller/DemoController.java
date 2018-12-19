package cn.zzdev.springboot.controller;

import cn.zzdev.springboot.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个springboot应用
 *
 * @author oKong
 */


//@RestController = @Controller + @ResponseBody 默认直接返回json
@RestController
public class DemoController {

    @Value("${blog.address}")
    String address;

    @Value("${blog.author}")
    String author;

    @Value("${blog.desc}")
    String desc;

    @Autowired
    Config config;

    @RequestMapping("/")
    public Map<String, Object> demo() {
        Map<String, Object> map = new HashMap<>();
        map.put("desc", desc);
        map.put("config", config);
        return map;
    }
}
