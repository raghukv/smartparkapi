package com.smartpark.smartparkapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["com.smartpark"])
@EnableJpaRepositories
class SmartparkapiApplication

fun main(args: Array<String>) {
	runApplication<SmartparkapiApplication>(*args)
}
