package oop.vererbung3;

class EdgeSet { //implements Shape {

    protected Edge[] edges;
    protected int size;

    public EdgeSet(Edge[] edges) {
        this.edges = new Edge[edges.length * 2];
        System.arraycopy(edges, 0, this.edges, 0, edges.length);
        this.size = edges.length;
    }

    public double length() {
        double sum = 0.0;
        for (int i = 0; i  < size; i++)
            sum += edges[i].length();
        return sum;
    }

    public void insert(Edge newEdge) {
        if (size < edges.length) {
            edges[size++] = newEdge;
        } else {
            System.out.println("Storage Overflow");
        }
    }

    public void insert(Edge[] newEdges) {
        if (size + newEdges.length < edges.length) {
            for (int i = 0; i < newEdges.length; i++) {
                edges[size++] = newEdges[i];
            }
        } else {
            System.out.println("Storage Overflow");
        }
    }

    public Point[] intersection() {
        Point[] result = new Point[size * size];
        int resultSize;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Edge edge1 = edges[i];
                Edge edge2 = edges[j];

                // if edge1 and edge2 intersect
                // result[resultSize++] = computed intersection
            }
        }

        // trim result array to resultSize

        return result;
    }

}
