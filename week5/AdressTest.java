package week5;

class Adress{
	String name;
	String number;
	
	public Adress(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
}


public class AdressTest {
	public static void main(String[] args) {
		Adress[] person = new Adress[4];
		
		person[0] = new Adress("È«±æµ¿","01012345678");
		person[1] = new Adress("±èÀ¯½Å","01012345679");
		person[2] = new Adress("ÃÖÀÚ¿µ","01012345680");
		person[3] = new Adress("±è¿µÈ¸","01012345681");
		
		for (Adress m : person) {
			System.out.println("("+m.name+","+m.number+")");
		}
		
	}

//	@Override
//	public String toString() {
//		return "(" +
//			
//		}
//	}
}
