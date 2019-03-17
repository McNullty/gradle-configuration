package hr.mlade.cikara.gradle

import spock.lang.Specification

class GroovyTestingClassSpecification extends Specification {
    def "Add"() {
        given: 'class under test'
        GroovyTestingClass gtc = new GroovyTestingClass()

        when: 'add is called'
        def result = gtc.add(2,2)

        then: 'result should be 4'
        result == 4
    }

    def "Subtract"() {
        given: 'class under test'
        GroovyTestingClass gtc = new GroovyTestingClass()

        when: 'subtract is called'
        def result = gtc.subtract(2,2)

        then: 'result should be 0'
        result == 0
    }
}
