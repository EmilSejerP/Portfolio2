import java.util.ArrayList;

class Vertex implements Comparable<Vertex>{
    private String name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id) {
        this.name=id;
        outEdges = new ArrayList<>();
    }
    public void addOutEdge(Edge outEdge){
        outEdges.add(outEdge);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance<o.distance)
            return -1;
        if (this.distance>o.distance)
            return 1;
        return 0;
    }
}
