public class Manager extends Employee{
  
  String car;
  String office;

  public Manager(){
  
     Systm.out.println("�����޲ι��캯��");
  
  }
  public void drive(){
  
    System.out.println(name+"��"+car+"�ϰ�");
  
  }
//super�����������
   public void info(){
     System.out.println("�����info����");
   //  System.out.println("id:"+id+"\nname:"+name+"\nsalary:"+salary);
     super.info();
	 System.out.println("iiiiiiiiiiiiii");
	 
  }
}