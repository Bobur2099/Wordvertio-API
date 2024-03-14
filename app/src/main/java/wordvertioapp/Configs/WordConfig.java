package wordvertioapp.Configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wordvertioapp.Repositories.WordRepository;
import wordvertioapp.Word;

import java.util.List;

@Configuration
public class WordConfig {
    @Bean
    CommandLineRunner commandLineRunner(WordRepository repository) {
        return args -> {
            Word word1 = new Word("apple", "olma", "fruits", "en", "uz");
            Word word2 = new Word("Nok", "Pear", "fruits", "uz", "en");
            repository.saveAll(List.of(word1, word2));
        };
    }
}
