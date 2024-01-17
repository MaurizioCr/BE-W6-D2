package mauriziocrispino.w6d2.Repository;

import mauriziocrispino.w6d2.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDAO extends JpaRepository <Blog, Long>{
}
