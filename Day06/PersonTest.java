//测试Person类
public class PersonTest{
   public static void main(String[] args){

//实例化
      Person gem=new Person();
	  Person gemm=new Person("高博");
	  Person gemmm=new Person("高博集团",12);
      //使用
	 
     gem.info();
	 gemm.info();
	 gemmm.info();
   }
}