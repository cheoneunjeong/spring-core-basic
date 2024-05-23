package hello.demo;

import hello.demo.Member.Grade;
import hello.demo.Member.Member;
import hello.demo.Member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("new memberA = " + memberA);
        System.out.println("findMember = " + findMember);
    }
}
