package br.edu.ifce.mn.ads.ifproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("public")
    public String publico() {
        return "publico";
    }

    @GetMapping("my-user")
    public String privado() {
        return "privado";
    }

    @GetMapping("admin")
    public String admin() {
        return "admin";
    }
}
