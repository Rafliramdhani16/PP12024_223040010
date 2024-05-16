public class GraphMain {
    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.adjacencyMatrix();
        System.out.println();

        System.out.println("Latihan 6");
        Graph latihan6 = new Graph(4);
        latihan6.addVertex('A');
        latihan6.addVertex('B');
        latihan6.addVertex('C');
        latihan6.addVertex('D');

        latihan6.addEdge(0, 1); // A - B
        latihan6.addEdge(0, 2); // A - C
        latihan6.addEdge(0, 3); // A - D
        latihan6.addEdge(1, 3); // B - D
        graph.adjacencyMatrix();
        System.out.println();
    }
}
