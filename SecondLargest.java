class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 25, 15, 40, 30};
        int max = a[0], second = a[0];

        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max)
                second = n;
        }

        System.out.println(second);
    }
}
