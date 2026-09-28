class Largest {
    public static void main(String[] args) {
        int[] a = {10, 25, 15, 40, 30};
        int max = a[0];

        for (int i : a)
            if (i > max) max = i;

        System.out.println(max);
    }
}
