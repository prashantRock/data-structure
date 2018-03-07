package com;

class Node {

    public int data;
    public Node next;

    public Node(){}

    public Node(int data){
        this.data = data;
    }

}

 class LinkList{

     private Node head;

     public LinkList(){};

     public LinkList(int data){
         this.head = new Node(data);
     }

     public void insertFirst(int data){
         Node temp = head;
         head = new Node(data);
         head.next = temp;
     }

     public void insertLast(int data){
         Node temp = head;
         while (temp.next !=null){
             temp = temp.next;
         }
         temp.next = new Node(data);
     }

     public int size(){
         int size = 1;
         Node temp = head;
         while (temp.next!=null){
             temp = temp.next;
             ++size;
         }
         return size;
     }

}
