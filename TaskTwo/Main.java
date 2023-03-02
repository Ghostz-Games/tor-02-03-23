import java.util.Scanner;

class Main {
	

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please state your name:");
		String name = scan.nextLine();
		System.out.println("Hello "+name+". Please state your age:");
		int age = scan.nextInt();
		System.out.println("Okay "+name+", so you're "+age+" years old.");
		int retirementAge = 67 - age;
		System.out.println("You may retire in "+retirementAge+" years");
	}



}