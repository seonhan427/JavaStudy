package week5;



class myArray{
	static double minArray(double[] list) {
		//�迭 �ȿ� �ּҰ� ã��
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
		
		// MyArrayŬ������ minArray() ȣ��
//		myArray my = new myArray();
//		double min = my.minArray(sample);
		double min = myArray.minArray(sample);
		System.out.println(min);
	}
}
