import java.io.*;

class BMICalculator{
public static void main(String[] args) {
    double hight, weight, bmi;
    String name, line;
    String result = "標準型";

    BufferedReader reader = new BufferedReader(new InputStreamReader(System. in));

    try {
        System.out.print("名前：");
        name = reader.readLine();

        System.out.print("身長[cm]：");
        line = reader.readLine();
        hight = Double.parseDouble(line);

        System.out.print("体重：");
        line = reader.readLine();
        weight = Double.parseDouble(line);

        bmi = weight / Math.pow((hight/100), 2);
        System.out.println("BMI：" + bmi);

        if(bmi < 18.5){
            result = "痩せ型";
        } else if(bmi >= 25.0){
            result = "肥満型";
        }

        System.out.println(name + "さんは" + result + "です。");

    } catch (Exception e) {
        System.out.println(e.getMessage());
    } 

   } 
}