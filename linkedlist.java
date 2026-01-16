// Node definition (LeetCode style)
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// Linked List implementation
class MyLinkedList {

    ListNode head;

    // Constructor
    MyLinkedList() {
        head = null;
    }

    // 1. Create list from array
    public void createList(int[] arr) {
        for (int val : arr) {
            insertAtEnd(val);
        }
    }

    // 2. Insert at front
    public void insertAtFront(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    // 3. Insert at end
    public void insertAtEnd(int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // 4. Insert at position (0-based)
    public void insertAtPosition(int val, int pos) {
        if (pos == 0) {
            insertAtFront(val);
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        ListNode node = new ListNode(val);
        node.next = temp.next;
        temp.next = node;
    }

    // 5. Delete from front
    public void deleteFromFront() {
        if (head == null) return;
        head = head.next;
    }

    // 6. Delete from end
    public void deleteFromEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // 7. Delete at position (0-based)
    public void deleteAtPosition(int pos) {
        if (head == null) return;

        if (pos == 0) {
            deleteFromFront();
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp.next == null) return;
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Print the list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class to test everything
public class linkedlist {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.createList(new int[]{1, 2, 23, 43});
        list.printList();

        list.insertAtFront(0);
        list.printList();

        list.insertAtEnd(99);
        list.printList();

        list.insertAtPosition(15, 2);
        list.printList();

        list.deleteFromFront();
        list.printList();

        list.deleteFromEnd();
        list.printList();

        list.deleteAtPosition(2);
        list.printList();
    }
}
