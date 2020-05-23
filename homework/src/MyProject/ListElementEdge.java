package MyProject;
import java.util.Objects;
public class ListElementEdge {
    private Edge edge;
    private ListElementEdge next;

    public ListElementEdge(int v1, int v2) {
        edge = new Edge(v1, v2);
    }

    public Edge getEdge() {
        return edge;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }

    public ListElementEdge getNext() {
        return next;
    }

    public void setNext(ListElementEdge next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListElementEdge that = (ListElementEdge) o;
        return Objects.equals(edge, that.edge);
    }
}
