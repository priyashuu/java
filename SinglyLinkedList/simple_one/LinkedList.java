public class linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        // by function
        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

        public static void displayr(Node head) {
            if (head == null) {
                return;
            }
            displayr(head.next);
            System.out.print(head.data + " ");

        }

        // printing the length of the code
        public static int length(Node a) {
            int count = 0;
            while (a != null) {
                count++;
                a = a.next;
            }
            return count;

        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(1);
        Node e = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // System.out.print(a.data + " ");
        // System.out.print(b.data +" ");
        // System.out.print(c.data +" ");
        // System.out.print(d.data +" ");
        // System.out.print(e.data +" ");

        // Node temp = a;
        // for (int i =1 ; i<=5 ; i ++){
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // while (temp!=null){ // printing the list linked list
        // System.out.print(temp.data + " ");
        // temp=temp.next;
        // }

        Node.display(a); // Use the display function to print the linked list
        System.out.println();
        Node.displayr(a);
        System.out.println();
        System.out.println(Node.length(a));
    }
}
