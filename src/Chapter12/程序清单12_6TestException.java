package Chapter12;

public class ≥Ã–Ú«Âµ•12_6TestException {
	public static void main(String[] args){
		try{
			System.out.println(sum(new int[]{1,2,3,4,5}));
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());
			
			System.out.println("\nTrace Info Obtanined from"
				+ " getStackTrace");
			StackTraceElement[] traceElements = ex.getStackTrace();
			for(int i =0;i < traceElements.length;i++){
				System.out.print("methof " +
					traceElements[i].getMethodName());
			}
		}
	}
	
	private static int sum(int[] list){
		int result = 0;
		for(int i = 0;i <= list.length;i++)
			result += list[i];
		return result;
	}
}
