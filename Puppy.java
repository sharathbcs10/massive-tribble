public class Puppy{
		int puppyAge;
	public Puppy(String name)
		{
		System.out.println("Dog's Name is "+name);
		}
	public void setAge(int age)
		{
		puppyAge=age;
		}
	public int getAge()
		{
		return puppyAge;
		}
	public static void main(String []args)
		{
		Puppy myPuppy=new Puppy(args[0]);
		
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Age of tommy is "+ myPuppy.puppyAge);
		}
}
