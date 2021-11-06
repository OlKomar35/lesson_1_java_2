package lesson1;

public class TestMain {
    public static void main(String[] args) {
        //Комар Ольга , дз 1
        Identity person = new Person("Olga", 160, 2);
        Identity cat = new Cat("Katy", 200, 3);
        Identity robot = new Robot("Vali", 100, 1);

        ObstacleRace treadmill0 = new Treadmill();
        ObstacleRace wall0 = new Wall();
        ObstacleRace treadmill1 = new Treadmill();
        ObstacleRace wall1 = new Wall();
        ObstacleRace treadmill2 = new Treadmill();
        ObstacleRace wall2 = new Wall();

        treadmill0.isCheck(person);
        treadmill0.isCheck(cat);
        treadmill0.isCheck(robot);

        wall0.isCheck(person);
        wall0.isCheck(cat);
        wall0.isCheck(robot);

        Identity[] arrGamer = {person, cat, robot, new Cat("Bob", 110, 3),
                new Robot("Number 7", 160, 2),
                new Person("Roma", 200, 3)
        };
        System.out.println("Участники:");
        for (Identity gamer: arrGamer) {
            System.out.print(gamer.getName()+" ");
        }
        System.out.println();

        ObstacleRace[] arrObstacle = {treadmill0, treadmill1, wall0, treadmill2, wall1, wall2};
        System.out.println("Поласа препятствий: ");
        for (ObstacleRace obst: arrObstacle) {
            System.out.print(obst.getName()+" ");
        }
        System.out.println();



        for (int i = 0; i < arrGamer.length; i++) {
            System.out.println();
            for (int j = 0; j < arrObstacle.length; j++) {
               if (arrObstacle[j].isCheck(arrGamer[i])==false) break;
            }
        }
        System.out.println();
    }
}
