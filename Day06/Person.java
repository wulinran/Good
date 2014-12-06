//怎么自定义类

public class Person{

  //成员变量
  
  String name;
  int  age;
  //成员方法

//构造器：特殊的成员方法，初始化成员变量
//无参构造函数
    Person(){
	
	  System.out.println("我是自定义无参构造器");
	}
//一参构造函数
 Person(String name){
	
	  System.out.println("我是自一无参构造器");
	  this.name=name;
	}
	//两参构造函数
 Person(String name,int age){
	
	  System.out.println("我是自两无参构造器");
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