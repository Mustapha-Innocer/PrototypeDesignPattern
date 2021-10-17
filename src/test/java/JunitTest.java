import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void shopEqualityTest() throws CloneNotSupportedException {
        BookShop shopA = new BookShop();
        shopA.setShopname("Shop A");
        shopA.loadData();

        BookShop shopB = shopA.clone();
        shopB.setShopname("Shop B");

        Assert.assertNotEquals(shopA,shopB);
    }
}
