public class Main {
    public static void main(String[] args) {

        AnyClass<String> object1 = new AnyClass<>("10");
        AnyClass<String> object2 = new AnyClass<>("abc");

        System.out.println("Before:");
        System.out.println("object1: " + object1.getValue());
        System.out.println("object2: " + object2.getValue());

        AnyClass.swap(object1, object2);

        System.out.println("After:");
        System.out.println("object1: " + object1.getValue());
        System.out.println("object2: " + object2.getValue());
    }

}

class AnyClass<T> {
    private T value;

    public AnyClass(T new_value) {
        value = new_value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T new_value) {
        value = new_value;
    }

    public static <T> void swap(AnyClass<T> a, AnyClass<T> b) {
        T temp = a.getValue();
        T value_second = b.getValue();
        a.setValue(value_second);
        b.setValue(temp);
    }
}