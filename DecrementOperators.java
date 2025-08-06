package operators;

public class DecrementOperators {
    public static void main(String[] args){
        int a = 34;
        System.out.println("Actual value : "+a); // 34
        System.out.println("Pre-Increment value : "+ --a);  // 33
        System.out.println("Now Actual value : "+a);  // 33
        System.out.println("No change in value : "+ a--); // post-decrement
        System.out.println("Post-Increment value : "+a);  // 32
    }
}
