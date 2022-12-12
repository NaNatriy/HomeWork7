package library;

public class Author {
    String authorName;

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                '}';
    }

    public Author (String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName() {
        this.authorName = authorName;
    }
}
