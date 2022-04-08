package src.testPack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class OOP {
    public  static void main(String[] args)
    {
        List lst = new ArrayList();
        List<String> arr = new LinkedList<String>();


        OOP obj = new OOP();
        OOP child = new MyClass();
        child.PrintS();
    }
    @Test
    public void PrintS()
    {
        assertEquals(4, 4);
    }

}
class MyClass extends OOP
{

    public void  PrintS()
    {
        System.out.println("Child");
    }
}
