public class DogTest{

  public static void main(String[] args){
   
    //�����
	
	 Dog dg=new Dog(12,"Red");
   System.out.println(dg.type);
   
	System.out.println("type="+Dog.type);
	Dog.type="haha";
    System.out.println("type="+Dog.type);
   
  //ʵ������:�����ڶ���
    Dog dg2=new Dog(15,"Black");
	System.out.println(dg.age);
	System.out.println(dg2.age);
	
	
	Dog.bark1();
  }
  }
  //һ����ֻ��һ�ݣ����������ʵ������
  //