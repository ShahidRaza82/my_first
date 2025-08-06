package operators;

public class PrecedenceOfOperators {
    public static void main(String[] args) {
        // (*) has higher than (+) --> 20
        System.out.println("Result 1 (10 + 5 * 2): " + (10 + 5 * 2));

        // () have the highest precedence --> 30
        System.out.println("Result 2 ((10 + 5) * 2): " + ((10 + 5) * 2));

        // (/) and (*) have same --> left to right --> 8
        System.out.println("Result 3 (20 / 5 * 2): " + (20 / 5 * 2));

        // Relational op. (<) have lower than arithmetic operators(+,-,*,/,%)
        boolean result4 = 10 + 2 < 15,result5 = 10 + 6 > 20; // true // false
        System.out.println("Result 4 (10 + 2 < 15): " + result4);
        System.out.println("Result 5 (10 + 16 > 20): " + result5);

        // (&&) has lower than (<,>,==,>=,<=,!=) --> true && false = false
        System.out.println("Result 6 (10 < 20 && 5 < 2): " +(10<20&&5<2));

        // (==) has lower than (+,-,*,/,%) -->(10+5)==15 --> 15==15 --> true
        System.out.println("Result 7 (10 + 5 == 15): " + (10+5==15));

        int a;// (=) has the lowest precedence --> Assignment first () --> 10 > 5 --> true
        System.out.println("Result 8 ((a = 10) > 5): " + ((a = 10) > 5));
    }
}
