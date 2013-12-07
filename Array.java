public class Array{

	public static void main(String []args)
		{
			int[] list={1,2,3,4,5};
			for(int i=0;i<list.length;i++)
			{
				System.out.print(list[i]+" ");
			}
			int sum=0;
			for(int i=0;i<list.length;i++)
			{
				sum=sum+list[i];
			}
			System.out.print("Sum = " +sum);
			int max=list[0];
			for(int i=1;i<list.length;i++)
			{
				if(list[i]>max)
					{
						max=list[i];
					}
			}
			System.out.print("Max = "+max);
			}
	}
