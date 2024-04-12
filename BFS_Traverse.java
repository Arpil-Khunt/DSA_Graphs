import java.util.*;

public class BFS_Traverse {

    /*
     * 1-------3
     * / |\
     * 0 | \
     * \ | 5----6
     * \ |/
     * 2-------4
     * 
     */
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static void createGraph(ArrayList<Edge>[] graphs) {
        for (int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edge(0, 1, 1));
        graphs[0].add(new Edge(0, 2, 1));

        graphs[1].add(new Edge(1, 0, 1));
        graphs[1].add(new Edge(1, 3, 1));

        graphs[2].add(new Edge(2, 0, 1));
        graphs[2].add(new Edge(2, 4, 1));

        graphs[3].add(new Edge(3, 1, 1));
        graphs[3].add(new Edge(3, 4, 1));
        graphs[3].add(new Edge(3, 5, 1));

        graphs[4].add(new Edge(4, 2, 1));
        graphs[4].add(new Edge(4, 3, 1));
        graphs[4].add(new Edge(4, 5, 1));

        graphs[5].add(new Edge(5, 3, 1));
        graphs[5].add(new Edge(5, 4, 1));
        graphs[5].add(new Edge(5, 6, 1));

        graphs[6].add(new Edge(6, 5, 1));
    }

    // Time Complexity of BFS is O(V+E)
    public static void bfs(ArrayList<Edge>[] graphs) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graphs.length];
        q.add(0);
        while (!(q.isEmpty())) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graphs[curr].size(); i++) {
                    Edge e = graphs[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }

    public static void main(String args[]) {
        int v = 7; // v = vertices
        ArrayList<Edge>[] graphs = new ArrayList[v];
        createGraph(graphs);
        bfs(graphs);

    }
}
