package test;

public class commandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length != 2) {
	            System.out.println("Please provide exactly two arguments.");
	            return;
	        }

	        String welcome = args[0];  // first argument
	        String name = args[1];     // second argument

	        System.out.println(welcome + " " +name);
	}

}

