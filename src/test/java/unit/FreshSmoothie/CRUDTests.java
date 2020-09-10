package unit.FreshSmoothie;

import com.morningSmoothies.pojos.FreshSmoothie;
import com.morningSmoothies.repositories.ProductManager;
import globalContext.BaseClassUnitTesting;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

@Test(dependsOnGroups = "sanity")
public class CRUDTests extends BaseClassUnitTesting {

    ProductManager pm;
    FreshSmoothie fs1, fs2, fs3;
    @BeforeMethod
    public void localSetup(){
        // Arrange setup
        fs1 = new FreshSmoothie(1, "MalonSmoothie", 25);
        fs2 = new FreshSmoothie(2, "PeachSmoothie", 30);
        fs3 = new FreshSmoothie(3, "MangoSmoothie", 35);
        pm = new ProductManager();
    }

    @Test(description = "Verify that addProduct method returns true when adds product successfully")
    public void successfulProductAdditionReturnsTrue() {
        // Act
        boolean result = pm.addProduct(fs1);
        // Assert
        Assert.assertTrue(result);
    }

    @Test(description = "Verify that getProduct method returns null if product does not exist")
    public void nonExistingProductReturnsNull(){
        // Arrange
        boolean result = pm.addProduct(fs1);
        // Act
        FreshSmoothie fsReturned = pm.getProduct(fs1.getID());
        // Assert
        Assert.assertNull(fsReturned,"The method should return null if it doesn't find an added product for the given ID");
    }

    @Test(description = "Verify that getAllProducts method returns valid product collection")
    public void productStorageReturnValidCount(){
        // Arrange
        pm.addProduct(fs1);
        pm.addProduct(fs2);
        pm.addProduct(fs3);
        // Act
        List<FreshSmoothie> smoothies = pm.getAllProducts();
        // Assert
        Assert.assertEquals(3, smoothies.size());
    }
}
