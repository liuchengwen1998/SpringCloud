package com.lcw.web;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/getPort")
@RestController
public class GetPortController {

    @Value("${server.port}")
    String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }
}
