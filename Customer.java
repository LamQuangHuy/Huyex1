import java.util.Scanner;

public class Customer {
	public String id;
	public String name;
	public String pnb;
    public String address;
	private Scanner sc = new Scanner(System.in);
	
	public Customer() {}

	
	// co tham so
	public Customer(String id, String name, String pnb,String address) {
		this.id = id;
		this.name = name;
		this.pnb=pnb;
        this.address=address;
	}
	public void input(){
		System.out.print("input id of custom: ");
        id = sc.nextLine();
		System.out.print("input name of custom: ");
        name = sc.nextLine();
		System.out.print("Input phone number of custom: ");
        pnb = sc.nextLine();
		System.out.print("Input custom's address: ");
        address = sc.nextLine();
	}
       
	public String getId(){
		return id;
	}
	public String getName(){
        return name;
    }	
	public String getPnb(){
        return pnb;
    }
	public String getAddress(){
        return address;
    }
	public void setId(String id) {
        this.id = id;
    }
	public void setName(String name) {
        this.name = name;
    }
	
	public void setPnb(String pnb) {
        this.pnb = pnb;
    }
	public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
		return "Customer [id=" + id + ", name=" + name + ", pnb=" + pnb + ", address=" + address + "]";
	}	

	

	
	
	
}