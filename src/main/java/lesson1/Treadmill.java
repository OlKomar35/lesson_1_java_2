package lesson1;

import java.util.Random;

public class Treadmill implements ObstacleRace{
    int length;

    @Override
    public String getName() {
        return "Беговая дорожка длиной: "+Integer.toString(this.length)+" м";
    }

    public Treadmill() {
        Random random=new Random();
        this.length= random.nextInt(150)+50;
    }

    @Override
    public boolean isCheck(Identity gamer) {
        if(gamer.getMaxLength()>=length){
            System.out.println("Игрок " + gamer.getName() + " успешно пробежал "+length+" м");
            return true;
        } else {
            System.out.println("Игрок " + gamer.getName() + " не пробежал "+length+" м");
            return false;
        }
    }
}
