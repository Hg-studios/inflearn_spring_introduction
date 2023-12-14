package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // 이름을 이렇게 만들면 다음과 쿼리를 알아서 짜줌
    // select m from Member m where m.name = ?

    @Override
    Optional<Member> findByName(String name);

}
