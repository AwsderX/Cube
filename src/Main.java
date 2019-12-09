public class Main {
    public static void main(String[] args) {
        R3Vector v_1 = new R3Vector(0,0,0);
        R3Vector v_2 = new R3Vector(1,0,0);
        R3Vector v_3 = new R3Vector(1,1,0);
        R3Vector v_4 = new R3Vector(0,1,0);
        Facet x = new Facet(v_1,v_2,v_3,v_4);
        Facet.print(x);
    }
}