package specs 

import geb.spock.GebSpec

class SimpleGebSpec extends GebSpec {
    def "Geb documentation page should be accessible"() {
        when:
        go "http://geb.codehaus.org/latest/manual/"
        
        then:
        $("h1.title").text() == "The Book Of Geb"
    }
}