import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    int ball1 = 0;
    int ball2 = 0;
    int ball3 = 0;
    int ball4 = 0;

    @Override
    public void settings() {
        super.settings();
        size(640,480);
    }

    @Override
    public void draw() {
        drawFirstCircle();
        drawSecondCircle();
        drawThirdCircle();
        drawFourthCircle();
    }

    private void drawFirstCircle() {
        ellipse(ball1,480/5,15,15);
        ball1++;
    }

    private void drawSecondCircle() {
        ellipse(ball2,480*2/5,15,15);
        ball2=ball2+2;
    }

    private void drawThirdCircle() {
        ellipse(ball3,480*3/5,15,15);
        ball3=ball3+3;
    }

    private void drawFourthCircle() {
        ellipse(ball4,480*4/5,15,15);
        ball4=ball4+4;
    }
}
