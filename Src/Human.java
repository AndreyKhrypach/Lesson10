public class Human {
    String name;
    boolean sex;
    int age;
    String profession;

    public Human(String name, boolean sex, int age, String profession) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.profession = profession;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + (sex ? "male" : "female" )+
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }

    //    public Human(String name, boolean sex, int age) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//    }
//
//    public Human(String name, boolean sex) {
//        this.name = name;
//        this.sex = sex;
//    }
//
//    public Human(String name) {
//        this.name = name;
//    }
//
//    public Human(String name, int age, String profession) {
//        this.name = name;
//        this.age = age;
//        this.profession = profession;
//    }
}
