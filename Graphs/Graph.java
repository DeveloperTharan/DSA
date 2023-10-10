package DSA.Graphs;

import java.util.*;

public class Graph {
    ArrayList<ArrayList<Integer>> adj_list = new ArrayList<ArrayList<Integer>>();

    public Graph(int v) {
        for(int i=0; i<v; i++){
            adj_list.add(new ArrayList<Integer>());
        }
    }
    public void add_edge(int u,int v){
        adj_list.get(u).add(v);
        adj_list.get(v).add(u);
    }
    public void display(){
        for(int i=0; i<adj_list.size(); i++){
            System.out.println("Adj list of vertex "+i);
            for(int j=0; j<adj_list.get(i).size(); j++){
                System.out.println(" "+adj_list.get(i).get(j));
            }
        }
    }
    //Breath For Search BFS
    public void BFS(int v){
        int a = adj_list.size();
        boolean[] visited = new boolean[a];
        visited[v] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        while(q.size()!=0){
            int vertex = q.remove();
            System.out.print(vertex+" ");
            for(int i=0; i<adj_list.get(vertex).size(); i++){
                int av = adj_list.get(vertex).get(i);
                if(!visited[av]){
                    q.add(av);
                    visited[av] = true;
                }
            }
        }
    }
    //Depth For Search DFS
    public void DFS(int v){
        int a = adj_list.size();
        boolean[] visited = new boolean[a];
        dfs(v,visited);
    }
    private void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v+" ");
        for(int i=0; i<adj_list.get(v).size(); i++){
            int av = adj_list.get(v).get(i);
            if(!visited[av]){
               dfs(av,visited); 
            }
        }
    }
}
