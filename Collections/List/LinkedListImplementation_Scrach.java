class Linkedlist{

    Node head;
    private int size;

    Linkedlist(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
           this.data = data;
           this.next = null;

           size++;
        }
    }
    // add element at first using addFirst.
    public void addFirst(String data){

        Node newNode = new Node(data);
        // when we add new element that will be a head. ex. 1 <- 2 <- 3 <-4 so next head will be 4.
        newNode.next = head;
        head = newNode;
    }
    // add elemenet at the end using addLast.
    public void addLast(String data){

        Node newNode = new Node(data);
        // when we add new element add the last then first element will be head.
        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;

        while(lastNode.next != null){
             lastNode = lastNode.next;

        }
        lastNode.next = newNode;
    }

   // Print List
    public void printList() {
        
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+"->");

            currNode = currNode.next;

        }
        System.out.print("null");
    }

    // Remove First element

    public void removeFirst(){
        if(head == null){
             System.out.println("Empty List, Nothing to delete");

             return;
        }
        head = this.head.next;
        size--;
    }

    // remove lst element.
    public void removeLast() {
    
        if(head.next == null){
            head = null;
            return;
       }

       Node currNode = head;

       Node lastNode = head.next;

       while (lastNode.next != null) {
           currNode = currNode.next;

           lastNode = lastNode.next;
       }
       currNode.next = null;

    }
    
       

    // get a size of an  lineked list
    public int getSize(){
      return size;
    }

}



public class LinkedListImplementation_Scrach{
    public static void main(String args []){
        Linkedlist li = new Linkedlist();

        li.addLast("is");
        li.addLast("a");
        li.addLast("a");
        li.addLast("list");

        li.printList();

        li.addFirst("This");

        li.printList();

        System.out.println(li.getSize());

        // rempve first element
        li.removeFirst();
        li.printList();

        // remove lst element.
        li.removeLast();
        li.printList();

    }
}