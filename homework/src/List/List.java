package List;
public class List <T extends Number> {
    private ListElement<T> head;

    public List(ListElement<T> head) {
        this.head = head;
    }
    public List() {
        this.head = null;
    }
    public int size() {
        int res = 0;
        ListElement<T> curr = head;
        while (curr != null) {
            res++;
            curr = curr.getNext();
        }
        return res;
    }

    public ListElement<T> get(int index) {
        ListElement<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return curr;
    }

    public void insertElement(ListElement<T> e, int index) {
        ListElement<T> curr = get(index);
        e.setNext(curr.getNext());
        curr.setNext(e);
    }

    public void addElement(ListElement <T> elem) {
        ListElement<T> curr = get(size() - 1);
        curr.setNext(elem);
        if(head == null) {
            head = curr;
        }
    }
    public void addValue (T value){
     ListElement valuation = new ListElement<>(value);
     addElement(valuation);
    }

    public void deleteElement(int index) {
        ListElement<T> curr = get(index);
        ListElement<T> currNext = curr.getNext();
        curr.setNext(currNext.getNext());
        curr.setNext(null);
    }

    public void joint(List<T> list) {
        ListElement<T> curr = get(size() - 1);
        curr.setNext(list.getHead());
    }

    public void insertList(List<T> list, int index) {
        ListElement<T> curr = get(index);
        ListElement<T> next = curr.getNext();
        curr.setNext(list.getHead());
        list.get(list.size() - 1).setNext(next);
    }

    public void deleteList(int index1, int index2) {
        ListElement<T> curr1 = get(index1);
        ListElement<T> curr2 = get(index2);
        ListElement<T> curr = get(index2 - 1);
        curr.setNext(null);
        curr1.setNext(curr2);
    }

    public ListElement<T> findValue(T value) {
        ListElement<T> curr = head;
        T elem = curr.getValue();
        while (elem.equals(value)) {
            curr = curr.getNext();
            elem = curr.getValue();
        }
        return curr;
    }

    public void deleteHead() {
        ListElement<T> nextHead = head.getNext();
        head.setNext(null);
        this.head = nextHead;
    }

    public List <Integer> findAllValues(T value) {
        int result = 0;
        ListElement<T> curr = head;
        T elem = curr.getValue();//значение ячейки
        List <Integer> secondList = new List<Integer>();// передаем голову
        while (curr != null) {
            result++;
            if (elem.equals(value)) {
                secondList.addValue(result);
            }
            curr = curr.getNext();
            elem = curr.getValue();
        }
        return secondList;
    }

    public void setHead(ListElement<T> head) {
        this.head = head;
    }

    public ListElement<T> getHead() {
        return head;
    }
}
