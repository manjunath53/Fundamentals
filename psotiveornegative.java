package test;
import java.util.*;
public class checkno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input>0) {
			System.out.println("Postive");
		}else if(input<0){
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
	}

}