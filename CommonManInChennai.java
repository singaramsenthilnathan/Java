package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRules
{
public static void main(String[]args)
{
CommonManInChennai cm = new CommonManInChennai();
cm.gobyBicycle();
cm.gobyDieselvehicle();

}
public void gobyDieselvehicle()
{
System.out.println("Running by Diesel");
}
public void gobyBicycle()
{
System.out.println("Tvs");
}
}