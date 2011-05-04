package specs

import spock.lang.Specification

class SimpleSpockSpec extends Specification {
    def "Zeichenlänge von Strings"() {
        expect:
        name.size() == size
        
        where:
        name        | size
        "Spock"     | 5
        "Geb"       | 3
        "Maven"     | 5
        "Groovy"    | 6
    }
}
