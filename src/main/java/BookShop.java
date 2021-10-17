import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopname;
    List<Book> books = new ArrayList<>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBooks() {
        return books;
    }


    public void loadData(){
        for (int id=1; id <= 5; id++){
            Book book = new Book();
            book.setBookID(id);
            book.setBookTitle("Book " + id);
            books.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopename='" + shopname + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.books.addAll(this.getBooks());
        return bookShop;
    }
}
