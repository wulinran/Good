public class Manager extends Employee{
  
  String car;
  String office;

  public Manager(){
  
     Systm.out.println("子类无参构造函数");
  
  }
  public void drive(){
  
    System.out.println(name+"开"+car+"上班");
  
  }
//super：父类的引用
   public void info(){
     System.out.println("子类的info（）");
   //  System.out.println("id:"+id+"\nname:"+name+"\nsalary:"+salary);
     super.info();
	 System.out.println("iiiiiiiiiiiiii");
	 
  }
}