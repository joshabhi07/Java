public class one 

    
 {
    public static void main(String[] args) {
     int[] product_Prices={75,85,65,25,35,45};
     

     int total=0;
     for(int price:product_Prices){
        total=total + price;
     }
     System.out.println(total);
    }
}