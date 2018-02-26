package labexam;

public class Player {

    private final String Name;
    private final int Age;
    private final double prize_money_for_single_match;
    private double money;
    private double total_money=0.0;
    
   public Player(String N,int a,double pm){
       Name=N;
       Age=a;
       prize_money_for_single_match=pm;
   }
   public double Total_Prize_Money(){
       money=prize_money_for_single_match*10;
       return money;
   }
   public void bonus(int a){
       if(a>10)
       {
             total_money=money+1000;
       }
   }
    public void display(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Prize money for single match:"+prize_money_for_single_match);   
        System.out.println("Bonus:"+total_money);   
    } 
}
