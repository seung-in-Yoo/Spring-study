package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;


// 4가지 기능 만듬
public interface MemberRepository {
    <Member> Member save(Member member);

    Member save(Member member); // 멤버 저장
    Optional<Member> findById(Long id); // id와 name으로 찾아올수 있음
    Optional<Member> findMyName(String name);

    Optional<Member> findByName(String name);

    List<Member> findAll(); // 지금까지 저장된 모든 회원 리스트 반환
}
