import java.util.List;

public class Week11 {
    
    /**
     * Sorts a list of Person objects by name.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        T swap;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    swap = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, swap);
                }
            }
        }
        return list;
    }
}
