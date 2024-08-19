import com.thetestingacademy.utils.ExtentManager;
import com.thetestingacademy.utils.TestNGListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGListener.class)
public class ExtentTest {

    @Test
    public void testMethod(){
        ExtentManager.createTest("testMethod 1","Sample Test Method 1");
    }

    @Test
    public void testMethod1(){
        ExtentManager.createTest("testMethod 2", "Sample Test Method 2");
        Assert.assertTrue(false);
    }
}
