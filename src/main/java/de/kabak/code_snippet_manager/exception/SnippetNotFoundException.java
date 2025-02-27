package de.kabak.code_snippet_manager.exception;


public class SnippetNotFoundException extends RuntimeException{

    public SnippetNotFoundException(Long id) {
        super("Could not find snippet with ID " + id);
    }
}
