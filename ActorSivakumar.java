public class ActorSivakumar implements Actor
{
static String address="Coimbatore";
int age=65;
String Car="Audi";
public ActorSivakumar(int age,String Car)
{
	
this.age=age;
this.Car=Car;
System.out.println("ActorSivakumar Age:"+this.age);
System.out.println("ActorSivakumar Car:"+this.Car);
	
}
public ActorSivakumar()
{
	
}

public static void main(String[]args)
{
ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
//as.address();
Actor ac = new ActorSivakumar();
//as.act();
//as.dance();
//as.sing();
//as.speaking();
//ac.act();
//ac.dance();
//ac.sing();
//ac.speaking();
//ac.address();
//ac.age();
//ac.Car();


System.out.println("ActorSivakumar Address:"+ActorSivakumar.address);
//System.out.println("ActorSivakumar Age:"+ac.age);
//System.out.println("ActorSivakumar Car:"+ac.Car);


}
public void act()
{
System.out.println("Act on stage");
}
public void dance()
{
System.out.println("Dancing With Friends");
}
public void sing()
{
System.out.println("Singing in Studio");
}
public void speaking()
{
System.out.println("Speaking infront of Audience");
}

}