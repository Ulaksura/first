import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Vector;
import javax.sound.midi.Soundbank;


public class Main {
    public static void main(String[] args) {
        Cocktail cocktail = new Cocktail("Milk", "Banana");
        // так получилось, что у нас нет Геттера для name, а он нам очень нужен
        // для такого прикола и используют рефлексию
        ReflectionAPICheck Checker = new ReflectionAPICheck(); // объект нашей рефлексии

        // Checker.getMethod(cocktail, "showFruit");
        Checker.getFilds(cocktail, "name");
        Checker.getMethod(cocktail, "setName", "милкшейк");
        Checker.getFilds(cocktail, "name");

        int size = 5;
       Vector< Cocktail> cocktail1= new Vector<Cocktail>();
        cocktail1.add( new Cocktail("Milk", "Banana"));
        cocktail1.add(new Cocktail("Tea", "Lemon"));
        cocktail1.add( new Cocktail("Сola"));
        cocktail1.add( new Cocktail("Soda"));
        cocktail1.add( new Cocktail("Water", "ice"));

        boolean cals = Arrays.stream(args).anyMatch("-kkal"::equals);


            TreeSet<Cocktail> sortKkal = new TreeSet<Cocktail>(new Comparator<Cocktail>() {
                @Override
                public int compare(Cocktail i1, Cocktail i2) {
                    if (i1.getKkal() > i2.getKkal()) {
                        return -1;
                    } else if (i1.getKkal() < i2.getKkal()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });

            sortKkal.addAll(cocktail1);

            for (Cocktail f : sortKkal) {
                f.print();
            }

            int sumCalories = 0;
            for (Cocktail f : cocktail1) {
               sumCalories +=f.getKkal();
            }
                System.out.printf("Сумма Калорий: " + sumCalories);
        }

   
}
