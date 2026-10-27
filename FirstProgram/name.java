import java.util.Arrays;

public class name {
    public static void main(String[] args) {
        String names = "world";

        if (args.length > 0) {
            names = String.join(", ", Arrays.copyOf(args, args.length - 1));
            names += " and " + args[args.length - 1];
        } 

        System.out.println("Hello, " + names + '!');
    }
}
