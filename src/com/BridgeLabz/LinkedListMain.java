package com.BridgeLabz;

import java.util.Scanner;

public class LinkedListMain {
    Node head;

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
    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        LinkedListMain linkedList = new LinkedListMain();
        linkedList.addNode(70);
        linkedList.addNode(30);
        linkedList.addNode(56);
        linkedList.display();

    }
}
