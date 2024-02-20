package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
        public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; //resources/templates/hello.html 뷰 리졸버가 화면을 찾아서 처리한다.
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //응답 body에 return 내용을 직접 넣어준다. 페이지 소스 보기 하면 html 태그가 없다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) { //json 형태로 반환(key-value)
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //객체를 반환하면 json 형태로 반환된다.
    }

    static class Hello{
        private String name; //자바 bean 표준 방식

        public String getName() { //property 접근 방식
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
