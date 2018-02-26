package labexam;
import java.util.Scanner;
public class LabExam {
    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        System.out.println("Name:");
        String Name=input.nextLine();
        System.out.println("Age:");
        int age=input.nextInt();
        System.out.println("Prize money for a single match:");
        double pm=input.nextDouble();
        Player miraz=new Player(Name,age,pm);
        double total_prize_money=miraz.Total_Prize_Money();
        System.out.println("Total Prize Money for 10 matches:"+total_prize_money);
        System.out.println("How many match he had played:");
        int a=input.nextInt();
        miraz.bonus(a);
        miraz.display();
    }
    
}
