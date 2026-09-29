import java.util.*;

class AbsoluteValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- > 0) {
            int n = s.nextInt();
            HashSet<Integer> set = new HashSet<>();

            for(int i=0; i<n; i++)
                set.add(Math.abs(s.nextInt()));

            System.out.println(set.size());
        }
    }
}
