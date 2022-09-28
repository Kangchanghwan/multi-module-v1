package com.example.domain.member.sevice;

import com.example.domain.member.entity.Member;
import com.example.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberCrudService {

  private final MemberRepository memberRepository;

  public Member save(Member member) {
    return memberRepository.saveAndFlush(member);
  }

  @Transactional(readOnly = true)
  public List<Member> findAll() {
    return memberRepository.findAll();
  }
}
