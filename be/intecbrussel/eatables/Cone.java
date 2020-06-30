package be.intecbrussel.eatables;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public void eat() {
        String text="";
        for(int i = 0; i < balls.length; i++) {
            if(i < balls.length -1) {
                text+=balls[i].toString();
                text+="met"; }
            else if(i == balls.length -1) {
                text+=balls[i].toString();
                text+="\b.\n";
            }
        }
        System.out.print(AUTO_ANSWER + text);
    }
}
