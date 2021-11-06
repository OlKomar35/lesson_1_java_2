package lesson1;


import java.util.Random;

public class Wall implements ObstacleRace{
    int height;

    @Override
    public String getName() {
        return "Стена высотой: "+Integer.toString(this.height)+" м";
    }

    public Wall() {
        Random random=new Random();
        this.height = random.nextInt(4)+1;
    }

    @Override
    public boolean isCheck(Identity gamer) {
        if(gamer.getMaxHeight()>=this.height) {
            System.out.println("Игрок " + gamer.getName() + " преодалел стену "+height+" м");
            return true;
        }else{
            System.out.println("Игрок " + gamer.getName() + " не смог преодалеть стену");
            return false;
        }
    }
}
