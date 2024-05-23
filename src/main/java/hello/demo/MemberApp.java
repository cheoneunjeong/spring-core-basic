package hello.demo;

import hello.demo.Member.Grade;
import hello.demo.Member.Member;
import hello.demo.Member.MemberService;
import hello.demo.Member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("new memberA = " + memberA);
        System.out.println("findMember = " + findMember);
    }
}
