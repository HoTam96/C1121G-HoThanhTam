package ss8_clean_code.bai_tap.refactoring;

public class MiniGameMethod {
    private String firstPlayer;
    private String secondPlayer;
    private String scoreOfFirstPlayer;
    private String scoreOfSecondPlayer;

    public MiniGameMethod(String firstPlayer, String secondPlayer, String scoreOfFirstPlayer, String scoreOfSecondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.scoreOfFirstPlayer = scoreOfFirstPlayer;
        this.scoreOfSecondPlayer = scoreOfSecondPlayer;
    }

    public String getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public String getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(String secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public String getScoreOfFirstPlayer() {
        return scoreOfFirstPlayer;
    }

    public void setScoreOfFirstPlayer(String scoreOfFirstPlayer) {
        this.scoreOfFirstPlayer = scoreOfFirstPlayer;
    }

    public String getScoreOfSecondPlayer() {
        return scoreOfSecondPlayer;
    }

    public void setScoreOfSecondPlayer(String scoreOfSecondPlayer) {
        this.scoreOfSecondPlayer = scoreOfSecondPlayer;
    }

}
