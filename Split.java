class Split {
    public static void main(String[] args) {
        String s = "Java is very easy";
        String[] w = s.split(" ");

        for (String x : w)
            System.out.println(x);
    }
}
