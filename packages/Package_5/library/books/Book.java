package Package.Package_5.library.books;
import java.util.ArrayList;

public class Book {
	public ArrayList<String> bookname = new ArrayList<String>();
	public void addbooks(String books) {
		bookname.add(books);
	}
	public void displaybook() {
		if(bookname.size()>0) {
			for(int i=0;i<bookname.size();i++) {
				System.out.println(i+" "+bookname.get(i));
			}
		}
	}
}
