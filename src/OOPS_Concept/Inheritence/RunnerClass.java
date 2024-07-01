package OOPS_Concept.Inheritence;

public class RunnerClass {
    public static void main(String[] args) {

        Child c= new Child();
        c.alto();
        c.home();
        c.Ferrari();
        c.i10();

        //Dynamic dispatch --  it looks it is not working , it still access GF functions , not child
        GrandFather gf= new Child();
        


    }


}
