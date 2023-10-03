package com.smartpark.smartparkapi.model

import com.smartpark.smartparkapi.constants.VehicleType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Vehicle(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val vehicle_id: Int,

    @Column(nullable = false)
    val vehicle_number: String,

    @Column(nullable = false)
    val vehicle_color: String,

    @Column(nullable = false)
    val vehicleType: VehicleType = VehicleType.CAR
)