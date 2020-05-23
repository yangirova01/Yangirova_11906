package MyProject;
import java.util.ArrayList;
    public class GraphCode {
        private int vertex;// размер по строчкам
        private int edges;// размер по столбам
        private ListEdge graph = new ListEdge();
        private int[][] matrix;

        public int getEdges() {
            return edges;
        }

        public int[][] getMI() {
            matrix = new int[edges][vertex];
            ListElementEdge e = graph.getHead();
            for (int ind = 0; ind < graph.size(); ind++) {
                Edge edge = e.getEdge();
                matrix[ind][edge.getStart()] = 1;
                matrix[ind][edge.getFinish()] = 1;
                e = e.getNext();
            }
            return matrix;
        }

        public GraphCode(int vertex) {
            this.vertex = vertex;
        }

        public GraphCode(int[][] matrix) {
            edges = matrix.length;
            vertex = matrix[0].length;
            int k = 0;
            int temp = 0;
            for (int i = 0; i < edges; i++) {
                for (int j = 0; j < vertex; j++) {
                    if (matrix[i][j] == 1) {
                        if (k == 0) {
                            temp = j;
                        } else {
                            graph.add(temp, j);
                            break;
                        }
                        k++;
                    }
                }
                k = 0;
            }
            this.matrix = getMI();
        }

        public void insert(int i, int j) {
            if ((i < vertex && i >= 0) && (j < vertex && j >= 0)) {
                if (!graph.contains(new Edge(i, j))) {
                    graph.add(i, j);
                    if (matrix != null) {
                    }
                    edges++;
                }
            }
        }

        public void delete(int i, int j) {
            ListElementEdge e = graph.getHead();
            for (int ind = 0; ind < graph.size(); ind++) {
                Edge edge = e.getEdge();
                if (edge.getStart() == i && edge.getFinish() == j) {
                    graph.delete(ind);
                    edges--;
                }
                e = e.getNext();
            }
            matrix = getMI();
        }

        public GraphCode getEdgesWithNode(int j) {
            GraphCode graphCode = new GraphCode(vertex);
            ListElementEdge elem = graph.getHead();
            for (int k = 0; k < edges; k++) {
                Edge edge = elem.getEdge();
                if (edge.getFinish() == j || edge.getStart() == j) {
                    graphCode.insert(edge.getStart(), edge.getFinish());
                }
                elem = elem.getNext();
            }
            graphCode.matrix = graphCode.getMI();
            return graphCode;
        }

        public void modify(int i) {
            ListElementEdge element = graph.getHead();
            while (element != null) {
                Edge edge = element.getEdge();
                if ((edge.getFinish() == i) || (edge.getStart() == i)) {
                    element = element.getNext();
                    graph.deleteEdge(edge);
                    edges--;
                } else {
                    element = element.getNext();
                }
            }
            matrix = getMI();
        }

        public ArrayList<Integer> show(int m) {
            ArrayList<Integer> show = new ArrayList<>();
            int[] count = new int[vertex];
            ListElementEdge e = graph.getHead();
            while (e != null) {
                Edge edge = e.getEdge();
                count[edge.getStart()]++;
                count[edge.getFinish()]++;
                e = e.getNext();
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] > m) {
                    show.add(i);
                }
            }
            return show;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GraphCode graphCode = (GraphCode) o;
            return vertex == graphCode.vertex &&
                    edges == graphCode.edges &&
                    graph.equals(graphCode.graph) &&
                    matrixEquals(graphCode.matrix);
        }
        private boolean matrixEquals(int[][] m) {
            if (matrix.length != m.length) {
                return false;
            }
            for (int i = 0; i < matrix.length; i++) {
                int[] arr = matrix[i];
                int[] anotherArr = m[i];
                if (arr.length != anotherArr.length) {
                    return false;
                }
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != anotherArr[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }