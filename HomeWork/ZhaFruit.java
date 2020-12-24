
package HomeWork;

/**  
 * @ClassName: ZhaFruit
 * @Description: 
 * @author LYL
 * @date 2020-12-24 04:22:45 
*/

public class ZhaFruit {
	public String GetFruitZhi(Apple a) {
		return "一杯"+a.getColor()+"的"+a.getName()+"汁，味道"+a.getWeiDao();
	}
	
	public String GetFruitZhi(Apple a,Banana b) {
		return "一杯"+a.getColor()+b.getColor()+"的"+a.getName()+b.getName()+"汁，味道"+a.getWeiDao()+b.getWeiDao();
	}
	
	public String GetFruitZhi(Apple a,int num) {
		return num+"杯"+a.getColor()+"的"+a.getName()+"汁，味道"+a.getWeiDao();
	}
	
	
}
