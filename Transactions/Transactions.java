package Transactions;

public class Transactions {
    private Node Head;  
    private Node Tail; 
    private int length; 

    class Node{  
        int Amount; 
        String Company;
        Node next; 
        

        
        Node(int Amount, String Company){
            this.Amount = Amount;
            this.Company = Company;
            
        }
    }

    public Transactions(int Amount, String Company){
        Node newNode = new Node(Amount, Company);
        Head = newNode;
        Tail = newNode;
        length = 1;
    }

    public void print(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.Amount+" "+temp.Company);
            temp = temp.next;
        }
    }

    public void append(int Amount, String Company){
        Node newNode = new Node(Amount, Company);

        if(length==0){
            Head=newNode;
            Tail=newNode;
        } else{
            Tail.next=newNode;
            Tail = newNode;
        } 
        length++;
    }
    
    

    public static void main(String[] args) {
        System.out.println("Code Executed Without Errors");
    }
    
}
