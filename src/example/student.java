package example;

import java.util.ArrayList;
import java.util.List;

public class student {
    private String name;
    private List<Integer> score = new ArrayList<>();

    public student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        this.score.add(score);
    }

    public List<Integer> getScore() {
        return score;
    }
}
