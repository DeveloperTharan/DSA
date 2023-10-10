package DSA.Graphs;

public class DemoFor_Graph {
    public static void main(String[] args) {
        //int [][] graph = {{0,1,0,0,1},{1,0,1,0,1},{0,1,0,1,0},{0,0,1,0,1},{1,1,0,1,0}};
        Graph g = new Graph(5);
        g.add_edge(0,1);
        g.add_edge(2, 3);
        g.add_edge(1, 2);
        g.add_edge(3, 4);
        g.add_edge(0, 4);
        g.add_edge(1, 4);

        g.display();

        g.BFS(0);
        System.out.println(" ");
        g.DFS(0);
    }
}
