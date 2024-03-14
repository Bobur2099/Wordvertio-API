package wordvertioapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wordvertioapp.Repositories.WordRepository;
import wordvertioapp.Word;

import java.util.List;

@Service
public class WordService {
    private final WordRepository wordRepository;

    @Autowired
    public WordService(WordRepository wordRepository){
        this.wordRepository = wordRepository;
    }

    public List<Word> getWords(){
        return wordRepository.findAll();
    }

    public void addNewWord(Word word){
        System.out.println();
    }
}
