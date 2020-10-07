public class TriangleCalculations {
    public static void main(String[] args) {
        RightTriangle rt1 = new RightTriangle(-1.0, 4.0);
        RightTriangle rt2 = new RightTriangle(Math.sqrt(3) ,1.0);


        System.out.println("直角三角形1の面積："+rt1.getArea());
        System.out.println("直角三角形1の斜辺の長さ："+rt1.getHypotenuse());
        System.out.println("直角三角形2の面積："+rt2.getArea());
        System.out.println("直角三角形2の斜辺の長さ："+rt2.getHypotenuse());
    }
}
