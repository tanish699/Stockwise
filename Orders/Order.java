package Orders;



public class Order {
       
    private Node first;
    private Node last;
    private int Price;
    private int quantity;
    private String Company;
    private int length;

    class Node{
        int Price;
        int quantity;
        String Company;
        Node next;

        Node(int Price, int quantity, String Company){
            this.Price=Price;
            this.quantity=quantity;
            this.Company=Company;
        }
    }

    public Order(int Price, int quantity, String Company){
        Node newNode = new Node(Price, quantity, Company);
        first = newNode;
        last = newNode;
        length = 1;
    }


    public void printOrders() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.Price +" "+ temp.quantity + " " + temp.Company);
            temp = temp.next;
        }
        System.out.println("---------");
    }

    public void addOrder(int Price, int quantity, String Company){
        Node nn = new Node(Price, quantity, Company);
        if(length==0){
            first = nn;
            last = nn;
        } else {
           last.next = nn;
           last = nn;
        }
        length++;
    }


    public Node executeOrder(){
        if(length==0){
            return null;
        }
        Node temp = first;
        if(length==1){
            first = null;
            last = null;
        } else {
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }



    public static void main(String[] args) {
        System.out.println("Code executed Sucessfully");
    }
    
}
