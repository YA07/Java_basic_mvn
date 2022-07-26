package leetcode_bilibili_zuochengyun.class7;

/**
 * @Author 17
 * @Description TODO
 * @date 2022/7/18 11:54
 * @Version 1.0
 */
public class Edge {
    public int weight;
    public Node from;
    public Node to;

    public Edge(int weight,Node from,Node to){
        this.weight = weight;
        this.from = from;
        this.to = to;
    }

}
