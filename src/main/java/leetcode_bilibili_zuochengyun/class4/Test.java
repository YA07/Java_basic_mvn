package leetcode_bilibili_zuochengyun.class4;
import java.util.Stack;

public class Test {
    public static class Node{
        public int value;
        public Node next;

        public Node(int data){
            this.value = data;
        }
    }

    public static boolean isPalindrome1(Node head){
        if(head==null||head.next==null){
            return true;
        }
        Node right = head.next;
        Node cur = head;
        while (cur.next!=null && cur.next.next!=null){
            right = right.next;
            cur = cur.next.next;
        }
        Stack<Node> stack = new Stack<>();
        while (right!=null){
            stack.push(right);
            right = right.next;
        }

        while (!stack.isEmpty()){
            if(head.value == stack.pop().value){
                head = head.next;
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node n1 = head;
        Node n2 = head;
        while (n2.next!=null && n2.next.next!=null){
            n1 = n1.next;
            n2 = n2.next.next;
        }

        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        while (n2!=null){
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }
        n3 = n1;

        while (head.next!=null && n1.next!=null){
            if(head.value!=n1.value)
                return false;
            else{
                head = head.next;
                n1 = n1.next;
            }
        }



        return true;
    }

    public static Node reverse(Node head){
        if(head == null){
            return head;
        }
        Node pre = null;
        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return head;
    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(6);
        //  Node node7 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;
        //node7.next = null;

        boolean a = isPalindrome1(node1);
        System.out.println(a);

        boolean b = isPalindrome2(node1);
        System.out.println(b);

        Node head = reverse(node1);
        System.out.println(head.value);
    }
}
