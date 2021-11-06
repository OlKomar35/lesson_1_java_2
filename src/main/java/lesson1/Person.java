package lesson1;

public class Person implements Identity {
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

    public Person(String name,int maxLength,int maxHeight) {
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
        System.out.println("Person "+getName()+ " can run");
    }

    @Override
    public void jump() {
        System.out.println("Person "+name+" can jump");
    }
}
