package librarymanagement;

import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        
        System.out.println("How many Books:");
        int numberofHardCopyBook=input.nextInt();
        input.nextLine();
        int i;
        HardCopyBook[] hb=new HardCopyBook[numberofHardCopyBook];
        for(i=0;i<numberofHardCopyBook;i++){
           System.out.println("Books id:");
           String id=input.next();
           System.out.println("Book Title:");
           String title=input.next();
           System.out.println("Book Author:");
           String author=input.next();
           System.out.println("Book Price:");
           double price=input.nextDouble();
           System.out.println("Number of pages:");
           int pageNum=input.nextInt();
           input.nextLine();
           hb[i] = new HardCopyBook(id,title,author,pageNum);
           hb[i].setBookPrice(price);
        }
        
        boolean borrowBook = true;
        
        while(borrowBook)
        {
           for(i=0;i<hb.length;i++){
              System.out.println("Books id:"+hb[i].getBookID()+"   "+"Book Title:"+hb[i].getBookTitle());
              System.out.println("Book Author:"+hb[i].getBookAuthor()+"   "+"Book Price:"+hb[i].getBookPrice());
              
              if (hb[i].getMemberIDForThisBook().equals("0")) 
              {
                System.out.print("Availability : The book is available...");
              } 
              else 
              {
                System.out.print("Availability : The book is not available...");
              }
           } 
           System.out.println("\nWhich Book you want to borrow :");
           String b_id = input.nextLine();
           for(i=0;i<hb.length;i++){   
            if(hb[i].getBookID().equalsIgnoreCase(b_id))
            {
               if(hb[i].getMemberIDForThisBook().equals("0")){
               
                Member m=new Member();
                m.Memberinfo();
                hb[i].updateMemberID(m.id,m.name);
                System.out.println("Do you want to Continue? Y/N:");
                String reply = input.next();
                borrowBook = reply.equalsIgnoreCase("y");
               }
            }
            else
            {
                System.out.println("This Book is Not available,,,,,,,");
                
                System.out.println("Do you want to Continue? Y/N:");
                String reply = input.next();
                borrowBook = reply.equalsIgnoreCase("y");
            }
          } 
    }
   }
}

