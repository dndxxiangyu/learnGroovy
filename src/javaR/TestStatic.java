package javaR;

public class TestStatic {
    public static void main(String[] args) {
        StaticIJ ij = new StaticIJ();
        System.out.println(ij.j);
        System.out.println(ij.i);
    }
}

class StaticIJ {
    static {
        i = 1;
    }

    static int i = 2;
    {
        j = 1;
    }
    int j = 2;
}