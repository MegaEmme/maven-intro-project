# MAVEN 
Lo useremo direttamente da VSCode tramite l'estensione Java Extension Pack, ma può essere anche scaricato, installato ed utilizzato in modo autonomo.
## Inizializzare un progetto
`Create Java Project` 

==> `Maven` 

==> `No Archetype` 

==> Comunichiamo le nostre informazioni (dependencies):
- (GroupId:) org.lessons.java
- (ArtifactId:) maven-intro-project

==> Selezionare la destination folder

Una volta inizializzato il progetto, Maven creerà in automatico il file POM.xml e le sottocartelle di src specificate tramite il GroupId.

==> Nel file pom.xml vado ad aggiungere la version (terza dependency)
## Importare librerie esterne
 per importare le librerie ci basterà andare su https://mvnrepository.com trovare la libreria desiderata, scegliere la versione ed importare il codice relativo nel file pom.xml.

 Nel nostro esempio importiamo `log4j` versione `1.2.17`, il codice che copiamo sarà: 
```
<!-- https://mvnrepository.com/artifact/log4j/log4j -->
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
``` 


### Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

### Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

### Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
