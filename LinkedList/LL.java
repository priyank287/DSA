package LinkedList;

class LL{

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    } 

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }


    // using currNode!= null inside loop because we need to reach after all the elements
    // , not capture the last element
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "--> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        LL list= new LL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.printList();

    }
}