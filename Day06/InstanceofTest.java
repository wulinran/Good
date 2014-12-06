public class InstanceofTest{

   public static void main(String[] args){
   
     Person p=new Person("android",12);
     String str=new String("hello");
	 if(p instanceof Object){
	 
        System.out.println("p是人类");
	 
	 }else{
	 
	   System.out.println("p不是人类");
	 }
	 
	 
   }

}