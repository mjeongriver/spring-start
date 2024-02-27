package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //null을 반환하는 것 보다 Optional로 감싸서 반환하는 것이 좋다.
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
