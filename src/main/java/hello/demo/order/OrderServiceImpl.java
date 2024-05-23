package hello.demo.order;

import hello.demo.Member.Member;
import hello.demo.Member.MemberRepository;
import hello.demo.Member.MemoryMemberRepository;
import hello.demo.discount.DiscountPolicy;
import hello.demo.discount.FixDiscountPolicy;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
