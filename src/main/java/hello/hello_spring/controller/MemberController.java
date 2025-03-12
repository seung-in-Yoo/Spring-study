package hello.hello_spring.controller;


import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 생성자를 통한 주입 방법
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /* 새터 주입 방법
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
    */
}
