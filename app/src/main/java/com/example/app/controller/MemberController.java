package com.example.app.controller;

import com.example.app.service.MemberService;
import com.example.app.vo.MemberReq;
import com.example.domain.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MemberController {

  private final MemberService memberService;

  @PostMapping("/members")
  public Member save(@RequestBody MemberReq memberReq){
    return  memberService.save(memberReq);
  }

  @GetMapping("/members")
  public List<Member> findAll(){
   return memberService.findAll();
  }
}
