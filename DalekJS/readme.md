# DalekJS
- Oficjalna strona narzędzia: [http://dalekjs.com/](http://dalekjs.com/). Zachęcamy do zapoznania się z dokumentacją do tego narzędzia oraz obejrzenia [video](https://vimeo.com/71466029) od twórców tego narzędzia  
- DalekJs jest oparty o NodeJs, więc najpierw musisz zainstalować NodeJs.

## Nodejs
- Pobierz [windows installer](https://nodejs.org/download/).
- Uruchom installer.
- Wybierz NPM w wizardzie.
- Uruchom komputer ponownie.
- Upewnij się, że zmienna środowiskowa PATH zawiera ścieżkę do node. Pamiętaj, że u Ciebie to może być inna ścieżka.
- Uruchom wiersz poleceń z uprawnieniami administratora.

## DalekJS
- Za pomocą menedżera pakietów zainstaluj dalekJs, uruchom w wierszu poleceń:

```npm install dalek-cli –g```

- Stwórz katalog, w którym planuesz umieścić test, np. dalek-tests i przejdź do tego katologu.
- Zainstaluj DalekJS

```npm install dalekjs --save-dev```

- Napisz test i zapisz od pliku [my_first_test.js](my_first_test.js)
- Uruchom test, w linii poleceń wejdź do katalogu gdzie umieściłeś plik z testem i wywołaj

```dalek my_first_test.js```

 my_first_test to nazwa pliku
