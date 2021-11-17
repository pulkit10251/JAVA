package IMPLEMENTATIONS;

public class LinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addLast(int val){
        Node nn = new Node(val);

        if(this.size >= 1){
            this.tail.next = nn;
        }

        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size += 1;
        }else{
            this.tail = nn;
            this.size += 1;
        }
    }

    public void addFirst(int val){
        Node nn = new Node(val);

        if(this.size >= 1){
            nn.next = this.head;
        }

        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size += 1;
        }else{
            this.head = nn;
            this.size += 1;
        }
    }

    public int getFirst() throws Exception{
        if(this.size == 0){
            throw new Exception("Empty");
        }

        return this.head.val;
    }

    public int getLast() throws Exception{
        if(this.size == 0){
            throw new Exception("Empty");
        }

        return this.tail.val;
    }

    public int getAt(int idx) throws Exception{
        if(this.size == 0){
            throw new Exception("Empty");
        }
        if(idx  < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }

        Node temp = this.head;

        for(int i = 0; i < idx ; i++){
            temp = temp.next;
        }

        return temp.val;
    }

    public Node getNodeAt(int idx) throws Exception{
        if(this.size == 0){
            throw new Exception("Empty");
        }
        if(idx  < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }

        Node temp = this.head;

        for(int i = 0; i < idx ; i++){
            temp = temp.next;
        }

        return temp;
    }

    public void addAt(int idx, int val) throws  Exception{
        if(idx  < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }
        if(idx == 0){
            addFirst(val);
        }else if(idx == this.size -1){
            addLast(val);
        }else{
            Node nn = new Node(val);
            Node curr = getNodeAt(idx -1);
            nn.next = curr.next;
            curr.next = nn;
            this.size ++;
        }
    }

    public int removeFirst() throws  Exception{
        if(this.size == 0){
            throw new Exception("Empty!");
        }

        int rm = this.head.val;

        if(this.size == 1){
            this.head = null;
            this.tail = null;
        }else{
            Node temp = this.head.next;
            this.head.next = null;
            this.head = temp;
        }
        this.size --;

        return rm;
    }

    public int removeLast() throws  Exception{
        if(this.size == 0){
            throw new Exception("Empty!");
        }

        int rm = this.head.val;

        if(this.size == 1){
            this.head = null;
            this.tail = null;
        }else{
            Node sLast = getNodeAt(this.size -2);
            sLast.next = null;
            this.tail = sLast;
        }
        this.size --;
        return rm;
    }

    public int removeAt(int idx) throws  Exception{
        if(idx  < 0 || idx >= this.size){
            throw new Exception("Invalid Index");
        }

        if(idx == 0){
             return removeFirst();
        }else if(idx == this.size -1){
            return  removeLast();
        }else {
            Node curr = getNodeAt(idx - 1);
            int rem = curr.next.val;
            curr.next = curr.next.next;
            this.size --;
            return rem;
        }
    }

    public void display(){
        System.out.println();
        Node temp = this.head;
        int count = 0;
        while(temp != null){
            System.out.print(temp.val);
            if(count != this.size-1){
                System.out.print("->");
            }
            count++;
            temp = temp.next;
        }
    }
}
