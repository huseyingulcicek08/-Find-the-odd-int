import java.util.*;

public class FindOdd {
    public static int findIt(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int val : A) {
            if (set.contains(val)) {
                set.remove(val);
            }
            else {
                set.add(val);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}