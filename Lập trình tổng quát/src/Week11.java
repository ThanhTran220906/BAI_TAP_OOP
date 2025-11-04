import java.util.*;

public interface Week11 {
    public static <T> List<T> sortGeneric(List<T> list, Comparator<? super T> cmp) {
        List<T> copy = new ArrayList<>(list);
        copy.sort(cmp);
        return copy;
    }

}
