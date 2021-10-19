import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopname;
    private List<Book> bookList = new ArrayList<>();

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBookList() {
        return bookList;
    }


    public void loadData(){
        for (int id=1; id <= 5; id++){
            Book book = new Book();
            book.setBookID(id);
            book.setBookTitle("Book " + id);
            bookList.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopename='" + shopname + '\'' +
                ", books=" + bookList +
                '}';
    }

    @Override
    public BookShop clone(){
        BookShop newBookShop = new BookShop();
        newBookShop.setBookList(this.getBookList());
        return newBookShop;
    }
}
