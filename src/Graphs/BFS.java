package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i ++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 2, 4);

        BFS ob = new BFS();
        ArrayList<Integer> ans = ob.bfs(adj, V);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
        System.out.println();
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] vis = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        vis[0] = true;
        q.add(0);
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for (Integer i : adj.get(node)) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return res;
    }
}
