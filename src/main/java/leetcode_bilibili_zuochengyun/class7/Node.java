package leetcode_bilibili_zuochengyun.class7;

import java.util.ArrayList;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/18 11:48
 * @Version 1.0
 */
public class Node {
    public int value;
    public int in;
    public int out;
    public ArrayList<Node> nexts;
    public ArrayList<Edge> edges;

    public Node(int value){
        this.value = value;
        in = 0;
        out = 0;
        nexts = new ArrayList<>();
        edges = new ArrayList<>();
    }
}
