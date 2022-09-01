package main;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrind();
        pourInCup();
        addSugarAndMIlk();
    }

    public void boilWater(){
        System.out.println("Boiling Water.");
    }
    public void brewCoffeeGrind(){
        System.out.println("Dripping Coffee through Filter.");
    }
    public void pourInCup(){
        System.out.println("Pouring into Cup.");
    }
    public void addSugarAndMIlk(){
        System.out.println("Adding Sugar and Milk.");
    }
}
