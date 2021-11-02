package OOP_asignment;

class Book{
	String bookName;
	int bookPrice;
	double bookDiscount;
	
	public Book() {
		
	}
	public Book(String bookName,int bookPrice,double bookDiscount) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscount = bookDiscount;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public double getDiscountBookPrice() {
		return bookPrice - (bookPrice*bookDiscount);
	}
	public int getDiscount() {
		return (int) (bookDiscount*100);
	}
}

public class BookTest {
	public static void main(String args[]) {
		Book bookArray [] = new Book[3];
		Book obj1 = new Book("SQL Plus", 50000, 0.05);
		Book obj2 = new Book("Java 2.0", 40000, 0.03);
		Book obj3 = new Book("JSP Servlet", 60000, 0.06);
		
		bookArray[0] = obj1;
		bookArray[1] = obj2;
		bookArray[2] = obj3;
		
		int addPrice = 0;
		double addDiscountPrice = 0;
		
		for(Book num: bookArray) {
			System.out.print(num.bookName + " ");
			System.out.print(num.bookPrice + " ");
			System.out.println(num.getDiscount() + "%");
			
			
			//System.out.println(num.getBookPrice());
			//System.out.println(num.getDiscountBookPrice());
			addPrice += num.getBookPrice();
			addDiscountPrice += num.getDiscountBookPrice();
		}
		System.out.println();
		System.out.println("책 가격의 합: " + addPrice + "원");
		System.out.println("할인 된 책 가격의 합: " + addDiscountPrice + "원");
	}
}
