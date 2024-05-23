package hello.demo.order;

import hello.demo.Member.Member;
import hello.demo.Member.MemberRepository;
import hello.demo.Member.MemoryMemberRepository;
import hello.demo.discount.DIscountPolicy;
import hello.demo.discount.FixDiscountPolicy;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DIscountPolicy dIscountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = dIscountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
