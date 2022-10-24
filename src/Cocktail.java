public class Cocktail {
    private String name;
    private String drink;
    private String fruit;
    private int kkal;
    Cocktail(String d, String f)
    {
        this.name=f+d;
        this.drink=d;
        this.fruit=f;
        this.kkal= (int)(Math.random()*name.length()*23);
    }


    public String getDrink() {
        return drink;
    }

    private void showFruit() {
        System.out.println(fruit);
    } // приватный для примера
    private void setName(String n)
    {
        this.name = n;
    } // так же приватный для примера
}
