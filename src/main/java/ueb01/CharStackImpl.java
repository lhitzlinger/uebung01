package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    class Element {
        char value;
        Element next;
        Element (char value, Element next){
            this.value = value;
            this.next = next;
        }
    }
    int counter;
    Element head;
    @Override
    public void push(char c) {
        counter++;
        Element it = head;
        head = new Element(c,it);

    }

    @Override
    public char pop() {
        if (head==null){
            throw new NoSuchElementException();
        }
        counter--;
        char c = head.value;
        head=head.next;
        return c;
    }

    @Override
    public int size() {
        return counter;
    }
}
