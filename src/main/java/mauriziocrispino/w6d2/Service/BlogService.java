package mauriziocrispino.w6d2.Service;

import mauriziocrispino.w6d2.Entities.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogService {
    private List<Blog> blogs= new ArrayList<>();

    public List<Blog> getBlogs() {
        return this.blogs;
    }

    public Blog save(Blog body) {
        Random random = new Random();
        body.setId(random.nextInt(1, 350));
        this.blogs.add(body);
        return body;
    }

    public Blog findById(int id) {
        Blog found = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) {
                found = blog;
            }
        }
        if (found == null)
            System.out.println(id + "non trovato");
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Blog> iterator = this.blogs.iterator();
        while (iterator.hasNext()) {
            Blog current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Blog findByIdAndUpdate(int id, Blog body) {
        Blog found = null;
        for (Blog user : this.blogs) {
            if (user.getId() == id) {
                found = user;
                found.setId(id);
                found.setTitle(body.getTitle());
                found.setCategory(body.getCategory());
            }
        }
        if (found == null)
            System.out.println(id + "non trovato");
        return found;
    }

}
