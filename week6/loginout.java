package week6;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class User {
	String userId, password;
	static int count;
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
}

public class loginout {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		User obj;
		
		while (true) {
			System.out.println("================================");
			System.out.println("1.Sign Up\n2.Login\n3.Print All Userd\n4.Exit\n5.Save");
			System.out.println("================================");
			System.out.println("Choose menu: ");

			int num = in.nextInt();
			
			if (num == 1) {
//				FileWriter fWriter = new FileWriter("./data/Userinformation");
//				BufferedWriter out = new BufferedWriter(fWriter) ;
				System.out.print("Enter a ID: ");
				String Id = in.nextLine();
				System.out.print("Enter a password: ");
				String password = in.nextLine();
				
//				obj.userId = Id;
//				obj.password = password;
//				out.write(Id, password);
				
			} else if (num == 2) {
				System.out.print("Enter a user Id: ");
				String userid = in.nextLine();
				System.out.print("Enter a user password: ");
				String userpasword = in.nextLine();
				
			} else if (num == 3) {
//				FileReader fReader = new FileReader("./data/Userinformation");
//				BufferedReader out = new BufferedReader(fReader);
			} else if (num == 4) {
				System.out.println("Exit.");
				break;
			} else if (num == 5) {
				
			}else {
				System.out.println("error");
				break;
			}
			in.close();
		}
	}

}
