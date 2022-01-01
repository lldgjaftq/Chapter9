package objectandclass;
import java.util.Random;//导入随机类
public class UseTheRandomClass_9_4 {

	public static void main(String[] args) {
		Random  r= new Random(1000);
		for(int i=1;i<=50;i++) {
			System.out.println(r.nextInt(100));
		}
	}
}
