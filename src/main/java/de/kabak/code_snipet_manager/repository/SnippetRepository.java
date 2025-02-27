package de.kabak.code_snipet_manager.repository;

import de.kabak.code_snipet_manager.model.Snippet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SnippetRepository extends JpaRepository<Snippet, Long> {

}
