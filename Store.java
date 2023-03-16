import java.util.ArrayList;

public class Store {
    ArrayList<Invoice> invoice;
    public Store(){
        invoice = new ArrayList<>();
    }
    public void printInvoice(){
        for(Invoice i: invoice){
            System.out.println(i);
        }   
    }
    public void printInvoice(int index){
        System.out.println(invoice.get(index));
    }
    public void printInvoice(Invoice i){
        System.out.println(i);
    }
    public void addInvoice(Invoice i){
        invoice.add(i);
    }
    public void removeInvoice(Invoice i){
        invoice.remove(i);
    }
    public ArrayList<Invoice> getInvoice(){
        return invoice;
    }
    public void setInvoice(ArrayList<Invoice> invoice){
        this.invoice = invoice;
    }
    public void clearInvoice(){
        invoice.clear();
    }
    public void setInvoice(Invoice i){
        invoice.add(i);
    }
    public Invoice getInvoice(int index){
        return invoice.get(index);
    }
    public void setInvoice(int index, Invoice i){
        invoice.set(index, i);
    }
    public void removeInvoice(int index){
        invoice.remove(index);
    }
    public int size(){
        return invoice.size();
    }
    public void sellPhone()
    {
        Invoice inv =new Invoice();
        inv.input();
        invoice.add(inv);
    }
    
}
