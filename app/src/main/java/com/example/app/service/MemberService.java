package com.example.app.service;

import com.example.app.vo.MemberReq;
import com.example.domain.member.entity.Member;
import com.example.domain.member.sevice.MemberCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberCrudService memberService;

  public Member save(MemberReq memberReq){
    Member member = new Member();
    member.setName(memberReq.getName());
    return memberService.save(member);
  }

  public List<Member> findAll(){
   return memberService.findAll();
  }
}
