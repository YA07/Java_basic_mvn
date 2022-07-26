package leetcode_bilibili_zuochengyun.Class5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/12 10:37
 * @Version 1.0
 */

public class TreeDemo {
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
    }

    //先序遍历
    public static void preOrderRecur(Node head){
        if(head == null)
            return;
        System.out.print(head.value+" ,");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    //先序遍历 栈
    public static void preOrderRecur_stack(Node head){
        System.out.print("栈： ");
        Stack<Node> stack = new Stack<Node>();
        stack.push(head);
        while (!stack.empty()){
            head = stack.pop();
            System.out.print(head.value+", ");
            if(head.right!=null){
                stack.push(head.right);
            }
            if(head.left!=null){
                stack.push(head.left);
            }
        }
        System.out.println();
    }

    //中序遍历
    public static void inOrderRecur(Node head){
        if(head == null)
            return;
        inOrderRecur(head.left);
        System.out.print(head.value+", ");
        inOrderRecur(head.right);
    }

    //中序遍历 栈
    public static void inOrderRecur_stack(Node head){
        if(head == null)
            return;

        System.out.print("栈：");
        Stack<Node> s = new Stack<Node>();
        while (!s.empty()||head!=null){
            if(head!=null){
                s.push(head);
                head = head.left;
            }else{
                head = s.pop();
                System.out.print(head.value+",");
                head = head.right;
            }
    }
        System.out.println();
    }

    //后序遍历
    public static void postOrderRecur(Node head){
        if(head == null)
            return;
        postOrderRecur(head.left);
        postOrderRecur(head.right);
        System.out.print(head.value+" ,");
    }

    ////后序遍历 栈
    public static void postOrderRecur_stack(Node head){
        System.out.print("栈： ");
        if(head!=null){
            Stack<Node> stack1 = new Stack<Node>();
            Stack<Node> stack2 = new Stack<Node>();

            stack1.push(head);
            while (!stack1.empty()){
                head = stack1.pop();
                stack2.push(head);
                if(head.left!=null){
                    stack1.push(head.left);
                }
                if(head.right!=null){
                    stack1.push(head.right);
                }
            }
            while (!stack2.empty()){
                System.out.print(stack2.pop().value+", ");
            }
        }
    }

    public static int record_levels(Node head){
        if (head == null)
            return 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(head);
        HashMap<Node,Integer> levelMap = new HashMap<Node,Integer>();
        levelMap.put(head,1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            Node cur = queue.poll();
            int curNodeLevel = levelMap.get(cur);
            if(curNodeLevel == curLevel){
                curLevelNodes++;
            }else{
                max = Math.max(max,curLevelNodes);
                curLevel++;
                curLevelNodes = 1;
            }
            if(cur.left!=null){
                levelMap.put(cur.left,curNodeLevel+1);
                queue.add(cur.left);
            }
            if(cur.right!=null){
                levelMap.put(cur.right,curNodeLevel+1);
                queue.add(cur.right);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        head.left = new Node(1);
        head.right = new Node(2);
        head.left.left = new Node(3);
        head.left.right = new Node(4);
        head.right.left = new Node(5);
        head.right.right = new Node(6);

        preOrderRecur(head);
        System.out.println();

        preOrderRecur_stack(head);
        System.out.println();

        inOrderRecur(head);
        System.out.println();

        inOrderRecur_stack(head);
        System.out.println();

        postOrderRecur(head);
        System.out.println();

        postOrderRecur_stack(head);
        System.out.println();

        System.out.println("宽度为"+record_levels(head));
    }
}
