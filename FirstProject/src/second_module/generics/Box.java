package second_module.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> contents = new ArrayList<T>();

    public Box() {
    }

    public Box(List<T> contents) {
        this.contents = contents;
    }

    void add(T element) {
        this.contents.add(element);
    }

    List<T> getContents() {
        return contents;
    }
}
