public class Score{
    private int score = 0;

    public Score(int score){
        setScore(score);
    }

    public Score(){
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100){
            this.score = score;
        }
    }
    public int getScore(){
        return this.score;
    }
    public void showResult(String person){
        System.out.println(person+"さんの点数："+getScore());
    }

}