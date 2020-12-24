
package ClassWork;

/**  
 * @ClassName: Math
 * @Description: public int add(int a,int b); //类型不同的重载
				public double add(double a,double b);
				public String add(String a,int b); //顺序不同的重载
				public String add(int a,String b);
				public int max(int a,int b,int c);//个数不同的重载
				public int max(int a,int b)

 * @author LYL
 * @date 2020-12-24 04:16:37 
*/

public class Math {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b){
		return a+b;
	}
	public String add(String a,int b){
		return a+b;
	}
	public String add(int a,String b){
		return a+b;
	}
	public int max(int a,int b,int c){
		return a+b;
	}
	public int max(int a,int b){
		return a+b;
	}
}
