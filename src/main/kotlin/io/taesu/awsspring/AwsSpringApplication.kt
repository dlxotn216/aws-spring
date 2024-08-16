package io.taesu.awsspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class AwsSpringApplication

fun main(args: Array<String>) {
    runApplication<AwsSpringApplication>(*args)
}
