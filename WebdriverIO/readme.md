# WebdriverIO
- Oficjalna strona narzędzia: http://webdriver.io/. Zachęcamy do zapoznania się z dokumentacją do tego narzędzia.
- WebdriverIO jest oparty o NodeJs, więc najpierw musisz zainstalować NodeJs.

## Nodejs
- Pobierz [windows installer](https://nodejs.org/download/).
- Uruchom installer.
- Wybierz NPM w wizardzie.
- Uruchom komputer ponownie.
- Upewnij się, że zmienna środowiskowa PATH zawiera ścieżkę do node. Pamiętaj, że u Ciebie to może być inna ścieżka.
- Uruchom wiersz poleceń z uprawnieniami administratora.

## WebdriverIO
- Stwórz katalog do testów i przejdź do tego katalogu
- Pobierz [http://selenium-release.storage.googleapis.com/2.45/selenium-server-standalone-2.45.0.jar](http://selenium-release.storage.googleapis.com/2.45/selenium-server-standalone-2.45.0.jar) 
- Upewnij się, że masz zainstalowaną i skonfigurowaną poprawnie JAVĘ [patrz rozdział instalacja JAVA dla [GEB](../Geb/readme.md)]
- Ważne jest, żeby dodać ścieżkę do JAVA w zmiennej środowiska PATH. Pamiętaj o tym, że na Twoim komputerze to może być inna ścieżka.
- Uruchom serwer selenium:

```java -jar selenium-server-standalone-2.45.0.jar```

- Aby zainstalować webdriverio uruchom w wierszu poleceń:

```npm install webdriverio ```

- Napisz pierwszy test i zapisz go do pliku [test.js](test.js)

- Uruchom test wpisując w wierszu poleceń:

```node test.js```
