
package HomeWork;

/**  
 * @ClassName: ZhaFruit
 * @Description: 
 * @author LYL
 * @date 2020-12-24 04:22:45 
*/

public class ZhaFruit {
	public String GetFruitZhi(Apple a) {
		return "һ��"+a.getColor()+"��"+a.getName()+"֭��ζ��"+a.getWeiDao();
	}
	
	public String GetFruitZhi(Apple a,Banana b) {
		return "һ��"+a.getColor()+b.getColor()+"��"+a.getName()+b.getName()+"֭��ζ��"+a.getWeiDao()+b.getWeiDao();
	}
	
	public String GetFruitZhi(Apple a,int num) {
		return num+"��"+a.getColor()+"��"+a.getName()+"֭��ζ��"+a.getWeiDao();
	}
	
	
}
