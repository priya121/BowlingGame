public class BowlingGame {
    private int[] knockedPins = new int[22];
    private int counter = 0;

    public void roll(int pins) {
        knockedPins[counter] = pins;
        counter++;
    }

    public int score() {
        int score = 0;
        int roll = 0;
        for(int frame= 0; frame < 10; frame++) {
        if (knockedPins[roll] == 10) {
            score += 10;
            score += knockedPins[roll + 1] + knockedPins[roll + 2];
            roll += 1;
        }
        else if(knockedPins[roll] + knockedPins[roll+1] == 10) {
            score += 10;
            score+= knockedPins[roll+2]; 
            roll+=2;
        }
        else {
            score += knockedPins[roll] + knockedPins[roll+1];
            roll+=2;
        }
        }
        return score;
    }
}
