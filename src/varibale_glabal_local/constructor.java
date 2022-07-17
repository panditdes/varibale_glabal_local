package varibale_glabal_local;

public class constructor {
int a;
int b;
public constructor()       //user defind constuctor without argument
{
	a=50;
	b=100;
	
	System.out.println(a);
	System.out.println(b);
}
public constructor(int k,String p, int q)   //user defind constructor with argument
{
System.out.println(k);
System.out.println(p);
a = 500;
b = 1000;

System.out.println(a);
System.out.println(b);
}


public constructor(String p, int k)        // //user defind constructor with argument
{
System.out.println(k);
System.out.println(p);

a = 5000;
b = 10000;

System.out.println(a);
System.out.println(b);
}
	public static void main(String[] args) {
	
		new constructor();
		
		demomethod();

	}
public static void demomethod() 
{
	new constructor(10,"classes",25);
	new constructor("pune",26);
}
}
