package MyProject;
public class Edge {
    private int start;
    private int finish;

    public Edge(int start,int finish) {
        this.finish = finish;
        this.start = start;
    }

    public int getStart() {
        return start;
    }
    public int getFinish() {
        return finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return start == edge.start &&
                finish == edge.finish;
    }

    @Override
    public String toString() {
        String result = "";
        result += "(" + start + " ; " + finish + ")";
        return result;
    }
}