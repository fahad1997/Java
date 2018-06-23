package libraarymanagement;

public class AudioBook extends Books{
    private double durationOfAudio=0.0;
    
    public AudioBook(){
        BookInformation();
        System.out.println("Duration of Audio:");
        durationOfAudio=input.nextDouble();
    }
    
    public void printInfoAudio(){
        System.out.println("Books id:"+b_id);
        System.out.println("Book Title:"+b_title);
        System.out.println("Book Author:"+b_author);
        System.out.println("Book Price:"+b_price);
        System.out.println("Duration of Audio:"+durationOfAudio);
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
