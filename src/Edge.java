class Edge implements Comparable<Edge>{
    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer distance;
    // ADD A weight for price! we can have several and use this one to calculate costs

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return distance;
    }

    public void setWeight(Integer distance) {
        this.distance = distance;
    }

    public Edge(Vertex from, Vertex to, Integer dist) {
        fromVertex = from;
        toVertex = to;
        distance = dist;
        from.addOutEdge(this);
    }

    @Override
    public String toString() {
        return "Edge{" +
                "fromVertex=" + fromVertex +
                ", toVertex=" + toVertex +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(Edge o) {
        if (this.distance<o.distance)
            return -1;
        if (this.distance>o.distance)
            return 1;
        return 0;
    }
}