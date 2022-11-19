package testngannotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParametrsofTestAnnotations {

    @Test(groups = {"smoke","P1"})
    public void A(){
        System.out.println("A method");
        Assert.assertFalse(true);
    }

    @Test(groups = {"P0"})
    public void C(){
        System.out.println("C method");
    }
    @Test(dependsOnGroups = "P0")
    public void D()
    {
        System.out.println("D method");
    }
    @Test(dependsOnGroups = "P1")
    public void B()
    {
        System.out.println("B method");
    }
}
