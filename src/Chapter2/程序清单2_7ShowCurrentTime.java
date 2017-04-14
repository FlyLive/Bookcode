package Chapter2;

public class 程序清单2_7ShowCurrentTime {
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();		//获取1970年1月1日午夜到现在的毫秒数
		
		long totalSeconds = totalMilliseconds / 1000;		//计算得到准确的总秒数
		
		long currentSeconds = totalSeconds % 60;		//计算得到当前秒数
		
		long totalMinutes = totalSeconds / 60;		//通过总秒数计算得到总分钟数
		
		long currentMinutes = totalMinutes % 60;		//计算得到当前分钟数
		
		long totalHours = totalMinutes / 60;		//通过总分钟数计算得到总小时数
		
		long currentHours = totalHours % 24 + 8;		//计算得到当前的小时数(北京时间加8小时)
		
		System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
	}
}
