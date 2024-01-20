package com.zyq.boot.comtroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody //将java对象转为文本或json数据类型，可以与controller注解合为@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello SpringBoot3.";
    }
}
