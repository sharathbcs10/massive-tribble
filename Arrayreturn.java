public class Arrayreturn{
	
	int []array={1,2,4,5,7};

	public static int[] reversearray(int []array)
	{
	
	for(int i=0,j=array.length-1;i<j;i++,j--)
	{
	int temp=array[i];	
	array[i]=array[j];
	array[j]=temp;
	}
	return array;
	}
	public static void printarray(int[] array)
	{
	for(int i:array)
	{	
	System.out.print(i +" ");
	}
	}
	public static void main(String []args)
	{
	
	Arrayreturn test= new Arrayreturn();

	reversearray(test.array);
	printarray(test.array);
	}
}
