package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    public Member findMemberById(Long id) {
        Optional<Member> member = memberRepository.findById(id);
        return member.orElse(null);
    }

    public Member updateMember(Long id, Member memberDetails) {
        Optional<Member> optionalMember = memberRepository.findById(id);
        if (optionalMember.isPresent()) {
            Member existingMember = optionalMember.get();
            existingMember.setFirstName(memberDetails.getFirstName());
            existingMember.setLastName(memberDetails.getLastName());
            existingMember.setGender(memberDetails.getGender());
            existingMember.setMobileNumber(memberDetails.getMobileNumber());
            existingMember.setEmail(memberDetails.getEmail());
            existingMember.setMedicalHistory(memberDetails.getMedicalHistory());
            existingMember.setRegistrationDate(memberDetails.getRegistrationDate());
            existingMember.setSubscriptionType(memberDetails.getSubscriptionType());
            existingMember.setAmount(memberDetails.getAmount());
            existingMember.setFeeStatus(memberDetails.getFeeStatus());
            existingMember.setBatch(memberDetails.getBatch());
            return memberRepository.save(existingMember);
        } else {
            return null;
        }
    }

    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}
