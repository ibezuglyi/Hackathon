# GEB

1. Zainstaluj IntelliJ IDEA Community Edition (https://www.jetbrains.com/idea/download/)
2. Zainstaluj Jave JDK
- instalka do pobrania tu (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- dodaj zmienną środowiskową JAVA_HOME  i dopisz ją też do zmiennej PATH (pamiętaj aby nie kasować dotychczasowej zawartości PATH!)
3. Pobierz i zainstaluj Maven
- pobierz tu (https://maven.apache.org/download.cgi)
- instrukcje instalacji tu (https://maven.apache.org/download.cgi#Installation)
4. Uruchom IntellIJ, załaduj defaultowe ustawienia i wybierz „New Project”
5. Wybierz typ projektu Maven, następnie wskaż JDK w Project SDK
6. Kliknij Next, wpisz GroupId, ArftifactId (tu wyjaśnienie co to jest (https://maven.apache.org/guides/mini/guide-naming-conventions.html) oraz nazwę projektu
7. W pliku [pom.xml](pom.xml) dodaj sekcję ```<dependencies></dependencies>``` (przed ```</project>```)
8. Kliknij prawym na [pom.xml](pom.xml) i wybierz: Maven > Reimport
9. Kliknij prawym na java w katalogu test i dodaj nową klasę Groovy
10. I napisz swój pierwszy [test](test.groovy)
11. Aby uruchomić test kliknij prawy na test i kliknij Run

Zobacz również przykłady w [HomePage](HomePage.groovy) i [TestWithPage](TestWithPage.groovy)
