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
		System.out.print("Nhap ma so DT: ");
        this.Did = sc.nextLine();
		System.out.print("Nhap mau cua DT: ");
        this.color = sc.nextLine();
		System.out.print("Nhap HDH cua DT: ");
         this.opera = sc.nextLine();
		System.out.print("Nhap gia DT: ");
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
        return "Did: "+Did+" color: "+color+" opera: "+opera+" price: "+price;
    }

}
