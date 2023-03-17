import java.util.Scanner;

public class Device {
    public String Did;
	public String  color;
    public String opera;
    public int price;
    private Scanner sc = new Scanner(System.in);
    public Device(){}
    public Device(String Did,String color,String opera,int price){
        this.Did = Did;
        this.color = color;
        this.opera = opera;
        this.price = price;
    }
    public void input(){
		System.out.print("Input ID of phone: ");
        this.Did = sc.nextLine();
		System.out.print("Input color of phone: ");
        this.color = sc.nextLine();
		System.out.print("Input the opera system name: ");
         this.opera = sc.nextLine();
		System.out.print("Input the price of phone: ");
        this.price = sc.nextInt();
	}
    public String getDid() {
        return Did;
    }           
    public String getColor() {
        return color;
    }
    public String getOpera() {
        return opera;
    }           
    public int getPrice() {
        return price;
    }
    public void setDid(String Did) {
        this.Did = Did;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOpera(String opera) {
        this.opera = opera;
    }   
    public void setPrice(int price) {
        this.price = price;
    }   
    @Override
    public String toString(){
        return "-    "+"PhoneID: "+Did+" color: "+color+" opera: "+opera+" price: "+price;
    }

}
