
import java.util.Scanner;

public class InputCalculationOutput {

	public static void main(String[] args) {
		//2.2 - Problem 1 -9
		int intVar1 = 0;
		int intVar2 = 2147483647;
		int intVar3 = -2147483648;
		long longVar = 2147483650l;
		double doubleVar = 0.0;
		byte byteVar = 0;
		short shortVar = 0;
		char charVar = 'W';
		boolean boolVar = true;
		
		//10
		Scanner inputFromKeyboard = new Scanner(System.in);
		//11, 12
		//Print out an message "Enter width of an rectangle in floating-point number: "
		System.out.println("Enter width of an rectangle in floating-point number:");
		//Read and store the input into a variable (you decide the variable name and its data type)
		float rectangleWidth;
		rectangleWidth = inputFromKeyboard.nextFloat();
		//13, 14
		//Print out an message "Enter height of an rectangle in floating-point number: "
		System.out.println("Enter height of an rectangle in floating-point number: ");
		float rectangleHeight;
		rectangleHeight = inputFromKeyboard.nextFloat();
		//15) Calculate the rectangle area using the two inputs that you have entered above and store the result into a variable ( A = W*L)
		float rectangleArea = rectangleWidth * rectangleHeight;
		//16) Print out the values width , height, and rectangle area result. Provide a label for each value and separate them by a space (e.g. "width: 12.80 height: 35.60 area: 455.68”)
		System.out.print("width: " + rectangleWidth + " height: " + rectangleHeight + " area: " + rectangleArea );
		//17) Print out boolVar and charVar on the same line with labels
		System.out.println("boolVar: " + boolVar + " charVar: " + charVar);
		//18) Assign false to boolVar 
		boolVar = false;
		//19) Assign 'A' to charVar 
		charVar = 'A';
		//20) Print out boolVar and charVar on the same line with labels
		System.out.println("boolVar: " + boolVar + " charVar: " + charVar);
		//21) Assign the multiplication intVar2 * intVar3 * longVar to doubleVar 
		doubleVar = intVar2 * intVar3 * longVar;
		System.out.println("Answer is:" + doubleVar);
		
		
		
		
		
		
		

		
		
	}

}
