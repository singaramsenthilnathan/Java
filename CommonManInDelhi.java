package india.newDelhi;
public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules
{
public static void main(String[]args)
{
CommonManInDelhi cm = new CommonManInDelhi();
cm.gobyBicycle();
cm.dontgobyDieselvehicle();
cm.gobyDieselvehicle();

}
public void dontgobyDieselvehicle()
{
System.out.println(" Only Diesel");
}
public void gobyBicycle()
{
System.out.println("Kia");
}
public void gobyDieselvehicle()
{
System.out.println("Running by Diesel");
}
}