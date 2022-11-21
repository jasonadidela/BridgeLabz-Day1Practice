public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Main class");
        System.out.println("Welcome to 1.4_sumCommandLine Branch");
        int sum = 0;
        System.out.println("Calculates Sum for below Integers");
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid arguments: " + e.toString());
            }
        }
        System.out.println("Sum :" + sum);
    }
}
