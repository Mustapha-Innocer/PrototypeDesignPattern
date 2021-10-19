public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShopA = new BookShop();
        bookShopA.setShopname("Shop A");
        bookShopA.loadData();

        BookShop bookShopB = bookShopA.clone();
        bookShopB.setShopname("Shop B");

        System.out.println("Shop A\n" + bookShopA.getBookList());
        System.out.println("\nShop B\n" + bookShopB.getBookList());
    }
}
