package de.kabak.code_snipet_manager.config;

import de.kabak.code_snipet_manager.model.Snippet;
import de.kabak.code_snipet_manager.repository.SnippetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(SnippetRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Snippet("Hello World", "System.out.println(\"Hello World\")","Java")));
            log.info("Preloading " + repository.save(new Snippet("Hello World2", "System.out.println(\"Hello World2\")","Java")));
        };
    }
}
