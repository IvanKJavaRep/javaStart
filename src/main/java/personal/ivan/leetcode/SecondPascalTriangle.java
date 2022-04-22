package personal.ivan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SecondPascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>> row1 = new ArrayList<ArrayList<Integer>>();
        row1.add(new ArrayList<>(List.of(1)));
        row1.add(new ArrayList<>(List.of(1,1)));
        if(rowIndex==0)
        {
            return row1.get(0);
        }
        else if(rowIndex==1)
        {
            return row1.get(1);
        }
        else
        {
            for (int i = 2; i < rowIndex+1; i++) {
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(1);
                for (int j = 0; j < i-1; j++) {
                    lst.add(row1.get(i-1).get(j)+row1.get(i-1).get(j+1));
                }
                lst.add(1);
                row1.add(lst);
            }
            return row1.get(rowIndex);
        }
    }
}
