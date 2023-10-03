package com.smartpark.smartparkapi.model

import javax.persistence.*

@Entity
data class Customer(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val cust_id: Int,

    @Column(nullable = false)
    val cust_fName: String,

    @Column(nullable = false)
    val cust_lName: String,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "cust_id")
    val vehicles: MutableList<Vehicle> = mutableListOf(),

    @Column(nullable = false)
    val cust_address: String
)