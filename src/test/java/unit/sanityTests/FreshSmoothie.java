package unit.sanityTests;

import com.morningSmoothies.repositories.ProductManager;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = "sanity")
public class FreshSmoothie {

    // As we require not just successfully created storage but empty too for all the unit tests to run in Fresh Smoothie's CRUD Tests
    private ProductManager pm;
    public void sanityBasicCheckIfStorageIsCreatedAndEmpty() {
        //int result = 1/0;
        pm = new ProductManager();
        Assert.assertTrue(pm.getAllProducts().isEmpty());
    }

    // As all of our Fresh Smoothie's CRUD Tests depend upon successful addition of addProduct Method
    public void sanityCheckIfProductIsAdding() {

        Boolean resultAddition = pm.addProduct(new com.morningSmoothies.pojos.FreshSmoothie(1, "Apple", 19));
        Assert.assertTrue(resultAddition);
    }
}
