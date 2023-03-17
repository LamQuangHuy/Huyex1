import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

    public String date;
    ArrayList<Device> device;
    Customer cus;
    private Scanner sc = new Scanner(System.in);
    public Invoice(){
        
        this.device = new ArrayList<Device>();
        
    };

    public Invoice(String date) {
        this.date = date;
        this.device = new ArrayList<Device>();
        this.cus = new Customer();
    }
    public void input()
    {
        System.out.println("Enter the date of the invoice:");
        Scanner sc = new Scanner(System.in);
        date = sc.nextLine();
        System.out.println("Enter the number of devices:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Device d = new Device();
            d.input();
            addDevice(d);
        }
        System.out.println("Enter the customer:");
        Customer cus = new Customer();
        cus.input();
        this.cus = cus;
        
    }

    public double totalCost() {
        double ttc = 0;
        for (Device d : device) {

            if (date == "05/05" && d.price >= 590)
                ttc = ttc + 0.1 * d.price;
            else
                ttc += d.price;

        }
        return ttc;
    }
    public void addDevice(Device d) {
        this.device.add(d);
    }
    public void removeDevice(Device d) {
        this.device.remove(d);
    }
    public void addCustomer(Customer c) {
        this.cus = c;
    }
    public void removeCustomer(Customer c) {
        this.cus = null;
    }
    public Customer getCustomer() {
        return this.cus;
    }
    public String toString()
    {
        String dv ="";
        for (Device d : device) {
            dv+=d.toString()+"\n";
        }
        return "Invoice of " + cus.toString()+ " has bought "+ device.size()+" device:" +"\n"+dv+"And the total cost:"+totalCost();

    }

}
