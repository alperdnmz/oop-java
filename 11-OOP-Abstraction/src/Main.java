public class Main {
    public static void main(String[] args) {
        BaseScoreCalculator baseScoreCalculator = new MenScoreCalculator();
        baseScoreCalculator.scoreCalculate();
        baseScoreCalculator.gameOver();
    }
}