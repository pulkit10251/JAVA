package LINKED_LIST;

class Node {
    Node next;
    int data;
    Node(){

    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {



    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void display() {
        Node temp = this.head;
        System.out.println("--------------------------------");
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

    public void addLast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size >= 1) {
            this.tail.next = nn;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        if (this.size >= 1) {
            nn.next = head;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;
        }
    }

    public int getFirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty");
        }
        return this.head.data;
    }

    public int getlast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Empty");
        }
        return this.tail.data;
    }

    public int getAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is Empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("invalid Index");
        }
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Node getNodeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is Empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("invalid Index");
        }
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void AddAt(int item, int idx) throws Exception {
        if (idx < 0 || idx > this.size) {
            throw new Exception("invalid index");
        }
        if (idx == 0) {
            addFirst(item);
        } else if (idx == this.size) {
            addLast(item);
        }
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        Node nm1 = getNodeAt(idx - 1);
        Node np1 = nm1.next;
        nm1.next = nn;
        nn.next = np1;

        this.size++;
    }

    public int removeFirst() throws Exception {

        if (this.size == 0) {
            throw new Exception("ll is empty");
        }
        int rv = this.head.data;

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }

    public int removeLast() throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is empty");
        }
        int rv = tail.data;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node lm1 = getNodeAt(this.size - 2);
            this.tail = lm1;
            this.tail.next = null;
            this.size--;

        }
        return rv;
    }

    public int removeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("ll is empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("invalid Index");
        }
        if (idx == this.size - 1) {
            return removeLast();
        } else if (idx == 0) {
            return removeFirst();
        } else {
            Node nm1 = getNodeAt(idx - 1);
            Node n = nm1.next;
            Node np1 = n.next;
            int rv = n.data;
            nm1.next = np1;
            this.size--;
            return rv;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean IsEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public void ReverseIterative(){
        Node prev = this.head;
        Node curr = prev.next;

        while(curr != null){
            Node temp = curr.next;
            curr.next =   prev;
            prev = curr;
            curr = temp;
        }
        Node t = this.head;
        this.head = this.tail;
        this.tail = t;
        this.tail.next = null;
    }


    public void ReverseRecursive(){
        this.head = Reverse(this.head);
    }

    public Node Reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node rest = Reverse(head.next);
        head.next.next = head;

        head.next = null;

        return rest;
    }


    public void ReverseGroupQ2(){

    }




}
