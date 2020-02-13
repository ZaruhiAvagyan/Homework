package com.collection;

public class DoublyLinkedList {

    Node head;
    public Node getHead() { return head; }
    public void setHead(Node head) { this.head = head; }


    class Node {
        ComparableStudent data;
        Node previous;
        Node next;

        public Node(ComparableStudent data){
            this(data, null, null);
        }

        public Node(ComparableStudent data, Node previous, Node next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        public ComparableStudent getData() { return data; }
        public void setData(ComparableStudent data) { this.data = data; }
        public Node getPrevious() { return previous; }
        public void setPrevious(Node previous) { this.previous = previous; }
        public Node getNext() { return next; }
        public void setNext(Node next) { this.next = next; }
    }

    //inserts at the front
    public void push(ComparableStudent student){

        Node first = new Node(student);
        first.setNext(getHead());
        first.setPrevious(null);
        if(getHead() != null)
            getHead().setPrevious(first);
        setHead(first);
    }

    //remove from front and return
    public ComparableStudent pop(){
        if(getHead() == null)
            return null;
        else if(getHead().getNext() == null) {
            Node temp = getHead();
            setHead(null);
            return  temp.getData();
        }else{
            Node toBeRemovedHead = getHead();
            Node next = toBeRemovedHead.getNext();
            next.setPrevious(null);
            getHead().setNext(null);
            setHead(next);
            return toBeRemovedHead.getData();
        }
    }

    public void addLast(ComparableStudent student){
        if(getHead() == null){
            Node onlyNode = new Node(student);
            setHead(onlyNode);
            getHead().setPrevious(null);
            getHead().setNext(null);
        }
        else{
            Node lastNode = new Node(student);
            lastNode.setNext(null);
            Node temp = getHead();
            while (temp.getNext() != null)
                temp = temp.getNext();
            lastNode.setPrevious(temp);
            temp.setNext(lastNode);
        }
    }

    //removes and returns the last
    public ComparableStudent removeLast(){
        Node temp = getHead();
        if(temp == null)
            return null;
        else if(temp.getNext() == null) {
            setHead(null);
            return temp.getData();
        }else{
            while(temp.getNext()!=null)
                temp = temp.getNext();
            temp.getPrevious().setNext(null);
            temp.setPrevious(null);
            return temp.getData();
        }
    }

    public int size(){
        Node temp = getHead();
        int count = 0;
        if(temp != null) {
            count = 1;
            while (temp.getNext() != null) {
                temp = temp.getNext();
                count++;
            }
        }
        return count;
    }

    public static void print(DoublyLinkedList list){
        Node temp = list.getHead();
        if(temp != null) {
            System.out.println(temp.getData().toString());
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.println(temp.getData().toString());
            }
        }
    }
}
