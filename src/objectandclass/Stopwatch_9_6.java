package objectandclass;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
public class Stopwatch_9_6 {
    public static void main(String[] args) {
        Random r = new Random(100001);//定义一个随机类
        double n[] = new double[100000];
        for(int i = 0; i< 100000;++ i) n[i] = r.nextDouble();
        StopWatch a = new StopWatch();//开始计时
        //选择排序
        for(int i = 0;i < 100000 - 1;++ i){
            int smallest = i;
            for(int j = i + 1;j < 100000;++ j){
                if(n[j] < n[smallest]){
                    smallest = j;
                }
            }
            if(i != smallest){
                double tmp = n[i];
                n[i] = n[smallest];
                n[smallest] = tmp;
            }
        }
        a.stop();//结束计时
        System.out.println(a.getElapsedTime()+"ms");
    }
}
class StopWatch{
    private Date startTime;
    private Date endTime;
    public StopWatch(){
        startTime = new Date();
    }//无参构造方法，初始化statTime
    public void start(){
        startTime = new Date();
    }//start()重设为当前时间
    public void stop(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}


