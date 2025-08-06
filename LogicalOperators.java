package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = false, b = true, id = true; int age = 25;
        System.out.println("a && b : "+(a && b)); // false
        System.out.println("a || b : "+(a || b)); // true
        System.out.println("!a : "+( !a )); // true
        System.out.println("!b : "+( !b )); // false
        if(age>=18 && id){ // Illegible
            System.out.println("Illegible");
        }else{
            System.out.println("Non illegible");
        }
    }
}
