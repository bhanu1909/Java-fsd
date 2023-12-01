package phase1;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ap24singlelinkedlist {
    Node head;
    ap24singlelinkedlist() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ap24singlelinkedlist list = new ap24singlelinkedlist();

        // Insert elements into the linked list
        list.insert(5);
        list.insert(10);
        list.insert(15);

        // Display the elements of the linked list
        System.out.println("Elements in the linked list:");
        list.display();
    }
}