
public class HelloApp {
    public static void main(String[] args) {
        String greeting;
        if (args.length > 0) {
            greeting = "Hello, " + String.join(", ", args) + "!";
        } else {
            greeting = "Hello, World!";
        }
        System.out.println(greeting);
    }
}