package operators;

public class AssociativityInOperators {
    public static void main(String[] args) {

        // 1. Left-to-Right Associativity
        // (-), (/) and (&&) are left-to-right associative
        System.out.println("Left-to-Right: 100 - 20 - 10 = " + (100 - 20 - 10)); // 70

        System.out.println("Left-to-Right: 100 / 10 / 2 = " + (100 / 10 / 2)); //5

        System.out.println("Left-to-Right: true && false && true = "+(true && false && true)); // false

        // 2. Right-to-Left Associativity
        // (=), Ternary (?:) is right-to-left associative
        int a, b, c; a = b = c = 10;
        System.out.println("Right-to-Left Assignment: a = " +a+ ", b = "+b + ", c = "+c); // 10

        int x = 5, y = 10; int result4 = (x > y) ? 100 : (x == 5 ? 200 : 300); // 200
        System.out.println("Right-to-Left Ternary: (x>y)?100 : (x==5?200:300) = "+result4);

        // Unary operators (++ prefix) are also right-to-left
        int num = 5; int result5 = ++num + ++num;
        // Expected: ++num = 6, then ++num = 7 → 6 + 7 = 13
        System.out.println("Right-to-Left Unary (++num + ++num): " + result5);
    }
}

