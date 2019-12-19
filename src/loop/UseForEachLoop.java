package loop;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class UseForEachLoop
{
    public static void main(String[] args)
    {
        List<String>nameList =new ArrayList<String>();
        nameList.add("Akhi");
        nameList.add("Pakhi");
        nameList.add("Boishkhi");
        nameList.add("Samina");

        System.out.println(nameList.size());

        for(String st :nameList)
        {
            System.out.println(st);
        }
    }

}
