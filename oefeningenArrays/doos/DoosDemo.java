package oefeningenArrays.doos;

public class DoosDemo {
    public static void main(String[] args) {
        Doos kubus = new Doos("Kubus", 10);
        System.out.println(kubus);
        Doos taart = new Doos("Platte doos", 30, 30, 3.5);
        System.out.println(taart);
        Doos post = new Doos("Postdoos", 30.5, 21.5, 17.0);
        System.out.println(post);
    }
}
