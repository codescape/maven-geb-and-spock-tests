package specs 

import geb.spock.GebSpec

class SimpleGebSpec extends GebSpec {
    def "Geb documentation page should be accessible"() {
        when:
        go "http://www.gebish.org/manual/current/"
        
        then:
        $("h1").text() == "The Book Of Geb"
    }
}