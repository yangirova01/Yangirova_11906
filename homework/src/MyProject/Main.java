package MyProject;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 0, 1, 1}
        };
        GraphCode code = new GraphCode(matrix);
        code.insert(0, 1);
        int[][] m = code.getMI();
        code.delete(0, 1);
        m = code.getMI();
        GraphCode c2 = code.getEdgesWithNode(3);
        code.modify(3);
        m = code.getMI();
        GraphCode newCode = new GraphCode(matrix);
        ArrayList<Integer> ints = newCode.show(2);
    }
}