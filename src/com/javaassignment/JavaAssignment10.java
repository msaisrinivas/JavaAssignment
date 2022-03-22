package com.javaassignment;

// Nodes
class Node{
    String line;
    Node next;
    Node(String given_line){
        this.line=given_line;
        this.next=null;
    }

    @Override
    public String toString() {
        if(this.line == null){
            return "null";
        }
        else{
            return this.line;
        }
    }
};

//Slist
class SList{
    Node head = new Node(null);
    public SListIterator iterateList() {
        return new SListIterator(head);
    }
    public String toString() {
        if(head==null) {
            return "list is empty: ";
        }
        SListIterator iterator = this.iterateList();
        StringBuilder lines=new StringBuilder();
        while (iterator.hasNext()) {
            lines.append(iterator.next() + (iterator.hasNext() ? "->" : ""));
        }
        return ""+lines;
    }
};

//SListIterator
class SListIterator{
    Node temp;

    public SListIterator(Node head) {
        this.temp=head;
    }

    public boolean hasNext() {
        return this.temp.next != null;
    }

    public Node next() {
        temp = temp.next;
        return temp;
    }

    public void insertNode(String line){
        temp.next  = new Node(line);
        temp=temp.next;
    }

    public void removeNode(){
            this.temp.next= this.temp.next.next;
    }
}
public class JavaAssignment10 {

    public static void main(String[] args) {
        SList sl = new SList();
        SListIterator sli = sl.iterateList();
        System.out.print(sl);
        sli.insertNode("Cool!");
        sli.insertNode("Hello");
        sli.insertNode("World");
        System.out.println(sl.toString());
        SListIterator slir = sl.iterateList();
        slir.removeNode();
        System.out.println(sl.toString());
    }

}
