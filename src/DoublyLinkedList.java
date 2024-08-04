
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

