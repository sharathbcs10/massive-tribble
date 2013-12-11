import java.io.*;
public class Filehandling{
	public static void main(String []args)
	{
	try{
	byte bWrite []={10,21,33,45};
	OutputStream os=new FileOutputStream("test.txt");
	for(int x=0;x<bWrite.length;x++)
	{
	os.write(bWrite[x]);
	
	}
	os.close();
	
	InputStream is=new FileInputStream("test.txt");
	int size=is.available();

	for(int i=0;i<size;i++)
	{
	System.out.print(is.read() +" ");
	}
	is.close();
	}catch(IOException e){
		System.out.print("\n Exception");
	}}}

