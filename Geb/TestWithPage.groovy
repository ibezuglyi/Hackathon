import geb.spock.GebSpec

class TestWithPage extends GebSpec{

    def test(){

        HomePage homePage = new HomePage()

        given: "I am on testerzy.pl"
        homePage = to HomePage

        when: "I search for a phrase"
        homePage.search("hackathon dev qa")

        then: "I see correct search results"
        String text = ($(".result-title").text())
        assert $(".result-title", text: contains("Hackathon"))
    }
}
