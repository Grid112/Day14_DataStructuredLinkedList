package com.BridgeLabz;

public class LinkedListMain {
    static Node head;

    //Add Node Method Is Created To Add Nodes To LinkedList
    public void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(this.head == null){
            head = newNode;
        }
        else{
            Node last = this.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    //display Method Is created To Display linkedList
    public void display(){
        if(head == null){
            System.out.println("linked list has no value");
        }
        Node node = head;
        while(node.next != null){
            System.out.print("->"+node.data);
            node = node.next;
        }
        if(node.next == null){
            System.out.print("->"+node.data);
        }
    }
    static void insertAtMid(int N){
        if (head == null)
            head = new Node(N);
        else {
            Node newNode = new Node(N);

            Node pointer = head;
            int lenght = 0;
            while (pointer != null) {
                lenght++;
                pointer = pointer.next;
            }
            int count = ((lenght % 2) == 0) ? (lenght / 2) :
                    (lenght + 1) / 2;
            pointer = head;
            while (count-- > 1)
                pointer = pointer.next;
            // insert the 'newNode' and adjust
            // the required links
            newNode.next = pointer.next;
            pointer.next = newNode;
        }
    }
    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        LinkedListMain linkedList = new LinkedListMain();
        head = null;
        head = new Node(56);
        head.next = new Node(70);

        insertAtMid(30);
        linkedList.display();

    }
}
