package libraarymanagement;

import java.util.Scanner;

public class LibraaryManagement {

    public static void main(String[] args) {

             Scanner input=new Scanner(System.in);
      
                System.out.println("Name:");
                String name=input.nextLine();
                System.out.println("ID:");
                String id=input.nextLine();
                Member m=new Member(name,id);
                
                int i=0;
                  System.out.println("How many Hard copy books:");
                  int n=input.nextInt();
                  input.nextLine();
                  System.out.println("1.Hard copy Book.");
                  HardCopyBook hb[]=new HardCopyBook[n];
                  for(i=0;i<n;i++){
                      hb[i]=new HardCopyBook();
                  }
                  
                  System.out.println("how many Audio books.");
                  int j=input.nextInt();
                  input.nextLine();
                  AudioBook ab[]=new AudioBook[n];
                  for(i=n;i<n+j;i++){
                      ab[i]=new AudioBook();
                  }
                  
                for(i=0;i<n;i++){
                    hb[i].printInfo();
                }
                for(i=n;i<n+j;i++){
                    ab[i].printInfoAudio();
                }
            
            System.out.println("Borrow book...Chosse book id:");
            String book_id=input.nextLine();
            for(i=0;i<n;i++){
                    if(hb[i].b_id.equalsIgnoreCase(book_id))
                    {
                        if(hb[i].bookavailable==0)
                        {
                            hb[i].bookavailable=1;
                        }
                    }
                    else
                    {
                        System.out.println("Book is not available...");
                    }
                }
            for(i=n;i<n+j;i++)
            {
                if(ab[i].b_id.equalsIgnoreCase(book_id))
                    {
                        if(ab[i].bookavailable==0)
                        {
                            ab[i].bookavailable=1;
                        }
                    }
                    else
                    {
                        System.out.println("Book is not available...");
                    }
            }
    }
  }
 