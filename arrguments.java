public class arrgumets {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two arguments.");
            return;
        }

        String company = args[0];  // first argument
        String city = args[1];     // second argument

        System.out.println(company + " Technologies " +city);
}
}