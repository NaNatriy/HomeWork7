package library;

public class Book {
    private String bookName;
    private Author authorName;

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return  authorName + ", " +
                "Book{" +
                "bookName='" + bookName + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    int publicationYear;

    public Book(String bookName, int publicationYear) {
        this.bookName = bookName;
//        this.bookAuthor = authorName;
        this.publicationYear = publicationYear;

    }

    public String getBookName() {
        return this.bookName;
    }

//    public String getAuthorName() {
//        return  this.authorName;
//    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}
