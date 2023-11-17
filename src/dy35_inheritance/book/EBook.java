package dy35_inheritance.book;

public class EBook extends Book{

    int pages;
    public void read(){
        System.out.println("Reading a digital copy of " +
                title + " which hfs " + pages +
                " pages. ");
    }

}
