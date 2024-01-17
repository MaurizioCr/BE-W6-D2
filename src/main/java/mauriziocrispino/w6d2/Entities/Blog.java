package mauriziocrispino.w6d2.Entities;

import jakarta.persistence.*;


@Entity
public class Blog {

    @OneToOne
    @JoinColumn(name = "author", nullable = false, unique = true)
    private Author author;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private String readingTime;

    public Blog(String category, String title, String cover, String content, String readingTime) {
        this.category = category;
        this.title = title;
        this.cover = cover;
        this.content = content;
        this.readingTime = readingTime;

    }
    public Blog(){

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "author=" + author +
                ", id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", content='" + content + '\'' +
                ", readingTime='" + readingTime + '\'' +
                '}';
    }
}
