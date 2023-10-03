package com.smartpark.smartparkapi.model

import javax.persistence.*

@Entity
data class Location constructor(

    @Column(nullable = false)
    var loc_name: String? = null,

    @Column(nullable = false)
    var loc_address: String? = null,

    @Column(nullable = false)
    var loc_pincode : String? = null,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "loc_id")
    var slots : MutableList<Slot>? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val loc_id: Int?=null,

) {

}