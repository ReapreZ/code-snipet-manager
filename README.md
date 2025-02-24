# code-snipet-manager

# Code Snippet Manager (Spring Boot + Gradle)

Ein einfaches Spring Boot-Projekt zum Speichern und Verwalten von Code-Snippets. Dieses Projekt dient dazu sich mit Spring-Boot und Gradle vertraut zu machen.

---

##  Projektübersicht
- **Backend:** Spring Boot (Gradle)
- **Datenbank:** H2 (dev) / PostgreSQL (prod)
- **API:** REST
- **Security:** Optional (JWT, Basic Auth)
- **Frontend:** (Optional) Thymeleaf / React / Vue

---

## **To-Do Liste**

### **1 Planung & Architektur**
- [ ] **Funktionale Anforderungen definieren**
    - [ ] Welche Felder soll ein Snippet haben? (`title`, `code`, `language`, `createdAt`, `expiresAt`?)
    - [] Eventuell eine Suchfunktion oder Filter einbauen?
    - [ ] Welche externe Libraries können genutzt werden? (z. B. Lombok, Swagger)

 **Notizen:**



---

### **2️⃣ Datenbank & Persistenz**
- [ ] **Datenmodell entwerfen**
    - [ ] `Snippet`-Entität mit Feldern erstellen
    - [ ] Primärschlüssel-Typ festlegen (`UUID` oder `Long`?)
    - [ ] Expire-Datum für Snippets (Falls gewünscht)

- [ ] **Spring Data JPA einrichten**
    - [ ] `JpaRepository` für `Snippet`-Entität
    - [ ] Automatische Migrationen (`schema.sql` oder Flyway?)
    - [ ] Test-Daten einfügen

 **Notizen:**  


---

### **3 API-Design & Controller**
- [ ] **REST-API-Endpunkte definieren**
    - [ ] `GET /snippets` → Alle Snippets abrufen
    - [ ] `GET /snippets/{id}` → Einzelnes Snippet abrufen
    - [ ] `POST /snippets` → Neues Snippet speichern
    - [ ] `DELETE /snippets/{id}` → Snippet löschen
    - [ ] `PUT /snippets/{id}` → Snippet aktualisieren
    - [ ] Pagination & Sortierung hinzufügen

- [ ] **Controller & Service-Layer umsetzen**
    - [ ] `SnippetController` mit API-Methoden
    - [ ] `SnippetService` für Business-Logik
    - [ ] Fehlerbehandlung (`@ExceptionHandler`)

 **Notizen:**

---

### **4 Sicherheit & Authentifizierung (Optional)**
- [ ] **Spring Security einbinden?**
    - [ ] Brauchen wir eine Anmeldung? (JWT, OAuth?)
    - [ ] Zugriffsbeschränkung für API-Routen
    - [ ] Rollen und Rechte definieren

📝 **Notizen:**  
*Müssen Nutzer Accounts haben oder sind Snippets öffentlich?*

---

### **5 Code-Qualität & Dokumentation**
- [ ] **Logging & Fehlerhandling verbessern**
    - [ ] `@Slf4j` für Logging hinzufügen
    - [ ] Einheitliche Fehlerausgabe mit `@ControllerAdvice`

- [ ] **API-Dokumentation mit Swagger/OpenAPI**
    - [ ] `/swagger-ui.html` hinzufügen

📝 **Notizen:**  
*Welche Fehlerfälle müssen abgefangen werden?*

---

### **6 Testing & Deployment**
- [ ] **Tests schreiben**
    - [ ] Unit-Tests (`SnippetService`, `SnippetRepository`)
    - [ ] Integrationstests für API (`@SpringBootTest`)

- [ ] **Deployment vorbereiten**
    - [ ] Docker-Setup für PostgreSQL & Spring Boot
    - [ ] CI/CD mit GitHub Actions oder GitLab CI

 **Notizen:**  
*Wie soll das Projekt später deployt werden?*

---

##  **Nächste Schritte**
1. [x] **Spring Boot & Gradle einrichten**
2. [ ] Datenbank & API-Schnittstellen planen
3. [ ] Ersten Prototyp der API entwickeln
4. [ ] Erweiterungen & Tests hinzufügen

---

## **Zusätzliche Notizen**
