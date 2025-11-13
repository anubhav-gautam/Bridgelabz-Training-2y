package Package.Package_5.library.transactions;
import Package.Package_5.library.books.*;
import Package.Package_5.library.members.*;
import java.util.*;

public class Transaction {
	Member mem = new Member();
	Book b = new Book();
	public void issue(String name, String book) {
		for(int i=0;i<mem.newmembers.size();i++) {
			if(mem.newmembers.get(i).equals(name)) {
				for(int j=0;j<b.bookname.size();j++) {
					if(b.bookname.get(j).equals(book)) {
						System.out.print(book+" book is issued by "+name+".");
					}
					else {
						System.out.print("This book is not in our library.");
					}
				}
			}
			else {	
				System.out.print("You are not member of our library.");
			}
		}
	}
	public void returnbook(String name, String book) {
		for(int i=0;i<mem.newmembers.size();i++) {
			if(mem.newmembers.get(i).equals(name)) {
				for(int j=0;j<b.bookname.size();j++) {
					if(b.bookname.get(j).equals(book)) {
						System.out.print(name+" is returned by "+book+".");
					}
					else {
						System.out.print("This book is not of our library.");
					}
				}
			}
			else {	
				System.out.print("You are not member of our library.");
			}
		}
	}
}
