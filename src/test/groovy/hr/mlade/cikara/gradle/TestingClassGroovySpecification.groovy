package hr.mlade.cikara.gradle

import spock.lang.Specification

class TestingClassGroovySpecification extends Specification {
    def "Add"() {
        given: 'class under test'
        TestingClass tc = new TestingClass()

        when: 'add is called'
        def result = tc.add(3, 4)

        then: 'result should be 7'
        result == 7
    }
}
