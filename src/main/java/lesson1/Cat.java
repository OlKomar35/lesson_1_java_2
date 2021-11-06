package lesson1;

public class Cat implements Identity{
    String name;
    int maxLength;
    int maxHeight;

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength=maxLength;
        this.maxHeight=maxHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Cat "+name +" can run");
    }

    @Override
    public void jump() {
        System.out.println("Cat "+name +"  can jump");
    }
}
