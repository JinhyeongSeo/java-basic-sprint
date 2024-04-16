import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {


    public static void main(String[] args) {
        int[] num = {3,4,1,2};
        List<String> numList = new ArrayList<>();
        for (int i : num) {
            numList.add(Integer.toString(i));
        }
        Collections.sort(numList);
        System.out.println(numList);
    }
}
