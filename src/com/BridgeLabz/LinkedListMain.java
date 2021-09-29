package com.BridgeLabz;

import java.util.Scanner;

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
    public static void popFirstNode(){
        Node temp =head;
        if(head == null) {
            System.out.println("linked list does not have data");
        }
        else {
            head = head.next;
        }
    }
    public  void popLastNode() {
        Node node = head;
        Node tail = head;
        while (tail.next.next != null)
            tail = tail.next;
        tail.next = null;
    }
    //SearchNode Method is Used To Search For Required Nodes
    public void searchNode(int data){
        Node node = head;
        int length=0;
        while(node.data != data) {
            node = node.next;
            length++;
        }
        if(node.data == data){
            System.out.println("node"+node.data+"present position"+length);
        }
    }

    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        Scanner Sc = new Scanner(System.in);
        LinkedListMain linkedList = new LinkedListMain();
        System.out.println("LinkedList Data");
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);
        linkedList.display();

        Boolean Val = true;
        while(Val){
            System.out.println("\n 1.PopFirst \n 2.PopLast \n 3.Exit ");
            int Condition = Sc.nextInt();
            switch(Condition){
                case 1:
                    System.out.println("\nLinkedList Data After Popping First Node");
                    linkedList.popFirstNode();
                    linkedList.display();
                    break;
                case  2:
                    System.out.println("\nLinkedList Data After Popping Last Node");
                    linkedList.popLastNode();
                    linkedList.display();
                    break;
                default:
                    Val = false;
            }
        }
        System.out.println();
        linkedList.searchNode(56);
    }
}
