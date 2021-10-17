public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShopA = new BookShop();
        bookShopA.setShopname("Shop A");
        bookShopA.loadData();

        BookShop bookShopB = bookShopA.clone();

        System.out.println("Shop A\n" + bookShopA.getBooks());
        System.out.println("\nShop B\n" + bookShopB.getBooks());
    }
}
