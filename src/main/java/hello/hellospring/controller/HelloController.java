package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
        public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; //resources/templates/hello.html 뷰 리졸버가 화면을 찾아서 처리한다.
    }
}
