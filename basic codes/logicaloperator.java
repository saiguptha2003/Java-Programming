class logicaloperator {
	public static void main(String[] args) {
		int a = 90, b = 85, c = 98;
		int output = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(output);
	}
}