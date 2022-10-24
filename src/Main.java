public class Main {
    public static void main(String[] args) {
        Cocktail cocktail=new Cocktail("Milk","Banana");
        // так получилось, что у нас нет Геттера для name и kkal, а они нам очень нужны
        // для такого прикола и используют рефлексию
        ReflectionAPICheck Checker = new ReflectionAPICheck(); // объект нашей рефлексии

        Checker.getFilds(cocktail,"name");
        Checker.getFilds(cocktail,"kkal");
        Checker.getMethod(cocktail,"showFruit");
        Checker.getMethod(cocktail,"setName","милкшейк"); // меняем имя
        Checker.getFilds(cocktail,"name"); // dsdlbv bvz
        Checker.showClassName(cocktail);
    }
}