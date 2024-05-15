package Composite;

public class Client {
    public static void main(String[] args) {
        Component f0 = new File(18);
        Component f1 = new File(76);
        Component f2 = new File(78);

        Directory dir1 = new Directory();
        Directory root = new Directory();

        root.add(dir1);
        root.add(f0);
        root.add(f1);
        dir1.add(f2);

        System.out.println(root.getSize());
    }
}
