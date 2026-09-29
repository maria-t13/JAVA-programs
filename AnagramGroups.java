import java.util.*;

class AnagramGroups {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0) {
            int n = s.nextInt(), m = s.nextInt();
            HashSet<String> set = new HashSet<>();

            while(n-- > 0) {
                char a[] = s.next().toCharArray();
                Arrays.sort(a);
                set.add(new String(a));
            }

            System.out.println(set.size());
        }
    }
}
