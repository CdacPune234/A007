
public class ConsoleInput 
{

	public static String getString()
		{
		try
			{
		byte [] arrinput = new byte [100];
		System.out.println("enter value = ");
		int length = System.in.read (arrinput);
		byte [] arrfinal = new byte [length - 2];
		System.arraycopy(arrinput,0, arrfinal,0,length - 2);
		String objString = new String(arrfinal);
		return objString;
			}
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return null;
		}
     public static float getFloat()
     {
    	 return  Float.parseFloat(getString());
     }		
	public static int getInteger()
	{
		String objString = getString();
		int num = Integer.parseInt(objString);
		return num;
	
	}


}
