package leetcode_bilibili_zuochengyun.class13;

import leetcode_bilibili_zuochengyun.Class6.Demo;

/**
 * @Author 17
 * @Description TODO 二叉树节点最远距离
 * @date 2022/8/7 15:32
 * @Version 1.0
 */
public class Demo1 {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public static class Info{
        int maxDistance;
        int height;

        public Info(int maxDistance, int height) {
            this.maxDistance = maxDistance;
            this.height = height;
        }
    }

//    public static Info process(Node node){
//        if(node == null){
//            return new Info(0,0);
//        }
//
//        Info leftInfo = process(node.left);
//        Info rightInfo = process(node.right);
//
//        int p1 = leftInfo.maxDistance;
//        int p2 = rightInfo.maxDistance;
//        int p3 = leftInfo.height+rightInfo.height+1;
//
//        //int maxDistance =
//    }
}
