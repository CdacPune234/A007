
public class calci {

	public static void main(String[] args) {
		System.out.print("Select the operation to be performed:" + "1. Add two intigers\n  " + "2. add two float \n"
				+ "3.subtract two int \n " + "4. subtract two float \n " + "5.multiply two int \n "
				+ "6. multiply two float \n " + "7.divide two int \n " + "8. divide two float \n " + "9. exit\n");
		int choice = 0;

		while (choice != 9) {
			choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {
				System.out.println("enter 1st no.=");
				int num1 = ConsoleInput.getInteger();
				System.out.println("enter 2nd no.=");
				int num2 = ConsoleInput.getInteger();
				int result = operation.addInt(num1, num2);
				System.out.println("addition is:" + result);
				break;
			}
			case 2: {
				System.out.println("enter 1st no.=;");
				float num1 = ConsoleInput.getFloat();
				System.out.println("bhau 2 no. sang;");
				float num2 = ConsoleInput.getFloat();
				float result = operation.addFloat(num1, num2);
				System.out.println("substraction is =" + result);
				break;
			}
			case 3: {
				System.out.println("enter 1st no.=");
				int num1 = ConsoleInput.getInteger();
				System.out.println("enter 2nd no.=");
				int num2 = ConsoleInput.getInteger();
				int result = operation.subInt(num1, num2);
				System.out.println("addition is:" + result);
				break;
			}
			case 4: {
				System.out.println("enter 1st no.=;");
				float num1 = ConsoleInput.getFloat();
				System.out.println("bhau 2 no. sang;");
				float num2 = ConsoleInput.getFloat();
				float result = operation.subFloat(num1, num2);
				System.out.println("substraction is =" + result);
				break;
			}
			case 5: {
				System.out.println("enter 1st no.=");
				int num1 = ConsoleInput.getInteger();
				System.out.println("enter 2nd no.=");
				int num2 = ConsoleInput.getInteger();
				int result = operation.mulInt(num1, num2);
				System.out.println("addition is:" + result);
				break;
			}
			case 6: {
				System.out.println("enter 1st no.=;");
				float num1 = ConsoleInput.getFloat();
				System.out.println("bhau 2 no. sang;");
				float num2 = ConsoleInput.getFloat();
				float result = operation.mulFloat(num1, num2);
				System.out.println("substraction is =" + result);
				break;
			}
			case 7: {
				System.out.println("enter 1st no.=");
				int num1 = ConsoleInput.getInteger();
				System.out.println("enter 2nd no.=");
				int num2 = ConsoleInput.getInteger();
				int result = operation.divInt(num1, num2);
				System.out.println("addition is:" + result);
				break;
			}
			case 8: {
				System.out.println("enter 1st no.=;");
				float num1 = ConsoleInput.getFloat();
				System.out.println("bhau 2 no. sang;");
				float num2 = ConsoleInput.getFloat();
				float result = operation.divFloat(num1, num2);
				System.out.println("substraction is =" + result);
				break;
			}
			case 9: {
				System.out.println("bye");
				break;
			}
			}
		}
	}
}
