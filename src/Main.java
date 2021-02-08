import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        AdjacencyListGraph adjGraph = new AdjacencyListGraph();
        Vertex A = new Vertex("Eskildstrup");
        adjGraph.addVertex(A);
        Vertex B = new Vertex("Maribo");
        adjGraph.addVertex(B);
        Vertex C  = new Vertex("Nykøbing F");
        adjGraph.addVertex(C);
        Vertex D  = new Vertex("Vordingborg");
        adjGraph.addVertex(D);
        Vertex E  = new Vertex("Haslev");
        adjGraph.addVertex(E);
        Vertex F  = new Vertex("Korsør");
        adjGraph.addVertex(F);
        Vertex G  = new Vertex("Køge");
        adjGraph.addVertex(G);
        Vertex H  = new Vertex("Næstved");
        adjGraph.addVertex(H);
        Vertex I  = new Vertex("Ringsted");
        adjGraph.addVertex(I);
        Vertex J  = new Vertex("Roskilde");
        adjGraph.addVertex(J);
        Vertex K  = new Vertex("Slagelse");
        adjGraph.addVertex(K);
        Vertex L  = new Vertex("Sorø");
        adjGraph.addVertex(L);
        Vertex M  = new Vertex("Jægerspris");
        adjGraph.addVertex(M);
        Vertex N  = new Vertex("Holbæk");
        adjGraph.addVertex(N);
        Vertex O  = new Vertex("Kalundborg");
        adjGraph.addVertex(O);
        Vertex P  = new Vertex("Nakskov");
        adjGraph.addVertex(P);

        //Eskildstrup, connected town, distance
        adjGraph.newEdge(A,B,28);
        adjGraph.newEdge(A,C,13);
        adjGraph.newEdge(A,D,24);
        //Haslev, connected town, distance
        adjGraph.newEdge(E,F,60);
        adjGraph.newEdge(E,G,24);
        adjGraph.newEdge(E,H,25);
        adjGraph.newEdge(E,I,19);
        adjGraph.newEdge(E,J,47);
        adjGraph.newEdge(E,K,48);
        adjGraph.newEdge(E,L,34);
        adjGraph.newEdge(E,D,40);
        //Holbæk, connected town, distance
        adjGraph.newEdge(N,M,34);
        adjGraph.newEdge(N,O,44);
        adjGraph.newEdge(N,F,66);
        adjGraph.newEdge(N,I,36);
        adjGraph.newEdge(N,J,32);
        adjGraph.newEdge(N,K,46);
        adjGraph.newEdge(N,L,34);
        //Jægerspris, connected town, distance
        adjGraph.newEdge(M,F,95);
        adjGraph.newEdge(M,G,58);
        adjGraph.newEdge(M,I,56);
        adjGraph.newEdge(M,J,33);
        adjGraph.newEdge(M,K,74);
        adjGraph.newEdge(M,L,63);
        //Kalundborg, connected town, distance
        adjGraph.newEdge(O,I,62);
        adjGraph.newEdge(O,J,70);
        adjGraph.newEdge(O,K,39);
        adjGraph.newEdge(O,L,51);
        //Korsør, connected town, distance
        adjGraph.newEdge(F,H,45);
        adjGraph.newEdge(F,K,20);
        //Køge, connected town, distance
        adjGraph.newEdge(G,H,45);
        adjGraph.newEdge(G,J,28);
        adjGraph.newEdge(G,K,25);
        adjGraph.newEdge(G,D,60);
        //Maribo, connected town, distance
        adjGraph.newEdge(B,P,27);
        adjGraph.newEdge(B,C,26);
        //Næstved, connected town, distance
        adjGraph.newEdge(H,J,57);
        adjGraph.newEdge(H,I,26);
        adjGraph.newEdge(H,K,37);
        adjGraph.newEdge(H,L,32);
        adjGraph.newEdge(H,D,28);
        //Ringsted, connected town, distance
        adjGraph.newEdge(I,J,31);
        adjGraph.newEdge(I,L,15);
        adjGraph.newEdge(I,D,58);
        //Slagelse, connected town, distance
        adjGraph.newEdge(K,L,14);

        adjGraph.Prims();
    }
}
