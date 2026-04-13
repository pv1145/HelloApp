public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1) {
                nameBuilder.append(args[i] + ", ");
            } else {
                nameBuilder.append(args[i]);
            }
        }

        String name;
        if (args.length > 0) {
            name = nameBuilder.toString();
        } else {
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}