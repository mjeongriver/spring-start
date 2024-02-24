package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    //컴포넌트 스캔과 자동 의존관계 설정
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
