package mauriziocrispino.w6d2.Controllers;

import mauriziocrispino.w6d2.Entities.Blog;
import mauriziocrispino.w6d2.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getBlogs() {
        return blogService.getBlogs();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog saveUser(@RequestBody Blog body) {
        return blogService.save(body);
    }

    @GetMapping("/{id}")
    public Blog findById(@PathVariable int id) {
        return blogService.findById(id);
    }


    @PutMapping("/{id}")
    public Blog findByAndUpdate(@PathVariable int id, @RequestBody Blog body) {
        return this.blogService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    public void findByIdAndDelete(@PathVariable int id) {
        this.blogService.findByIdAndDelete(id);
    }
}


