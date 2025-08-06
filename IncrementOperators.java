package operators;

public class IncrementOperators {
    public static void main(String[] args){
        int a = 34;
        System.out.println("Actual value : "+a); // 34
        System.out.println("Pre-Increment value : "+ ++a);  // 35
        System.out.println("Now Actual value : "+a);  // 35
        System.out.println("No change in value : "+ a++); // post-increment
        System.out.println("Post-Increment value : "+a);  // 35
    }
}
