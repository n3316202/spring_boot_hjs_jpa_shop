package edu.hi.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hi.shop.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);    
}