public class Tamilnadu extends SouthIndia
{
static String capital = "Chennai";


public void speakLanguage()
{
System.out.println("Tamil");
}
public void eat()
{
System.out.println("Rice");
}
public void dress()
{
System.out.println("Wear Traditional Dress");
}
public void cultivate()
{
System.out.println("Rice and Sugar Cane Cultivation");
}
public void livingStyle()
{
System.out.println("Above Average Development");
}
public static void main(String[]args)
{
SouthIndia si = new Tamilnadu();
si.cultivate();
si.livingStyle();
si.eat();

//System.out.println(si.capital);
System.out.println(India1.Capital);
System.out.println(Tamilnadu.capital);

}
}
