public class test{
    public static void main(String[] args){

        Allspecs A1 = new Allspecs();
        A1.name = "alx";

        A1.work();

    }




   
}
class Allspecs{

    String name;
    int age;

    void work(){
        System.out.println(name+"How to do");

    }
}