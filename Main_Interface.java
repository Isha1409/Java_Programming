interface Area {
    final static float PI = 3.14f;
    float calculate(float x, float y);
}

class Rectangle implements Area {
    public float calculate(float x, float y) {
        return x * y;
    }  
}

class Circle implements Area {
    public float calculate(float x, float y) {
        return PI * x * x; 
    }
}

public class Main_Interface {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        
        System.out.println("Area of Rectangle = " + rect.calculate(15, 4));
               System.out.println("Area of Circle = " + cir.calculate(10, 0));
    }
}