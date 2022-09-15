public class Main {


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setGender("male");
        p1.setName("hary");
        p1.setAge(45);
        p1.setHeight(5.9f);
        p1.setWeight(145f);

        Person p2 = new Person();
        p2.setGender("female");
        p2.setName("geet");
        p2.setAge(30);
        p2.setHeight(5.5f);
        p2.setWeight(120f);
    System.out.println(p1.getName()+","+p1.getAge()+","+p1.getHeight()+","+ p1.getWeight());
    System.out.println(p2.getName()+"," +p2.getAge()+","+p2.getHeight()+","+p2.getWeight());
    }



}
