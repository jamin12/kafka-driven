package com.kafkadriven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaDrivenApplication

fun main(args: Array<String>) {
	runApplication<KafkaDrivenApplication>(*args)
}
