public class RightTriangle {
    private double oneside = 1.0;
    private double otherside = 1.0;

    public RightTriangle(double oneside, double otherside){
        if (oneside > 0.0 && otherside > 0.0){
            this.oneside = oneside;
            this.otherside = otherside;
        }
    }

    public double getArea(){
        return (oneside * otherside)/2;
    }

    public double getHypotenuse(){
        return Math.sqrt(Math.pow(oneside, 2) + Math.pow(otherside, 2));
    }

}
