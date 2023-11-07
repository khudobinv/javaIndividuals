import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class OrArray implements Array {
    @Override
    public Set<Integer> add(Set<Integer> arr1, Set<Integer> arr2) {
        Set<Integer> res = new HashSet<>(arr1);
        Set<Integer> copyArr2 = new HashSet<>(arr2);
        res.addAll(copyArr2);
        return res;
    }

    @Override
    public List<Double> process(Set<Integer> arr) {
        List<Double> res = new ArrayList<>();
        for (int i : arr)
            res.add(Math.log(i));
        return res;
    }
}