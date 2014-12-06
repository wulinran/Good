public class DogTest{

  public static void main(String[] args){
   
    //类变量
	
	 Dog dg=new Dog(12,"Red");
   System.out.println(dg.type);
   
	System.out.println("type="+Dog.type);
	Dog.type="haha";
    System.out.println("type="+Dog.type);
   
  //实例变量:依赖于对象
    Dog dg2=new Dog(15,"Black");
	System.out.println(dg.age);
	System.out.println(dg2.age);
	
	
	Dog.bark1();
  }
  }
  //一个类只有一份，被类的所有实例共享
  //