/*

Problem Statement
Given a linked list of N nodes. The task is to reverse the list by changing links between nodes (i.e if the list is 1->2->3->4 then it becomes 1<-2<-3<-4) and return the head of the modified list.
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
		// return the head of the modified linked list
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }