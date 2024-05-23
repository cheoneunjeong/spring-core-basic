package hello.demo.discount;

import hello.demo.Member.Member;

public interface DIscountPolicy {

    /**
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
