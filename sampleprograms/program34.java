class program34 {
    public static void main(String args[]) {
        boolean t = true;
        first: {
            second: {
                for (int i = 0; i < 5; i++) {
                    third: System.out.println("Before the break");
                    if (t)
                        break second;
                    System.out.println("This won't exeute");
                }
            }
            System.out.println("This won't exeute");
        }
        System.out.println("This is after second block");
    }
}