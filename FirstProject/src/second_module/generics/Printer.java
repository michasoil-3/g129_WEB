package second_module.generics;

public class Printer<T>{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void printValue() {
        System.out.println("Value is " +  value);
    }

    public void refresh() {
        this.value = null;
    }
}
