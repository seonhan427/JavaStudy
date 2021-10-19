package week5;



class myArray{
	static double minArray(double[] list) {
		//배열 안에 최소값 찾기
		double min = list[0];
		
		for(double d : list) {
			if (min > d) {
				min = d;
			}
		}
		
		return min;
	}
	
}

public class ArrayTest {
	
	public static void main(String[] args) {
		double[] sample = {1.0,2.7,-3.1};
		
		// MyArray클래스의 minArray() 호출
//		myArray my = new myArray();
//		double min = my.minArray(sample);
		double min = myArray.minArray(sample);
		System.out.println(min);
	}
}
