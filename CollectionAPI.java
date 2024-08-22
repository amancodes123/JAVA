import java.util.ArrayList;
import java.util.Collection;
import javax.xml.transform.Source;
import java.util.List;

public class CollectionAPI {
    public static void main(String[] args) {
        
      //  Collection
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(6);
        nums .add(7);
        nums.add(9);

        System.out.println(nums.get(2));
        // for(int n : nums)
        // {
        //     System.out.println(n);
        // }
        
        // System.out.println(nums);
    }
}
