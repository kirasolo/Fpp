package Assignment5;

public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t); // Output: a->Andrew b->Billy w->Willie
    }
}
