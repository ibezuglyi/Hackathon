import geb.Page

class HomePage extends Page {

    static url ="http://testerzy.pl"
    static at = { searchInput.displayed == true }
    static  content = {
        searchInput {$("#mod-search-searchword")}
        searchSubmitButton {$(".button")}
    }

    void search(String phrase){
        searchInput.value(phrase)
        searchSubmitButton.click()
    }

}
