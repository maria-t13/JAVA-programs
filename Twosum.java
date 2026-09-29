import java.util.*;

class TwoSum {
    static void twoSum(int a[], int k) {
        for(int i=0; i<a.length; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i]+a[j]==k) {
                    System.out.println(i+" "+j);
                    return;
                }
        System.out.println("-1 -1");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=s.nextInt();

        twoSum(a,s.nextInt());
    }
}
