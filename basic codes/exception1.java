class exception1 {
    public static void main(String[] args) {
        try {
            // System.out.println(4/0);
            throw new myex("sfsfsdf");
        } catch (myex exce) {
            System.out.println("name is 4/0");
            System.out.println(exce.getMessage());
        }
    }
}

class myex extends Exception {
    public myex(String s) {
        super(s);
    }
}