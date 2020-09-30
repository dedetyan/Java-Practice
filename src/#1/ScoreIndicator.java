class ScoreIndicator{
    public static void main(String [] args){
        Score taro = new Score;
        Score hanako = new Score(90);

        taro.showResult(太郎);
        taro.setScore(78);
        taro.showResult(太郎);
        hanako.showResult(花子);
        hanako.setScore(-10);
        hanako.showResult(花子);
    }
}