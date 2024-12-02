public class MountainHare {
    private int age;
    private double weight;
    private int jumpLength;
    private String color;
    // добавьте переменные и конструктор
    public MountainHare(int age,double weight,int jumpLength, String color){
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
        this.color = color;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(int jumpLength) {
        this.jumpLength = jumpLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "«а€ц-бел€к:цвет бклое " +
            "age=" + age +
            ", weight=" + weight +
            ", jumpLength=" + jumpLength +
            ", color=" + color +
            '.';
    }
}