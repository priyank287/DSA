package LinkedList;

public class LL{

    Node head;
    //class definition
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }

        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // add at n
    public void addAtn(int data, int position){
        Node newNode = new Node(data);
        Node currNode = head;
        // handle the case where the list length is shorter than required

        for(int i= 1 ; i<position - 1 ;i++){
            currNode = currNode.next;
        }
        // main logic
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // delete at n
    public void deleteAtN(int position) {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (position < 1) {
            throw new IllegalArgumentException("Position must be >= 1");
        }
        // Delete head
        if (position == 1) {
            head = head.next;
            return;
        }
        Node curr = head;

        // Go to (position - 1)th node
        for (int i = 1; i < position - 1; i++) {
            if (curr.next == null) {
                throw new IllegalArgumentException("Position out of bounds");
            }
            curr = curr.next;
        }
        if (curr.next == null) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        curr.next = curr.next.next;
    }


    // find middle

    // search for value n

    // iterative reverse

    // recursive reverse

    // delete nth from last

    // k-reverse

    // detect cycle

    // Y- intersection

    // merge two sorted list

    // merge sort on Linked List

    // reorder list

    // add two numbers

    // find duplicate number

    // LRU Cache


    public static void main(String[] args){
        LL list = new LL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.addLast(6);
        list.printList();

        list.addAtn(44, 4);
        list.printList();

        list.deleteAtN(4);
        list.printList();
    }
}
