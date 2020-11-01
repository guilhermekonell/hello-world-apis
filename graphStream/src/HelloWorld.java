import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class HelloWorld {

    public static void main(String args[]) {
        Graph graph = new SingleGraph("Hello World");

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");

        graph.display();
    }

}
