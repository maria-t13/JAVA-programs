import java.util.*;

class Todo {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Study");
        tasks.add("Assignment");
        tasks.add("Exercise");

        tasks.remove("Exercise");

        for(String t : tasks)
            System.out.println(t);
    }
}
