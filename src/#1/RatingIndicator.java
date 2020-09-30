public class RatingIndicator {
    public static void main(String [] args){
        Rating taro = new Rating();
        Rating hanako = new Rating(90);

        taro.showResult("太郎");
        taro.setRating(78);
        taro.showResult("太郎");
        hanako.showResult("花子");
        hanako.setRating(-10);
        hanako.showResult("花子");
    }
}
