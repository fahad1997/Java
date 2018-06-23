package libraarymanagement;

import java.util.Scanner;

public class Books {

    public String b_id;
    public String b_title;
    public String b_author;
    public double b_price;
    public int bookavailable=0;
    public String m_id=null;
    Scanner input=new Scanner(System.in);
    
    public void BookInformation(){
        System.out.println("Books id:");
        b_id=input.nextLine();
        System.out.println("Book Title:");
        b_title=input.nextLine();
        System.out.println("Book Author:");
        b_author=input.nextLine();
        System.out.println("Book Price:");
        b_price=input.nextDouble();
    }
}
