import java.util.*;

public class AdjacencyListGraph {

    /* This file contains everything we need for setting up and printing the
    AdjecencyListGraph, in here we create the vertices and the edges.
    The Vertices are our towns and the distance between these are the weight
    of our edges.
     */

    //We create an arrayList to contain our Vertices(Towns):
    private ArrayList<Vertex> vertices;
    public AdjacencyListGraph(){
        vertices = new ArrayList<Vertex>();
    }
    //We create a function for adding Vertices(Towns) to the arrayList:
    public void addVertex(Vertex v){vertices.add(v);}

    //We create a function for adding Edges(The Electricity grid between the towns:
    public void newEdge(Vertex from, Vertex to, Integer dist){
        /*Check that the Edge has a destination and a starting point, if it doesnt we make it clear that
        it is not found and we return*/
        if(!(vertices.contains(from) && vertices.contains(to))){
            System.out.println("Vertex not found");
            return;
        }
        Edge newEdge = new Edge(from,to,dist);
    }

    public void printAdjecencyGraph(){
        Vertex currentVertex;
        for(int i = 0 ; i < vertices.size(); i++){
            currentVertex = vertices.get(i);
            System.out.println(" Edges from Town: " + currentVertex.getName());
            for(int j = 0; j < currentVertex.getOutEdges().size();j++){
                Edge currentE = currentVertex.getOutEdges().get(j);
                System.out.println(" To " + currentE.getToVertex().getName() + " Distance: " + currentE.getWeight());
            }
            System.out.println(" ");
        }
    }

    public void Prims() {

        Boolean[] visited = new Boolean[vertices.size()];
        Arrays.fill(visited, false);
        ArrayList<Edge> edgeArrayList = new ArrayList<Edge>();
        Vertex currentVertex;
        Integer counter = 0;
        HashMap<String, Boolean> map = new HashMap<>();
        ArrayList<Edge> MST = new ArrayList<Edge>();
        for(int i = 0; i < vertices.size();i++){
            map.put(vertices.get(i).getName(),visited[i]);
        }


        while(counter < vertices.size()){

            for(int i = 0; i < vertices.size();i++){
                currentVertex = vertices.get(i);
                if(visited[i] == false){
                    visited[i] = true;
                    for(int j = 0; j < currentVertex.getOutEdges().size();j++){
                        Edge currentE = currentVertex.getOutEdges().get(j);
                        edgeArrayList.add(currentE);
                        //System.out.println(edges.peek().toString());
                        }
                        PriorityQueue<Edge> edges = new PriorityQueue<>(edgeArrayList);

                        if(edges.size() > 1 && map.get(edges.peek().getToVertex().getName()) == false){
                        MST.add(edges.peek());
                            System.out.println(MST.toString());
                        edges.poll();
                        counter++;
                    }
                    edgeArrayList = new ArrayList<Edge>();
                }
            }
        }
    }
}
