/**  
 * @Title: Animal.java
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:49:59 
 */  

package HomeWork;

/**  
 * @ClassName: Animal
 * @Description: 
 * @author LYL
 * @date 2020-12-24 05:49:59 
*/

public class Animal {
	String name;
	int weight;
	public char sex;
	Animal(){
		
	}
	Animal(String name,int weight){
//		this.name = name;
//		this.weight = weight;
	}
	
	Animal(String name,char sex){
		this.name =name;
		this.sex = sex;
	}
	public void eat() {
		System.out.println("ÕæºÃ³Ô");
	}
}
