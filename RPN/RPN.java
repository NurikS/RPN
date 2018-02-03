import java.util.Scanner;

public class RPN {
	
	private Stack data = new Stack();
	
	

	public static void main(String[] args) 
	{
		RPN rpn = new RPN();
		rpn.runCalc();
	}
	
	public void runCalc() 
	{
		// TODO Auto-generated method stub 
		System.out.println("Welcome to RPN calculator");
		System.out.println("Let me guide you thru the steps,"
						+ "the program takes a string of numbers and signs and "
						+ "performs this operation: "
						+ "It reads the string and if the character is"
						+ " a number, it stores it in a stack, if it's a sign "
						+ "the program pops two numbers from the stack and performs a "
						+ "mathematical operation."
						+ "let's take an example: 4, 3, -, 4, *, 3, + "
						+ "4-3 = 1; 1*4 = 4; 4+3 = 7");
		System.out.println("Please input a string of numbers and signs separated by comma");
		System.out.println("Input:");
		
		Scanner s = new Scanner(System.in);
		String InString = s.nextLine();
		String [] InSplit = InString.split(",");
		int result;
		
			try 
			{
				for (int i = 0; i<InSplit.length; i++) 
				{
				switch(InSplit[i]) 
				{
				case "+":
					result = data.pop()+data.pop();
					data.push(result);
					break;
				case "-":
					result = data.pop()-data.pop();
					data.push(result);
					break;
				case "*":
					result = data.pop()*data.pop();
					data.push(result);
					break;
				default:
					int in = Integer.parseInt(InSplit[i]);
					data.push(in);
					break;
					
				}
				}
				result = data.pop();
				System.out.print(result);
			}
			
			catch(EmptyStack e) 
			{
				System.out.println("Invalid string");
				
			}

		}
		
		

	}
	
	
	
	


