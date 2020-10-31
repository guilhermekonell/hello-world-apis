import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.UndirectedSparseGraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.DefaultVisualizationModel;
import edu.uci.ics.jung.visualization.VisualizationModel;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import org.apache.commons.collections15.Transformer;

import javax.swing.*;
import java.awt.*;

public class ApiJungHelloWorld {

    public static void main(String[] args) {
        Graph<String,String> grafo = criaGrafo();

        System.out.println("Número de vértices: "
        +grafo.getVertexCount());
        System.out.println("Número de arestas: "
        +grafo.getEdgeCount());
        System.out.println("Vértices ligados a A: "
        +grafo.getNeighbors("A"));
        System.out.println("A tem " + grafo.getNeighborCount("A") + " vizinhos.");


        Layout<String, String> layout = new CircleLayout<>(grafo);
        layout.setSize(new Dimension(300,300));
        BasicVisualizationServer<String,String> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(350,350));
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<>());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Renderer.VertexLabel.Position.CNTR);

        JFrame frame = new JFrame("Hello World Jung API");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }


    public static Graph<String, String> criaGrafo() {
        Graph<String,String> grafo = new UndirectedSparseGraph<>();

        grafo.addEdge("A-B","A","B");
        grafo.addEdge("A-C","A","C");
        grafo.addEdge("A-M","A","M");
        grafo.addEdge("B-C","B","C");
        grafo.addEdge("B-D","B","D");
        grafo.addEdge("B-J","B","J");
        grafo.addEdge("B-K","B","K");
        grafo.addEdge("B-L","B","L");
        grafo.addEdge("C-D","C","D");
        grafo.addEdge("C-E","C","E");
        grafo.addEdge("D-F","D","F");
        grafo.addEdge("D-G","D","G");
        grafo.addEdge("D-H","D","H");
        grafo.addEdge("D-I","D","I");
        grafo.addEdge("D-J","D","J");
        grafo.addEdge("E-N","E","N");
        grafo.addEdge("F-G","F","G");
        grafo.addEdge("J-K","J","K");
        grafo.addEdge("L-M","L","M");

        return grafo;
    }
}
