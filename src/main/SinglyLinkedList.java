package main;

public class SinglyLinkedList {

    private Node head = null;
    private int size = 0;


   public void  insert(int value ){
       head = new Node(value,this.head);
       size++;
   }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        Node temp = this.head;

        while (temp != null) {
            result.append(temp.data);
            if (temp.next != null){

            }
            temp = temp.next;
        }
        result.append("}");

        return result.toString();

    }
    public static void main(String[] args) {

        SinglyLinkedList linkedlist = new SinglyLinkedList();
        for (int i =0 ; i < 5 ; i++) {
            linkedlist.insert(i + 1);
        }
        System.out.println(linkedlist);


    }
    private static  class Node{
            private int data;
            private Node next;

            private Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }

            public Node(int data) {
                this.data = data;
                this.next =null;
            }
        }

    }

