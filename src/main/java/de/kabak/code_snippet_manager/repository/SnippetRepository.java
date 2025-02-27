package de.kabak.code_snippet_manager.repository;

import de.kabak.code_snippet_manager.model.Snippet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnippetRepository extends JpaRepository<Snippet, Long> {

}
