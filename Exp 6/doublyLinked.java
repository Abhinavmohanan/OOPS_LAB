import java.util.Scanner;

class doublyLinked {
    Node head = null;

    void addtoList(int val) {
        Node pos = head;
        Node n = new Node(val);
        if (pos == null) {
            head = new Node(val);
            return;
        } else {
            while (pos.next != null) {
                pos = pos.next;
            }
            pos.next = n;
            n.before = pos;
        }
    }

    void addtoFirst(int val) {
        Node pos = head;
        Node n = new Node(val);
        if (pos == null) {
            head = new Node(val);
            return;
        } else {
            n.next = head;
            head.before = n;
            head = n;
        }
    }

    void addatPos(int val, int index) {
        Node pos = head;
        Node n = new Node(val);
        int current = 2;
        if (pos == null) {
            head = new Node(val);
            return;
        } else if (index == 1) {
            n.next = head;
            head.before = n;
            head = n;
        } else {
            while (pos != null && current != index) {
                pos = pos.next;
                current++;
            }
            if (pos == null) {
                System.out.println("Enter valid position to insert !!");
                return;
            }
            n.next = pos.next;
            n.before = pos;
            pos.next = n;
            if (n.next != null) {
                n.next.before = n;
            }
        }
    }

    void remove(int index) {
        Node pos = head;
        // Node temp = null;
        int current = 2;
        if (index == 1) {
            head = head.next;
            return;
        }
        if (pos == null) {
            System.out.println("Empty List");
            return;
        } else {
            while (pos != null && current != index) {
                pos = pos.next;
                current++;
            }
            if (pos == null || pos.next == null) {
                System.out.println("Position not found");
                return;
            }
            if (pos.next.next != null) {
                pos.next.next.before = pos.next.before;
            }
            pos.next = pos.next.next;
        }
    }

    void display() {
        Node pos = head;
        if (pos == null) {
            System.out.println("Empty List");
            return;
        } else {
            System.out.print("List elements are : ");
            while (pos != null) {
                System.out.print(pos.data + " ");
                pos = pos.next;
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        doublyLinked dll = new doublyLinked();
        int option, val, index;
        do {
            System.out
                    .println(
                            "Choose Option :\n1.Add at end\n2.Add at first\n3.Add at position\n4.Delete element\n5.Display List\n6.Exit");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter element: ");
                    val = read.nextInt();
                    dll.addtoList(val);
                    break;
                case 2:
                    System.out.println("Enter element: ");
                    val = read.nextInt();
                    dll.addtoFirst(val);
                    break;
                case 3:
                    System.out.println("Enter position: ");
                    index = read.nextInt();
                    System.out.println("Enter element: ");
                    val = read.nextInt();
                    dll.addatPos(val, index);
                    break;
                case 4:
                    System.out.println("Enter position: ");
                    val = read.nextInt();
                    dll.remove(val);
                    break;
                case 5:
                    dll.display();
                    break;
                case 6:
                    read.close();
                    System.exit(0);
                default:
                    System.out.println("Enter Correct Option !!");
            }
        } while (true);
    }

}

class Node {
    int data;
    Node before = null;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}