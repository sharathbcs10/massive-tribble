public class Stringformat{
	
	public static void main(String []args){
	float floatVar=32.4f;
	int intVar=3;
	String stringVar="hello";
	String fs;
	fs=String.format("Value of float variable =" +"%f" +" Value of integer =" + "%d" + "Value of string =" + "%s \n",floatVar,intVar,stringVar);
System.out.println(fs);
	}
}
