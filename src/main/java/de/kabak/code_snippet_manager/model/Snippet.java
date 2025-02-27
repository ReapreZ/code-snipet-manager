package de.kabak.code_snippet_manager.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;

import java.time.LocalDateTime;

@Entity
public class Snippet {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    private String code;
    //TODO: Use enum instead of String
    private String language;

    @CreationTimestamp
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;

    // Gets called before the Entity gets saved to the Database
    @PrePersist
    protected void onCreate() {
        if (expiresAt == null) {
            this.expiresAt = LocalDateTime.now().plusDays(30);
        }
    }

    public Snippet(String title, String code, String language) {
        this.title = title;
        this.code = code;
        this.language = language;
    }

    Snippet() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }



}
