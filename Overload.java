public class Overload{

	public static void main(String []args)
		{
		
		int i=2,j=4;
		double x=2.4,z=6.8;
		int k=max(i,j);
		double l=max(x,z);
		System.out.print("Max of "+i +"and " + j +"is " +k+"\n");
		System.out.print("Max of "+x +"and " + z+"is " +l+"\n");
		}
	public static int max(int num1 ,int num2)
	{
	return num1>num2?num1:num2;
	}
	public static double max(double num1 ,double num2)
        {
        return num1>num2?num1:num2;
        }
}
	
