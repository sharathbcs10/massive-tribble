import java.lang.Math.* ;
public class Findroot{

public static double y;

	public static double getval(double x)
	{
	
	double result=4*Math.pow(x,3)+Math.pow(x,2)-10;
	return result;
	}
	public static void findroot(double a, double b)
	{
	double p=(a+b)/2;
	double f=getval(p);
	
	if(f==0)
	{
	System.out.print("The root is " + p);
	}
	else if((Math.abs(f))<0.001)
	{
	System.out.print("The root is "+ p);
	}
	else if(f<0)
	{
		findroot(p,b);
	}
	else
	{
		findroot(a,p);
	}
	}
	


	public static void main(String []args)
	{
	double a,b;
		if(args.length<1)
		{
		System.out.print("Interval not correct\n");
		}
		else
		{
		 a=Double.parseDouble(args[0]);
		 b=Double.parseDouble(args[1]);
		
		findroot(a,b);
		}
	
	}

}
