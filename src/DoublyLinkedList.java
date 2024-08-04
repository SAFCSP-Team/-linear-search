
class DoublyLinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void linearSearch(int target) {
        Node current = head;
        int iterations = 0;
        while (current != null) {
            iterations++;
            if (current.data == target) {
                System.out.println("Value" + target + "found after" + iterations + "iterations");
                return;
            }
            current = current.next;
        }
        System.out.println("Value" + target + "not found after" + iterations + "terations");
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);

        list.linearSearch(9);
    }
}
