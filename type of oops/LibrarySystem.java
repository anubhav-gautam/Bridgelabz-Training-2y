import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id,String t,String a){
        this.itemId=id; this.title=t; this.author=a;
    }
    public void getItemDetails(){
        System.out.println(title+" by "+author+" (ID:"+itemId+")");
    }
    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved=false;
    public Book(int id,String t,String a){ super(id,t,a); }
    public int getLoanDuration(){ return 14; }
    public void reserveItem(){ reserved=true; }
    public boolean checkAvailability(){ return !reserved; }
}

class Magazine extends LibraryItem {
    public Magazine(int id,String t,String a){ super(id,t,a); }
    public int getLoanDuration(){ return 7; }
}

class DVD extends LibraryItem {
    public DVD(int id,String t,String a){ super(id,t,a); }
    public int getLoanDuration(){ return 5; }
}

public class LibrarySystem {
    public static void main(String[] args){
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1,"Java","Herbert"));
        items.add(new Magazine(2,"Time","Editor"));
        items.add(new DVD(3,"Movie","Director"));

        for(LibraryItem li: items){
            li.getItemDetails();
            System.out.println("Loan Duration: "+li.getLoanDuration()+" days");
        }
    }
}
