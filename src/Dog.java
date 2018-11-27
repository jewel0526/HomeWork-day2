public class Dog {

    String breed;
    String size;
    int age;
    String color;


    public String getInfo() {
        return ("Bread is:" +breed+"Size is:"+size+"age is:"+age+"color is:"+color);

    }


    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.breed = "maltese";
        maltese.size = "small";
        maltese.age = 3;
        maltese.color = "white";

        System.out.println(maltese.getInfo());

    }
}
