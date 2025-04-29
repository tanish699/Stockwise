package PortFolio;

public class PortFolio {
          
    Node root;

    class Node{
        String Company;
        Node left;
        Node right;

        private Node(String Company){
            this.Company = Company;
        }
    }

 // Insert Node in Tree
    public boolean insert(String Company){
        Node newNode = new Node(Company);
        if(root==null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true) {
           if(temp.Company.equals(newNode.Company)) return false;
           if(newNode.Company.compareTo(temp.Company) < 0){
            if(temp.left==null){
                temp.left=newNode;
                return true;
            }
            temp=temp.left;
        } else {
            if(temp.right==null){
                temp.right=newNode;
                return true;
            }
            temp=temp.right;
            } 
        }
    }
    
 //Contains in a BST
    public boolean contains(String Company){
        if(root == null) return false;
        Node temp = root;
        while(temp!= null){
            if(Company.compareTo(temp.Company) < 0){
                temp=temp.left;
            }
            else if(Company.compareTo(temp.Company) > 0){
                temp = temp.right;
            }
            else {
                return true;
            }
        }
        
        return false;
    }
    


    public static void main(String[] args) {
        System.out.println("Code executed without errors");
        
    }
    
}
