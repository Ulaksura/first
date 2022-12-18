import java.util.Objects;

public class Cocktail implements Nutritious {
    private String name;
    private String drink;
    private String fruit;
    private int kkal;
    Cocktail()
    {
        this.name="";
        this.drink="";
        this.fruit="";
        this.kkal= 0;
    }
    Cocktail(String d)
    {
        this.name=d+"Fruit";
        this.drink=d;
        this.fruit="Fruit";
        this.kkal= calculateCalories();
    }
    Cocktail(String d, String f)
    {
        this.name=f+d;
        this.drink=d;
        this.fruit=f;
        this.kkal= calculateCalories();

    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cocktail cocktail = (Cocktail) o;
        return Objects.equals(kkal, cocktail.getKkal());
    }

   public int calculateCalories()
   {
       return (int)(Math.random()*name.length()*23);
   }

    public String getDrink() {
        return drink;
    }
    public int getKkal() {
        return kkal;
    }

    private void showFruit() {
        System.out.println(fruit);
    } // приватный для примера
    private void setName(String n)
    {
        this.name = n;
    } // так же приватный для примера
    public void print()
    {
        System.out.println(this.name);
        System.out.println(this.kkal);
    }
}
