public class Rating extends Score {
    private String rating = "不可";

    public Rating(int score){
        setRating(score);
    }

    public Rating(){
        setRating(getScore());
    }

    public void setRating(int score){
        setScore(score);
        if (score >= 90){
            this.rating = "秀";
        }
        else if (score >= 80){
            this.rating = "優";
        }
        else if (score >= 70){
            this.rating = "良";
        }
        else if (score >= 60){
            this.rating = "可";
        }
    }

    public String getRating(){
        return rating;
    }

    @Override
    public void showResult(String person){
        System.out.println(person+"さんの点数："+getScore()+", 評価："+rating);
    }
}
