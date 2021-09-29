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
    //This Method Is Used To Pop Head
    public static void pop(){
        Node temp =head;
        if(head == null) {
            System.out.println("linked list does not have data");
        }
        else {
            head = head.next;
        }
    }
    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        LinkedListMain linkedList = new LinkedListMain();
        System.out.println("LinkedList Data");
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);
        linkedList.display();
        System.out.println("\nLinkedList Data After Popping");
        linkedList.pop();
        linkedList.display();

    }
}
