public class School2{

int noofStudents =500;
int noofTeachers =30;
private String cityName="Chennai";
private int salary = 20000;

public static void main(String[] args)
{
School2 sc = new School2(); 
System.out.println(sc.noofStudents); 
System.out.println(sc.noofTeachers); 
System.out.println(sc.cityName); 
System.out.println(sc.salary); 
sc.prepareQP();
sc.admit(); 
}

private void prepareQP()
{
System.out.println("Preparing Questions");
}
 
 public void admit()
 {
 System.out.println("Admitting Sudents to School");
 }
public void teach()
{
System.out.println("Teaching");
}
}
