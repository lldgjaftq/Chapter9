package objectandclass;
import java.util.Date;//导入Date类
public class UseTheDateClassDate_9_3 {

	public static void main(String[] args) {

		long t = 10000;
        Date day = new Date(t);
        System.out.println(t+":"+day.toString());
        for(int i = 0;i < 7;++ i){
            t *= 10;
            day.setTime(t);
            System.out.println(t+":"+day.toString());
	     }
    }
}
