package Chapter2;

public class �����嵥2_7ShowCurrentTime {
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();		//��ȡ1970��1��1����ҹ�����ڵĺ�����
		
		long totalSeconds = totalMilliseconds / 1000;		//����õ�׼ȷ��������
		
		long currentSeconds = totalSeconds % 60;		//����õ���ǰ����
		
		long totalMinutes = totalSeconds / 60;		//ͨ������������õ��ܷ�����
		
		long currentMinutes = totalMinutes % 60;		//����õ���ǰ������
		
		long totalHours = totalMinutes / 60;		//ͨ���ܷ���������õ���Сʱ��
		
		long currentHours = totalHours % 24 + 8;		//����õ���ǰ��Сʱ��(����ʱ���8Сʱ)
		
		System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
	}
}
