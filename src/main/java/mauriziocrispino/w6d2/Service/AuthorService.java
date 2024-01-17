package mauriziocrispino.w6d2.Service;

import mauriziocrispino.w6d2.Entities.Author;
import mauriziocrispino.w6d2.Entities.Blog;
import mauriziocrispino.w6d2.Repository.AuthorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    @Autowired
    AuthorDAO authorDAO;
    private List<Author> authors= new ArrayList<>();

    public List<Author> getAuthors() {
        return this.authors;
    }

    public Author save(Author body) {
        Random random = new Random();
        body.setId(random.nextInt(1, 350));
        this.authors.add(body);
        return body;
    }

    public Author findById(int id) {
        Author found = null;
        for (Author author : this.authors) {
            if (author.getId() == id) {
                found = author;
            }
        }
        if (found == null)
            System.out.println(id + "non trovato");
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Author> iterator = this.authors.iterator();
        while (iterator.hasNext()) {
            Author current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Author findByIdAndUpdate(int id, Author body) {
        Author found = null;
        for (Author author : this.authors) {
            if (author.getId() == id) {
                found = author;
                found.setId(id);
                found.setName(body.getName());
                found.setSurname(body.getSurname());
            }
        }
        if (found == null)
            System.out.println(id + "non trovato");
        return found;
    }

}


