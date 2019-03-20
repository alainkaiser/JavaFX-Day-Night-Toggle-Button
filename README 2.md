# CUIE Assignment 1

## Bearbeitet von
 - Alain Kaiser
 - Pascal Knecht
 
## Abgabe
- Mittwoch, 20.03.2019, 12:00 Uhr
- Die Abgabe erfolgt durch ein "Push" auf den Master-Branch Ihres GitHub-Repositories.
- Der Figma Sketch findet sich mit dem nachfolgenden Link: https://www.figma.com/file/WqKqKNeI8LEkmrJdGLWDl49J/a1-fs19-alainkaiser?node-id=0%3A1

## Initiale Schritte
 - Tragen Sie ihren Namen unter "Bearbeitet von" ein. Manche GitHub-Account-Namen können nicht
 eindeutig einer Person zugeordnet werden.
 
 - Benennen Sie das Package "assignment_1" um. Verwenden Sie den GitHub-Account-Namen. (Via "Refactor -> Rename...")
 
 - Pushen Sie diese Änderungen sofort ins Git-Repository (z.B. via "VCS -> Commit... -> Commit&Push")

## Bitte beachten Sie
 - Es wird empfohlen die Assignment-Aufgaben, genau wie das Programmierprojekt, in einem 2er-Team zu bearbeiten. 
 
 - Falls Sie das Assignment zu zweit bearbeiten:
   - tragen Sie beide Namen unter "Bearbeitet von" ein
   - arbeiten Sie ausschliesslich in einem Repository
   - falls sie beide Zugang zu diesem Repository wollen: tragen Sie die zweite Person als "Collaborator" ein (auf GitHub unter "Settings - > Collaborators & teams")
   - löschen Sie das nicht benötigte Repository (auf GitHub unter "Settings")
   - arbeiten Sie gemeinsam und gleichzeitig an den Aufgaben (Stichwort: Pair-Programming)
   - das Aufteilen und separate Bearbeiten von Teil-Aufgaben ist nicht erwünscht
 
 - Ausdrücklich erlaubt und erwünscht ist, dass Sie sich gegebenenfalls Hilfe holen.
 Das Programmierzentrum ist geöffnet und Nachfragen werden zum Beispiel über den im Repository integrierten 
 Issue Tracker oder per Mail gerne beantwortet. 
 
## Die Aufgabe: Einfaches, interaktives Custom Control

Entwerfen und implementieren Sie ein einfaches, *interaktives* Custom Control.
 - Entwerfen Sie ein interaktives Custom Control mit Hilfe eines Grafik-Programms. 
 - Übertragen Sie den Entwurf in ein Java-Programm und implementieren Sie dieses Custom Control auf Basis JavaFX.
 - Verwenden Sie die im Unterricht besprochene und als Template in diesem Repository mitgelieferte Grundstruktur (das "Template").
 - Grafisch sehr einfache Custom Controls reichen für dieses Assignment vollkommen aus. Im Mittelpunkt steht die Anwendung 
   der im Unterricht vorgestellten Vorgehensweise und der erarbeiteten Grundstruktur.


## Ausserdem gilt
 - Es können in diesem Assignment maximal 2 Punkte erreicht werden. 

   - Der Entwurf des Custom Controls im Grafik-Programm ist Bestandteil der Aufgabe. Der entsprechende File muss mit abgegeben werden.
 
   - Einen Punkt gibt es bereits sobald der ernsthafte Wille ein Custom Control auf Basis des Templates zu implementieren erkennbar ist.
 
   - Für zwei Punkte muss das Custom Control tatsächlich interaktiv sein und das Template sinnvoll angewendet werden. 
   Mit einem reinen Anzeigeelement (keine Wertänderung via Custom Control durch den Benutzer) kann maximal 1 Punkt erreicht werden.
 
   - Das im Template enthaltene "Custom Control" muss deutlich erkennbar verändert werden und der Java-Code kompilierfähig sein, 
   ansonsten wird dieses Assignment mit 0 Punkten bewertet.
 
 - Welches Custom Control Sie implementieren ist Ihnen freigestellt. Einzige Einschränkung: Custom Controls, die bereits
 im Unterricht detailliert besprochen wurden (LED, NumberRange, etc.) sind ausgeschlossen. Dagegen können Sie gerne
 ein Control umsetzen, das bereits als Screendump oder als Demo gezeigt wurde.
 
 
 ## Bei Problemen mit dem IntelliJ-Setup
 Es kommt immer wieder mal vor, dass der Setup des IntelliJ-Projekts nicht auf Anhieb funktioniert oder "plötzlich"
 nicht mehr funktioniert.
 
 Sie brauchen in so einem Fall NICHT nochmal den Invitation-Link annehmen oder das Projekt via “Check out from Version Control” oder "git clone ..." nochmal anlegen.
 
 Statt dessen ist es am besten den IntelliJ-Setup neu generieren zu lassen. Dazu verwendet man den File "build.gradle", der eine 
 komplette und IDE-unabhängige Projektbeschreibung enthält.
 
 Die einzelnen Schritte:
 
 - Schliessen Sie alle geöffneten Projekte (File -> Close Project)
 
 - Wählen Sie “OPEN” 
 
 - Es erscheint ein Finder-Fenster mit dem Sie zu ihrem Projekt navigieren.
 
 - Dort wählen Sie den File “build.gradle” aus.
 
 - Beim nächsten Dialog “Open as Project” wählen.
 
 - Beim nächsten Dialog kontrollieren ob der Liberica JDK 11 ausgewählt ist.
 
 - Dann “File already exists” mit YES bestätigen.
 
 - ACHTUNG: Jetzt “Delete existing Project and Import” anklicken.
 
 - Warten, warten, warten.
 
 Wenn alles gut gegangen ist sollte im Project-View der Java-Ordner unter src/main blau sein und der Java-Ordner unter src/test grün.
