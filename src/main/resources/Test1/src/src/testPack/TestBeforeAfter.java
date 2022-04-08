package src.testPack;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBeforeAfter {

    @BeforeEach
    public void BeforeTest()
    {
        assertEquals(5, 5);
        System.out.println("d");
    }
    @Test
    public void TestMethod()
    {
        assertEquals(5,5);
        System.out.println("f");
    }
    @Test
    public void TestMethod2()
    {
        System.out.println("f2");

    }
    @AfterEach
    public  void AfterTest()
    {
        System.out.println("g");
    }


}
