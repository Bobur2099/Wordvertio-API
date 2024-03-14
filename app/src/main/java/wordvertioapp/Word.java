package wordvertioapp;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Word {
    @Id
    @SequenceGenerator(
            name = "words_sequence",
            sequenceName = "words_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "words_sequence"
    )
    private long id;
    private String word;
    private String description;
    private String groups;
    private String baseLang;
    private String translatedLang;

    public Word(String word, String description, String groups, String baseLang, String translatedLang) {
        this.word = word;
        this.description = description;
        this.groups = groups;
        this.baseLang = baseLang;
        this.translatedLang = translatedLang;
    }
}
