
package Blog2018;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Comment implements Comparable<Comment> {
    private String content;
    private String author;
    private LocalDateTime date;

    public Comment(String content, String author, LocalDateTime date) {
        this.content = content;
        this.author = author;
        this.date = date;
    }

    public Comment(String content, String author) {
        this.content = content;
        this.author = author;
        this.date=LocalDateTime.now();
    }
    

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Comment{" + "content=" + content + ", author=" + author + ", date=" + date + '}';
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public int compareTo(Comment comment) {
        return date.compareTo(comment.date);
    }
    
    
    
    
    
    
}
