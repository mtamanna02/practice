package firstclass;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List <Integer>number=new ArrayList<>();
        number.add(54);
        number.add(45);
        number.add(36);
        number.add(67);
        System.out.println(number.size());
        for (Integer n:number) {
            //System.out.println(number.get(2));

        }
        System.out.println(number.get(2));
    }
}
