package MyProject;
public class ListEdge {
    private ListElementEdge head;

    public ListElementEdge getHead() {
        return head;
    }

    public void add(ListElementEdge elem, int index) {
        ListElementEdge element = get(index - 1);
        if (element != null) {
            elem.setNext(element.getNext());
            element.setNext(elem);
        } else if (head == null) {
            head = elem;
        }
    }

    public void add(int v1, int v2, int index) {
        add(new ListElementEdge(v1, v2), index);
    }

    public void add(int v1, int v2) {
        add(v1, v2, size());
    }

    public int size() {
        ListElementEdge elem = head;
        int count = 0;
        while (elem != null) {
            elem = elem.getNext();
            count++;
        }
        return count;
    }

    public ListElementEdge get(int index) {
        if (index <= size()) {
            ListElementEdge elem = head;
            for (int i = 0; i < index; i++) {
                elem = elem.getNext();
            }
            return elem;
        }
        return null;
    }

    public boolean contains(Edge e) {
        ListElementEdge curr = head;
        while (curr != null) {
            if (curr.getEdge().equals(e)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public void deleteEdge(Edge edge) {
        ListElementEdge curr = head;
        int index = 0;
        while (curr != null && !curr.getEdge().equals(edge)) {
            index++;
            curr = curr.getNext();
        }
        delete(index);
    }

    public void delete(int index) {
        if (index == 0) {
            if (head != null) {
                head = head.getNext();
            }
        } else {
            ListElementEdge el = get(index - 1);
            ListElementEdge elem = el.getNext();
            if (!(el.equals(null) && !(elem.equals(null))))
                el.setNext(elem.getNext());
            elem.setNext(null);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListEdge listEdge = (ListEdge) o;
        ListElementEdge curr = head;
        ListElementEdge other = listEdge.getHead();
        if (listEdge.size() != size()) {
            return false;
        }
        while (curr != null) {
            if (!curr.equals(other)) {
                return false;
            }
            curr = curr.getNext();
            other = other.getNext();
        }

        return true;
    }
}