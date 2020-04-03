package com.example

import org.junit.runner.RunWith
import org.mockito.Mockito
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import org.springframework.boot.SpringApplication
import spock.lang.Specification

@PrepareForTest([ SpringApplication, HelloworldApplication])
@RunWith(PowerMockRunner)
@PowerMockRunnerDelegate(Sputnik)
class HelloworldApplicationTest extends Specification {

    def helloworldApplication

    def setup() {
        helloworldApplication = new HelloworldApplication()
    }

    def "main"() {
        given:
        PowerMockito.mockStatic(SpringApplication)
        //_ indicates any argument in groovy spock
        Mockito.when(SpringApplication.run(_)).thenReturn(null)

        when:
        def exchange = helloworldApplication.main()

        then:
        exchange == null
    }

    def "Should be able to remove from list"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(0)

        then:
        list == [2, 3, 4]
    }
}
