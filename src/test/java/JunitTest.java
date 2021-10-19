import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void shopEqualityTestTwo() throws CloneNotSupportedException {
        BookShop BookShopA = new BookShop();
        BookShopA.setShopname("Shop A");
        BookShopA.loadData();

        BookShop bookShopB = BookShopA.clone();
        bookShopB.setShopname("Shop B");

        Assert.assertNotEquals(BookShopA,bookShopB);
    }
}
