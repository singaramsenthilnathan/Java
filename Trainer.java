public class Trainer
{
String department,inst;
String dept= "java";
String institute ="Payilagam";
private int salary=10000;

public Trainer(String department,String inst)
{
	this.department=department;
	this.inst=inst;
	System.out.println("I am from :"+this.department);
		System.out.println("I am from :"+this.inst);
	
}

public int getSalary()
{
return this.salary;
}
public void training()
{
System.out.println("Phyton Training");
}
public static void main(String[]args)
{
	Trainer trainerkumar = new Trainer("CSE","payilagam");
	System.out.println(trainerkumar.department);
	System.out.println(trainerkumar.inst);
	
	
}
}