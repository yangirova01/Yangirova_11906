package MyProject;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
class GraphCodeTest {
    @Test
    public void getMICommon() {
        int[][] matrix = new int[][]{
                {1, 0, 0, 0, 1}
        };
        GraphCode graphCode11 = new GraphCode(5);
        GraphCode graphCode = new GraphCode(matrix);
        graphCode11.insert(0, 4);
        graphCode11.getMI();
        assertTrue(graphCode11.equals(graphCode));
    }

    @Test
    public void getMIempty() {
        int[][] matrix1 = new int[][]{
                {0, 0, 0, 0, 0}
        };
        GraphCode graphCode11 = new GraphCode(5);
        GraphCode graphCode1 = new GraphCode(matrix1);
        graphCode11.getMI();
        assertFalse(graphCode1.equals(graphCode11));
    }

    @Test
    public void getMIfull() {
        int[][] matrix1 = new int[][]{
                {1, 0, 1, 1, 0}
        };
        GraphCode graphCode11 = new GraphCode(5);
        GraphCode graphCode1 = new GraphCode(matrix1);
        graphCode11.insert(0, 2);
        graphCode11.getMI();
        assertEquals(graphCode1,graphCode11);
    }

    @Test
    public void insertfirst() {
        int[][] matrix = new int[][]{
                {0, 0, 0, 0, 1, 1}
        };
        GraphCode graphCode = new GraphCode(6);
        graphCode.insert(3, 5);
        assertEquals(1, graphCode.getEdges());
    }

    @Test
    public void insertsecond() {
        GraphCode graphCode = new GraphCode(6);
        graphCode.insert(-1, 1);
        assertEquals(0, graphCode.getEdges());
    }

    @Test
    public void insertthird() {
        GraphCode graphCode = new GraphCode(6);
        graphCode.insert(19, 80);
        assertEquals(0, graphCode.getEdges());
    }

    @Test
    public void delete() {
        int[][] matrix = new int[][]{
                {0, 0, 1, 1, 0, 0}
        };
        GraphCode graphCode = new GraphCode(6);
        GraphCode graphCode1 = new GraphCode(matrix);
        graphCode1.delete(2, 3);
        graphCode.getMI();
        assertEquals(graphCode1,graphCode);
    }
    @Test
    public void deletenull() {
        int[][] matrix = new int[][]{
                {0, 0, 1, 1, 0, 0}
        };
        GraphCode graphCode = new GraphCode(matrix);
        GraphCode graphCode1 = new GraphCode(matrix);
        graphCode1.delete(0, 5);
        graphCode.getMI();
       assertTrue(graphCode.equals(graphCode1));

    }
    @Test
    public void getEdgesWithNode() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
        };
        GraphCode expected = new GraphCode(5);
        GraphCode graphCode = new GraphCode(matrix1);
        GraphCode result = graphCode.getEdgesWithNode(2);
        expected.insert(2, 3);
        expected.insert(0, 2);
      assertTrue(expected.equals(result));
    }
    @Test
    public void getEdgesWithNodesecond() {
        int[][] matrixx = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode expected = new GraphCode(5);
        GraphCode result = expected.getEdgesWithNode(8);
        expected.getMI();
        assertEquals(expected, result);
    }

    @Test
    public void getEdgesWithNodethird() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode expected = new GraphCode(5);
        GraphCode graphCode = new GraphCode(matrix1);
        GraphCode result = expected.getEdgesWithNode(-1);
        expected.getMI();
        assertEquals(expected, result);
    }

    @Test
    public void modify() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode graphCode12 = new GraphCode(matrix1);
        graphCode12.modify(2);
        GraphCode expected = new GraphCode(5);
        expected.insert(1, 4);
        expected.insert(1, 3);
        assertTrue(graphCode12.equals(expected));
    }

    @Test
    public void modifysecond() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode graphCode = new GraphCode(matrix1);
        graphCode.modify(-1);
        GraphCode expected = new GraphCode(matrix1);
        expected.getMI();
        assertTrue(graphCode.equals(expected));
    }

    @Test
    public void modifythird() {
        int[][] matrix11 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode graphCode = new GraphCode(matrix11);
        graphCode.modify(9);
        GraphCode expected = new GraphCode(matrix11);
        expected.getMI();
        assertEquals(expected,graphCode);
    }

    @Test
    public void show() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode graphCode = new GraphCode(matrix1);
        ArrayList<Integer> nodes = graphCode.show(1);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(nodes, expected);

    }

    @Test
    public void showsecond() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode graphCode = new GraphCode(matrix1);
        ArrayList<Integer> nodes = graphCode.show(-1);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(nodes, expected);
    }

    @Test
    public void showsthird() {
        int[][] matrix1 = new int[][]{
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 0},
        };
        GraphCode graphCode = new GraphCode(matrix1);
        ArrayList<Integer> nodes = graphCode.show(9);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(nodes, expected);
    }
    @Test
    void testEquals() {
    }
}