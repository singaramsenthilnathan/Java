public class Samsung extends FactoryDemo
{
static int price =5000;

public static void main(String[]args)
{
Samsung sam = new Samsung();
sam.sendMessage();
sam.receiveCall();
sam.verifyFingerPrint();
sam.providePattern();
sam.browse();
System.out.println(sam.price);
int result=sam.call(60);
System.out.println(result);
}
public int call(int seconds)
{
return seconds*2;   
}

public void sendMessage()
{
System.out.println("HI");
}
public void receiveCall()
{
System.out.println("call Recieved");
}
public void  verifyFingerPrint()
{
System.out.println("FingerPrint Accepted");
}
public void  providePattern()
{
System.out.println("Pattern Accepted");
}



}