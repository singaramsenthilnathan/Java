public class SQLTrainer extends Trainer
{
public SQLTrainer()
{
	super("mech","R.M.K");	
}
	
public static void main(String[]args)
{
SQLTrainer ram = new SQLTrainer();
ram.training();
System.out.println(ram.getSalary());
System.out.println(ram.dept);
System.out.println(ram.institute);
}


}