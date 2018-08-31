package com.github.lostizalith.griotgard

import java.util.*
import kotlin.collections.ArrayList

class GroupEntity {
    val id: UUID = UUID.randomUUID()
    var name: String = String()
    var members: List<MemberEntity> = ArrayList()
}
