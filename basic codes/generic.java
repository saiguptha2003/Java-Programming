class generic<T> {
    generic(T i, String s) {
        System.out.println(i);
        System.out.println(s);
    }

    T getdata(T a) {

        return a;
    }

    public static void main(String[] args) {
        generic<Integer> d = new generic<Integer>(123, "pandurangasai");
        System.out.println(d.getdata(34));
        generic<String> f = new generic<String>("iam sai", "sai guptha");
        f.getdata("pandurangasi");
        System.out.println();
        System.out.println(f);
    }
}
