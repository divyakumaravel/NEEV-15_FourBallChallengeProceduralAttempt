import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    int ball1 = 0;
    int ball2 = 0;
    int ball3 = 0;
    int ball4 = 0;

    final int width = 640;
    final int height = 480;
    final int diameter = 15;

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {
        drawFirstCircle();
        drawSecondCircle();
        drawThirdCircle();
        drawFourthCircle();
    }

    private void drawFirstCircle() {
        ellipse(ball1,height/5,diameter,diameter);
        ball1++;
    }

    private void drawSecondCircle() {
        ellipse(ball2,height*2/5,diameter,diameter);
        ball2=ball2+2;
    }

    private void drawThirdCircle() {
        ellipse(ball3,height*3/5,diameter,diameter);
        ball3=ball3+3;
    }

    private void drawFourthCircle() {
        ellipse(ball4,height*4/5,diameter,diameter);
        ball4=ball4+4;
    }
}
