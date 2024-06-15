class Box {
    double width;
    double height;
    double depth;
      
    Box(Box ob) {
        width = ob.width;
        height = ob.width;
        depth = ob.depth;
    }
    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    Box() {
        width=-1;
        height=-1;
        depth = -1;
    }
    
    Box(double len) {
        width=height=depth=len;
    }
    
    double volume() {
        return width*height*depth;
    }
}

class BoxWeight extends Box {
    double weight;
    
    BoxWeight(double w, double h, double d, double m) {
        width = w;
	height = h;
	depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(4.3,6.4,8.4,0.55);
        BoxWeight mybox2 = new BoxWeight(5.3,8.3,2.8,5.4);
        double vol;
        
        vol= mybox1.volume();
        System.out.println("The Volume of Box1 is : " + vol);
        System.out.println("Weight of mybox1 is : " + mybox1.weight);

        vol= mybox2.volume();
        System.out.println("The Volume of Box2 is : " + vol);
        System.out.println("Weight of mybox2 is : " + mybox2.weight);
    }
}
