package week5;

class Movie {
	String title;
	String director;
	
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}
}
	


public class MovieTest {
	public static void main(String[] args) {
		Movie[] movies = new Movie[2];
		
		movies[0] = new Movie("���̸���2", "���ӽ� ī�޷�");
		movies[1] = new Movie("Ƽ�ĴϿ��� ��ħ��","������� ����ũ");
		
		for(Movie m : movies) {
			System.out.println("{"+m.title + ","+ m.director +"}");
		}
		
		
	}

	@Override
	public String toString() {
		return "MovieTest []";
	}
}

// toString


// @Override
// public String to