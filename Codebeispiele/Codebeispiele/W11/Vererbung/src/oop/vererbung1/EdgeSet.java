package oop.vererbung1;

// Kantenmengepublic class EdgeSet{    private Edge[] edges;…

class EdgeSet {

    private Edge[] edges;

    public EdgeSet(Edge[] edges) {
        this.edges = edges;
    }


    public double length() {
        double sum = 0.0;
        for (Edge e : edges)
            sum += e.length();
        return sum;
    }

}
