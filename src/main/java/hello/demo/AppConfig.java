package hello.demo;

import hello.demo.Member.MemberRepository;
import hello.demo.Member.MemberService;
import hello.demo.Member.MemberServiceImpl;
import hello.demo.Member.MemoryMemberRepository;
import hello.demo.discount.DiscountPolicy;
import hello.demo.discount.FixDiscountPolicy;
import hello.demo.discount.RateDiscountPolicy;
import hello.demo.order.OrderService;
import hello.demo.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
