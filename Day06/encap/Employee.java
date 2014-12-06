public class Employee{

  int id;
  String name;
  double salary;
  
  
  public String getname(){
  
      return name;
  }

  public double getsalary(){
  
      return salary;
  }
  
  public void info(){
     System.out.println("¸¸ÀàµÄinfo£¨£©");
     System.out.println("id:"+id+"name:"+name+"salary:"+salary);
  }
}