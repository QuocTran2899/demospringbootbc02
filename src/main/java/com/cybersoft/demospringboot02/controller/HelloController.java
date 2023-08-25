package com.cybersoft.demospringboot02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Annotation Định nghĩa đường dẫn
 * @Controller : Định nghĩa đường dẫn được dùng để trả ra nội dung html
 * @ResponseBody : trả nội dung kiểu String
 * @RestController : định nghĩa đường dẫn, nội dung trả về String chuyên dùng để viết API
 * Chỉ quét những Annotation cùng cấp
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("")
    public String hello(){
        return "Hello Spring Boot";
    }
    @GetMapping("/cybersoft")
    public String helloCybersoft(){
        return "Hello Cybersoft";
    }
}
