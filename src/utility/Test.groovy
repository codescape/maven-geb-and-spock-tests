package specs

import spock.lang.Specification

class SimpleSpockSpec extends Specification {
    def "Strings should return their size"() {
        expect:
        name.size() == size
        
        where:
        name        | size
        "Spock"     | 5
        "Geb"       | 3
        "Maven"     | 5
        "Groovy"    | 6
        ""          | 0
    }
}
