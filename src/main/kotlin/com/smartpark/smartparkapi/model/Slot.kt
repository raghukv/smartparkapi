package com.smartpark.smartparkapi.model

import com.smartpark.smartparkapi.constants.SlotStatus
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Slot(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val slot_id: Int = 0,

    val loc_id: Int = 0,

    @Column(nullable = false)
    val slot_number: String,

    @Column(nullable = false)
    val slot_status: SlotStatus = SlotStatus.OPEN,

    @Column
    val slot_floor: String
)