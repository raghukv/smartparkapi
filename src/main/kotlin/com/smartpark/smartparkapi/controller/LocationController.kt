package com.smartpark.smartparkapi.controller

import com.smartpark.smartparkapi.model.Location
import com.smartpark.smartparkapi.repository.LocationRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController()
@RequestMapping("/locations")
class LocationController(
    val locRepo : LocationRepository
    ) {


    @GetMapping
    fun getLocationsByPincode(@RequestParam pincodes: List<Integer>? = null) : MutableIterable<Location> {
        return locRepo.findAll()
    }

    @PostMapping
    fun addLocation() : ResponseEntity<Any>{
        var location = Location("testName", "testAddress", "testPin" )
        try {
            Either.Left
            locRepo.save(location)
        }catch(e: Exception){
            return ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return ResponseEntity(HttpStatus.CREATED)
    }
}