class Student {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 70) {
            System.out.println("Passed");
            
            if (marks > 80)
                System.out.println("Grade A");
        } else {
            System.out.println("Failed");
        }
    }
}
