package pkg3;

public class Class4 extends Class3
{
public void xyz()
{
	System.out.println("Body given by child class");
}
public static void main(String[] args) 
{
	Class4 obj= new Class4();
	obj.abc();
	obj.xyz();
}
}
