package com.github.lostizalith.griotgard

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping(path = ["members"])
class MemberController {

    @GetMapping
    fun getMembers(): ResponseEntity<GroupEntity> {
        val memberParticipant1 = MemberEntity()
        memberParticipant1.name = "memberParticipant1"

        val memberParticipant2 = MemberEntity()
        memberParticipant2.name = "memberParticipant2"

        val memberOwner = MemberEntity()
        memberOwner.name = "OWNER"

        val groupEntity = GroupEntity()
        groupEntity.name = "GROUP"
        groupEntity.members = Arrays.asList(memberParticipant1, memberParticipant2, memberOwner)

        return ResponseEntity.ok().body(groupEntity)
    }
}
