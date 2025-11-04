import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortable<E> {
    private List<E> items;
    private Comparator<E> comparator;

    public ListSortable(Comparator<E> comparator) {
        this.items = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(E e) {
        items.add(e);
    }

    public void addAll(List<E> list) {
        items.addAll(list);
    }

    // Sắp xếp bằng comparator rồi in (mỗi dòng 1 phần tử via toString)
    public void print() {
        items.sort(comparator);
        for (E e : items) {
            System.out.println(e.toString());
        }
    }
}