package com.smartpark.smartparkapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class SmartparkapiApplication

fun main(args: Array<String>) {
	runApplication<SmartparkapiApplication>(*args)
}
