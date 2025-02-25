public class Ellipse extends Shape{
    double width, height;
    public Ellipse(double width, double height){
        this.height=height;
        this.width=width;
    }

    @Override
    public double calculateArea(){
        return this.width * this.height * Math.PI ;
    }
}
