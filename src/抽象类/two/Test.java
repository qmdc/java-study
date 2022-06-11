package 抽象类.two;

public class Test {
    public static void main(String [] args){
        Rectangle rec = new Rectangle();
        rec.setLength(10);
        rec.setWidth(5);
        double rec_area = rec.area();
        double rec_perimeter = rec.perimeter();
        System.out.println("矩形的面积："+rec_area+"，周长"+rec_perimeter);

        Triangle tri = new Triangle();
        tri.setA(3);
        tri.setB(4);
        tri.setC(5);
        double tri_area = tri.area();
        double tri_perimeter = tri.perimeter();
        System.out.println("三角形的面积："+tri_area+"，周长"+tri_perimeter);

        Circle cir = new Circle();
        cir.setDiameter(10);
        double cir_area = cir.area();
        double cir_perimeter = cir.perimeter();
        System.out.println("圆形的面积："+cir_area+"，周长"+cir_perimeter);
    }
}
