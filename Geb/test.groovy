import geb.spock.GebSpec

class test extends GebSpec {

    def searchForPhraseTest(){
        given: "I am on testerzy.pl"
        go "http://testerzy.pl"

        when: "I search for a phrase"
        $("#mod-search-searchword").value("hackathon dev qa")
        $(".button").click()

        then: "I see correct search results"
        String text = ($(".result-title").text())
        assert $(".result-title", text: contains("Hackathon"))
    }
}
