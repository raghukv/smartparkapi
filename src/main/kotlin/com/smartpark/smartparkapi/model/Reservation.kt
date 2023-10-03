package com.smartpark.smartparkapi.model

import javax.persistence.*

@Entity
class Reservation(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val res_id: Int,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "slot", referencedColumnName = "slot_id")
    val slot:Slot,
    val loc_id:Int,
    val vehicle_id: Int,
    val vehicle_number: String,
    val vehicle_color: String,
    val cust_id:Int
) {
}