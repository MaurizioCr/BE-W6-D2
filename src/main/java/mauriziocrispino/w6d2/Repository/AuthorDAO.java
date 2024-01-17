package mauriziocrispino.w6d2.Repository;

import mauriziocrispino.w6d2.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDAO extends JpaRepository <Author, Long> {
}
