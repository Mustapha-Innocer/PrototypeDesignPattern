public class Book {
    private int bookID;
    private String title;

//    public Book(int bookID, String title){
//        this.bookID = bookID;
//        this.title = title;
//    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", title='" + title + '\'' +
                '}';
    }
}
