package main;

public class StarbuzzCafe {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("Coffee is Ready.");

        System.out.println();

        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("Tea is Ready");
    }
}
