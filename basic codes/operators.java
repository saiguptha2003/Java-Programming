class operators {
    public static void main(String[] args) {
        int a=9;
        int b=10;
        int c=a+b; //using Assignment Operator
        System.out.println("addition Operator : "+(a+b));
        System.out.println("Subtraction Operator : "+(a-b));
        System.out.println("division Operator : "+(a/b));
        System.out.println("modulus Operator : "+(a%b));
        System.out.println("Multiplication Operator : "+(a*b));
        System.out.println("post Increment Operator : "+(a++));
        System.out.println("pre Increment Operator : "+(++a));
        System.out.println("assignment Operator : "+(c));
        a += 9;
        System.out.println("assignment addition Operator : "+(a));
        a -= 9;
        System.out.println("assignment subtraction Operator : "+(a));
        b /=5;
        System.out.println("assignment divison operator : "+(b));
        b %=5;
        System.out.println("assignment modulus Operator : "+(b));
        System.out.println("binary and operator :"+(a&b));
        System.out.println("binary or operator : "+(a|b));
        System.out.println("binary not oeprator : "+(!true));
        System.out.println("binary xor Operator : "+(a^b));
        b &= 6;
        System.out.println("binary assingment and  operator : "+(b));
        b |=6;
        System.out.println("binary assingment or operator : "+b);
        b ^=4;
        System.out.println("binary assingment xor opertor : "+b);
        b <<=3;
        System.out.println("binary assingment left shift : "+b);
        b >>=3;
        System.out.println("binary assingment right shift : "+b);
        System.out.println("greater than operator : "+(a>b));
        System.out.println("less than operator : "+(a<b));
        System.out.println("greater than or equal to operator : "+(a<=9));
        System.out.println("less than or equal to operator : "+(a>=9));
        System.out.println("eual to operator : "+(a==9));
        System.out.println("and operator : "+((a==9) && (a>8)));
        System.out.println("or operator : "+((a==9) || (a<5)));
        System.out.println("not operator : "+(a!=9));
        System.out.println("ternary operator : "+(a>b?a:b));
    }

}