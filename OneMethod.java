package HiTech;
public class OneMethod 
{
public static void main(String[] args) 
{
int a=10;int b=10;int c=10;
String s="SenthilNathan";
OneMethod one = new OneMethod();
one.display();
one.display(a,b);
one.display(a,b,c);
one.display(s);
System.out.println(one.display(a, b));
System.out.println(one.display(a, b, c));
System.out.println(one.display(s));
}
private String display(String s) 
{
return s;
}
private int display(int a, int b, int c) 
{
return a+b+c;	
}
private int display(int a, int b) 
{
return a+b;	
}

private void display() 
{
System.out.println("HI....MY NAME IS RAJA!!!");
}
}
