package mauriziocrispino.w6d2.Service;

import mauriziocrispino.w6d2.Entities.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
