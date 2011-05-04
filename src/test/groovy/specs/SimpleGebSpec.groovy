package specs 

import geb.spock.GebSpec

class SimpleGebSpec extends GebSpec {
    def "check geb documentation page"() {
        when:
        go "http://geb.codehaus.org/latest/manual/"
        
        then:
        $("h1.title").text() == "The Book Of Geb"
    }
}