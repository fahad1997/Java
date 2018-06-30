package meenabazar;

import java.util.Scanner;

public class Product {

    private String p_name;
    private String p_id;
    private Double p_price;
    private int quantity = 0;
    Scanner input = new Scanner(System.in);

    public void ProductInfo() {

        System.out.println("Product name:");
        p_name = input.nextLine();
        System.out.println("Product id:");
        p_id = input.nextLine();
        System.out.println("Product Price:");
        p_price = input.nextDouble();
        System.out.println("Total amount of ProductP:");
        quantity = input.nextInt();
        input.nextLine();
    }

    public String getId() {
        return p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public Double getPrice() {
        return p_price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int am){
        quantity=quantity-am;
    }

    public boolean checkProduct(int amount) {
        return amount <= quantity;
    }
}
