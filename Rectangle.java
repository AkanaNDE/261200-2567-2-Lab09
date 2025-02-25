public class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height){
    this.height=height;
    this.width=width;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}



