package operators;

public class ArithmeticAssignmentOperators {
    public static void main(String[] args){
        int a = 10, b = 20, c = 30;

        //a = a+5 --> 15
        System.out.println("a += 5 : "+ (a+=5));

        //b = b-5 --> 15
        System.out.println("b -= 5 : "+ (b-=5));

        //c = c*3 --> 90
        System.out.println("c *= 3 : "+ (c*=3));

        //c = c/6 --> 15
        System.out.println("c /= 3 : "+ (c/=6));

        //c = c%4 --> 3
        System.out.println("c %= 4 : "+ (c%=4));
    }
}
