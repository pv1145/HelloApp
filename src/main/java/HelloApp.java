public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name);
            nameBuilder.append(", ");
        }

        String greeting;
        if (nameBuilder.length() > 0) {
            greeting = nameBuilder.substring(0, nameBuilder.length() - 2); // Remove the last ", "
        } else {
            greeting = "World";
        }

        System.out.println("Hello, " + greeting + "!");
    }
}