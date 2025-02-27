# code-snipet-manager

# Code Snippet Manager (Spring Boot + Gradle)

Ein einfaches Spring Boot-Projekt zum Speichern und Verwalten von Code-Snippets. Dieses Projekt dient dazu sich mit Spring-Boot und Gradle vertraut zu machen.

---

##  Projektübersicht
- **Backend:** Spring Boot (Gradle)
- **Datenbank:** H2 (dev) / PostgreSQL (prod)
- **API:** REST & Swagger
- **Security:** Optional (JWT, Basic Auth)
- **Frontend:** Optional Thymeleaf / React / Vue


##  To Do's:


### *1 Sicherheit & Authentifizierung*
- [ ] **Spring Security einbinden?**
    - [ ] Brauchen wir eine Anmeldung? (JWT, OAuth?)
    - [ ] Zugriffsbeschränkung für API-Routen
    - [ ] Rollen und Rechte definieren

---

### *2 Code-Qualität & Dokumentation*
- [ ] **Logging & Fehlerhandling verbessern**
  - [ ] `@Slf4j` für Logging hinzufügen
  - [ ] Einheitliche Fehlerausgabe mit `@ControllerAdvice`

- [ ] **API-Dokumentation mit Swagger/OpenAPI**
  - [ ] `/swagger-ui.html` hinzufügen

---

### *3 Testing & Deployment**
- [ ] **Tests schreiben**
    - [ ] Unit-Tests (`SnippetService`, `SnippetRepository`)
    - [ ] Integrationstests für API (`@SpringBootTest`)

- [ ] **Deployment vorbereiten**
    - [ ] Docker-Setup für PostgreSQL & Spring Boot
    - [ ] CI/CD mit GitHub Actions oder GitLab CI

---


## **Zusätzliche Notizen/Fragen**
*Wie soll das Projekt später deployt werden?*