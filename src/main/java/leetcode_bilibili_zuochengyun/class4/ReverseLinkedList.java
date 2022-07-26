package leetcode_bilibili_zuochengyun.class4;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/20 9:41
 * @Version 1.0
 */
public class ReverseLinkedList {
    public static class Node{
        int value;
        Node next;
        public Node(int val){
            this.value = val;
        }
    }

    public static Node reverse(Node head){
        Node pre = null;
        Node next = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;


        Node head1 = node1;
        while (head1!=null){
            System.out.print(head1.value+" ");
            head1 = head1.next;
        }
        System.out.println();
        Node head2 = reverse(node1);
        while (head2!=null){
            System.out.print(head2.value+" ");
            head2 = head2.next;
        }


    }
}
