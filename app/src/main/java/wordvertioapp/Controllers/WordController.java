package wordvertioapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wordvertioapp.Services.WordService;
import wordvertioapp.Word;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/words")
public class WordController {
    private final WordService wordService;

    @Autowired
    public WordController(WordService wordService){
        this.wordService = wordService;
    }

    @GetMapping
    public List<Word> getWords(){
        return wordService.getWords();
    }

    @PostMapping
    public void defineNewWord(@RequestBody Word word){
        wordService.addNewWord(word);
    }
}
