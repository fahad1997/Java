package libraarymanagement;

public class HardCopyBook extends Books{

    private int NumberOfPages=0;
    
     public HardCopyBook(){
         BookInformation();
         System.out.println("number of pages:");
         NumberOfPages=input.nextInt();
     }
     
     public void printInfo(){
        System.out.println("Books id:"+b_id);
        System.out.println("Book Title:"+b_title);
        System.out.println("Book Author:"+b_author);
        System.out.println("Book Price:"+b_price);
        System.out.println("Number of Pages:"+NumberOfPages);
        if(bookavailable==0)
         {
             System.out.println("Book is available.");
         }
         else
         {
             
             System.out.println("Book isn't available.");
         }
        if(m_id!=null)
        {
            System.out.println("Member id:"+m_id);
        }
     }
}
