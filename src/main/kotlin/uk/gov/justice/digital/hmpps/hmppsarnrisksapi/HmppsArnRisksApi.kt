package uk.gov.justice.digital.hmpps.hmppsarnrisksapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication()
class HmppsArnRisksApi

fun main(args: Array<String>) {
  runApplication<HmppsArnRisksApi>(*args)
}
