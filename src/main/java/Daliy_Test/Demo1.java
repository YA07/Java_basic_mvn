package Daliy_Test;

import leetcode_bilibili_zuochengyun.Class5.TreeDemo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/13 14:34
 * @Version 1.0
 */


public class Demo1 {
     public static class  Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
    }
    //先序
    public static void preOrderRecur(Node head){
         if(head == null)
             return;

         System.out.print(head.value+" ");
         preOrderRecur(head.left);
         preOrderRecur(head.right);
    }

    public static void preOrderRecur_stack(Node head){
         if(head == null)
             return;
         Stack<Node> stack = new Stack<Node>();
         stack.push(head);
         while (!stack.isEmpty()){
             head = stack.pop();
             System.out.print(head.value+" ");
             if(head.right!=null)
                 stack.push(head.right);
             if(head.left!=null){
                 stack.push(head.left);
             }
         }
    }

    //中序
    public static void inOrderRecur(Node head){
        if(head == null)
            return;
        inOrderRecur(head.left);
        System.out.print(head.value+" ");
        inOrderRecur(head.right);
    }

    public static void inOrderRecur_stack(Node head) {
        if (head == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || head!=null){
            if(head!=null){
                stack.push(head);
                head = head.left;
            }else{
                head = stack.pop();
                System.out.print(head.value+" ");
                head = head.right;
            }
        }
    }
    //后序
    public static void postOrderRecur(Node head){
        if(head == null)
            return;
        postOrderRecur(head.left);
        postOrderRecur(head.right);
        System.out.print(head.value+" ");
    }

    public static void postOrderRecur_stack(Node head) {
        if (head == null)
            return;
        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();

        stack1.push(head);
        while(!stack1.isEmpty()){
            head = stack1.pop();
            stack2.push(head);
            if(head.left!=null){
                stack1.push(head.left);
            }
            if(head.right!=null){
                stack1.push(head.right);
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().value+" ");
        }
    }

    //层序遍历
    public static void w(Node head){
        if(head == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        HashMap<Node,Integer> levelMap = new HashMap<Node,Integer>();
        levelMap.put(head,1);
        int curLevel = 1;
        int curLevelNodes = 0;
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            int curNodeLevel = levelMap.get(cur);
            if(curNodeLevel==curLevel){
                curLevelNodes++;
            }else {
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



    }

    public static void main(String[] args) {
        Node head = new Node(0);
        head.left = new Node(1);
        head.right = new Node(2);
        head.left.left = new Node(3);
        head.left.right = new Node(4);
        head.right.left = new Node(5);
        head.right.right = new Node(6);

        //前序遍历
        System.out.print("递归前序遍历: ");
        preOrderRecur(head);
        System.out.println();

        System.out.print("栈前序遍历: ");
        preOrderRecur_stack(head);
        System.out.println();

        //中序遍历
        System.out.print("递归中序遍历: ");
        inOrderRecur(head);
        System.out.println();

        System.out.print("栈中序遍历: ");
        inOrderRecur_stack(head);
        System.out.println();

        //后序遍历
        System.out.print("递归后序遍历: ");
        postOrderRecur(head);
        System.out.println();

        System.out.print("栈后序遍历: ");
        postOrderRecur_stack(head);
        System.out.println();

        System.out.print("层序遍历: ");
        w(head);
        System.out.println();

    }
}


