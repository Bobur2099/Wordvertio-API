package wordvertioapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wordvertioapp.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

}
