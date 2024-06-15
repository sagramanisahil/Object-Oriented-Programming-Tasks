class Box {
    double width;
    double height;
    double depth;
      
    Box(Box ob) {
        width = ob.width;
        height = ob.height; // Corrected
        depth = ob.depth;
    }
    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    
    Box(double len) {
        width = height = depth = len;
    }
    
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class ColorBox extends Box {
    String color;
    
    ColorBox(double w, double h, double d, String c) {
        super(w, h, d);
        color = c;
    }

    String getColor() {
        return color;
    }
}

public class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(4.3, 6.4, 8.4, 0.55);
        BoxWeight mybox2 = new BoxWeight(5.3, 8.3, 2.8, 5.4);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        ColorBox colorBox1 = new ColorBox(4.3, 6.4, 8.4, "RED");
        ColorBox colorBox2 = new ColorBox(5.3, 8.3, 2.8, "Black");
        double vol;
        
        vol = mybox1.volume();
        System.out.println("The Volume of Box1 is: " + vol);
        System.out.println("Weight of mybox1 is: " + mybox1.weight);
        System.out.println("Color of MyBox1 is: " + colorBox1.getColor());

        vol = mybox2.volume();
        System.out.println("The Volume of Box2 is: " + vol);
        System.out.println("Weight of mybox2 is: " + mybox2.weight);
        System.out.println("Color of MyBox2 is: " + colorBox2.getColor());

        vol = mybox3.volume();
        System.out.println("The Volume of Box3 is: " + vol);
        System.out.println("Weight of mybox3 is: " + mybox3.weight);

        vol = mycube.volume();
        System.out.println("The Volume of Cube is: " + vol);
        System.out.println("Weight of mycube is: " + mycube.weight);

        vol = myclone.volume();
        System.out.println("The Volume of Clone Box is: " + vol);
        System.out.println("Weight of myclone is: " + myclone.weight);
    }
}
