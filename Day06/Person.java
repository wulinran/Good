//��ô�Զ�����

public class Person{

  //��Ա����
  
  String name;
  int  age;
  //��Ա����

//������������ĳ�Ա��������ʼ����Ա����
//�޲ι��캯��
    Person(){
	
	  System.out.println("�����Զ����޲ι�����");
	}
//һ�ι��캯��
 Person(String name){
	
	  System.out.println("������һ�޲ι�����");
	  this.name=name;
	}
	//���ι��캯��
 Person(String name,int age){
	
	  System.out.println("���������޲ι�����");
	  this.name=name;
	  this.age=age;
	}
   void setName(String name){
   
     this.name=name;
   
   }
   String getName(){
   
     return this.name;
   }
   void info(){
   
      System.out.println("name:"+this.name+"age:"+this.age);
   }
   
} 