public class Bear {
    private String name;
    private int age;
    private double weight;
    private char gender;

    public Bear(String name, int age, double weight, char gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double newWeight){
        this.weight = newWeight;
    }

    public boolean readyToHibernate(){
        if (this.weight >= 80.00){
            return true;
        } else {
            return false;
        }
    }

    public char getGender(){
        return this.gender;
    }

    public void setGender(char newGender){
        this.gender = newGender;
    }
}
