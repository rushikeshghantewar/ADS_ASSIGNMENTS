package DSArraypack;

public class LinkedListOP {
    Node head = null;
    Node tail = null;
    int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {    //check list is empty
            head = newNode;
            tail = newNode;
        } else {      // new node add at the tails
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void addAtMid(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            //store  at mid position
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);


            temp = head;
            current = null;


            for (int i = 0; i < count; i++)//
            {
                current = temp;
                temp = temp.next;
            }

            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }



    void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }
        public static void  main(String []args)
        {
            LinkedListOP lst=new LinkedListOP();

            lst.addNode(10);
            lst.addNode(20);
            lst.addNode(30);
            lst.display();

            lst.addAtMid(40);
            lst.display();

        }

    }

