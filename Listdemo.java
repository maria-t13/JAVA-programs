import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.get(1));
        list.remove(1);

        System.out.println(list);
    }
}
