package personal.ivan;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        for (var g:generate(5)) {
            for (var t:g
                 ) {
              System.out.print(t);
            }
            System.out.println("");
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finallst = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        finallst.add(lst);
        if(numRows==0)
        {
            return finallst;
        }
        if(numRows==1)
        {
            return finallst;
        }
        lst = new ArrayList<>();
        lst.add(1);
        lst.add(1);
        finallst.add(lst);
        for (int i = 2; i < numRows; i++) {
            //System.out.println(i);
            lst = new ArrayList<>();
            lst.add(1);
            for (int j = 0; j < i-1; j++) {
                lst.add(finallst.get(i-1).get(j)+finallst.get(i-1).get(j+1));
            }
            lst.add(1);
            finallst.add(lst);
        }
        return finallst;
    }
}
