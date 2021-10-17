public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shopA = new BookShop();
        shopA.setShopname("Shop A");
        shopA.loadData();

        BookShop shopB = shopA.clone();

        shopA.books.remove(0);

        System.out.println("Shop A\n" + shopA.getBooks());
        System.out.println("\nShop B\n" + shopB.getBooks());
    }
}
