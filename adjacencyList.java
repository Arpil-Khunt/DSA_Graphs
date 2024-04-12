import java.util.*;
public class adjacencyList {
    /*    (5)
    (0)-----------(1)
                 /   \
             (1)/     \(3)
               /       \
             (2)-------(3)
              |   (1)
           (2)|
              |
             (4)
     */
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graphs = new ArrayList[v];
        for(int i = 0;i<graphs.length ; i++ ){
            graphs[i]=new ArrayList<>();
        }
        //0's vertex
        graphs[0].add(new Edge(0,1,5));

        //1's vertex
        graphs[1].add(new Edge(1,0,5));
        graphs[1].add(new Edge(1,2,1));
        graphs[1].add(new Edge(1,3,3));

        //2's vertex
        graphs[2].add(new Edge(2,1,1));
        graphs[2].add(new Edge(2,3,1));
        graphs[2].add(new Edge(2,4,2));

        //3's vertex
        graphs[3].add(new Edge(3,1,3));
        graphs[3].add(new Edge(3,2,1));

        //4's vertex
        graphs[4].add(new Edge(4,2,2));

        //2's neighbour
        for(int i = 0 ; i <graphs[2].size();i++){
            System.out.print(graphs[2].get(i).dest+"\t");
        }

    }
}