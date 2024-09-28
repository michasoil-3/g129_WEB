package second_module.generics;

public class Container<T> {
    T t; // T can be any data type that was given in the object declaration

    public Container(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
