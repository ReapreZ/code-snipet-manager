package de.kabak.code_snipet_manager.controller;

import de.kabak.code_snipet_manager.exception.SnippetNotFoundException;
import de.kabak.code_snipet_manager.model.Snippet;
import de.kabak.code_snipet_manager.repository.SnippetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SnippetController {

    private final SnippetRepository repository;

    SnippetController(SnippetRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/snippets")
    List<Snippet> all() {
        return repository.findAll();
    }
    @PostMapping("/snippets")
    Snippet newSnippet(@RequestBody Snippet newSnippet) {
        return repository.save(newSnippet);
    }

    @GetMapping("/snippets/{id}")
    Snippet one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new SnippetNotFoundException(id));
    }

    @PutMapping("/snippets/{id}")
    Snippet replaceSnippet(@RequestBody Snippet newSnippet, @PathVariable Long id) {

        return repository.findById(id)
                .map(snippet -> {
                    snippet.setTitle(newSnippet.getTitle());
                    snippet.setCode(newSnippet.getCode());
                    return repository.save(snippet);
                })
                .orElseGet(() -> repository.save(newSnippet));
    }

    @DeleteMapping("snippets/{id}")
    void deleteSnippet(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
