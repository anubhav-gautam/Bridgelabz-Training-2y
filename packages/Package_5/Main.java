package Package.Package_5;
import Package.Package_5.library.members.*;
import Package.Package_5.library.books.*;
import Package.Package_5.library.transactions.*;
import java.util.*;

public class Main {
	static Member newperson = new Member();
	static Book book = new Book();
	static Transaction tran = new Transaction();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean app =true;
		while(app) {
			System.out.println("Welcome to our library😊😊😊");
			System.out.println("If you are staff enter 1 else if you are user enter 0: ");
			int type = input.nextInt();
			input.nextLine();
			if(type==1) {
				boolean work = true;
				while(work) {
					System.out.println("To change the mode enter 0 or to exit the application enter 1.");
					System.out.print("Add books to library: ");
					String bookname = input.nextLine();
					if(bookname.equals("0")) {
						work = false;
					}
					else if(bookname.equals("1")) {
						work=false;
						app = false;
					}
					else {
						book.addbooks(bookname);
					}
				}
			}
			else if(type==0) {
				System.out.println("If you are new user then be a member by entering 1");
				System.out.println("If you want to issue a book enter 2");
				System.out.println("If you want to return a book enter 3");
				System.out.println("To exit enter 4");
				int userinput = input.nextInt();
				input.nextLine();
				if(userinput==1) {
					System.out.println("Enter your name: ");
					String name = input.nextLine();
					newperson.addmember(name);
				}
				else if(userinput==2) {
					book.displaybook();
					System.out.print("Enter your name: ");
					String name = input.nextLine();
					System.out.print("Enter the name of you want to issue: ");
					String bookname = input.nextLine();
					tran.issue(name,bookname);
				}
				else if(userinput==3) {
					System.out.print("Enter your name: ");
					String name = input.nextLine();
					System.out.print("Enter the name of you want to return: ");
					String bookname = input.nextLine();
					tran.returnbook(name,bookname);
				}
				else if(userinput==4) {
					app=false;
				}
				else {
					System.out.print("Invalid output.");
				}
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}
}
