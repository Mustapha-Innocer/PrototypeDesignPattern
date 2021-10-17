import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
            book.setTitle("Book " + id);
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
        bookShop.books = this.books.stream().map(book -> book).collect(Collectors.toList());
//        bookShop.books.addAll(this.getBooks());
//        for (Book book : this.books){
//            bookShop.books.add(book);
//        }
        return bookShop;
    }
}
