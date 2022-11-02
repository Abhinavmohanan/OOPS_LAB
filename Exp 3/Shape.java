abstract class Shape{
    void numberofSides(){}

    public static void main(String[] args){
        Shape S1 = new Rectangle();
        Shape S2 = new Triangle();
        Shape S3 = new Hexagon();
        System.out.print("Rectangle: ");
        S1.numberofSides();
        System.out.print("Triangle: ");
        S2.numberofSides();
        System.out.print("Hexagon: ");
        S3.numberofSides();
    }
}

class Rectangle extends Shape{
    void numberofSides(){
        System.out.println("4");
    }
}

class Triangle extends Shape{
    void numberofSides(){
        System.out.println("3");
    }
}

class Hexagon extends Shape{
    void numberofSides(){
        System.out.println("6");
    }
}


