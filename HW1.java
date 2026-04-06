import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList {
    Node front = null, rear = null;
    int count = 0;

    // Enqueue
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        count++;
        System.out.println(data + " inserted into queue");
    }

    // Dequeue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(front.data + " removed from queue");
        front = front.next;

        if (front == null) {
            rear = null;
        }

        count--;
    }

    // Peek
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Display
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Count
    void count() {
        System.out.println("Number of elements: " + count);
    }
}

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList q = new QueueLinkedList();

        while (true) {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Count");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    q.count();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return; // exits program

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}