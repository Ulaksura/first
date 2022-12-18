import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPICheck {
    public void showClassName(Object obj)
    {
        Class cl = obj.getClass();
        System.out.println(cl.getName());
    }
    public void showClassFields(Object obj)
    {
        Class cl = obj.getClass();
        // cl.getField() возвращает, если мы знаем конкретное поле
        // cl.getFields() возвращает массив полей, но ток публичных
        // нам интересны приватные поля, для этого мы имеем
        Field[] fields =  cl.getDeclaredFields(); // мы создаем массив типа Field это что-то типа класса полей
        for(Field i: fields)
        {
            System.out.println(i.getName());
        }
    }
    public void showClassMethod(Object obj)
    {
        Class cl = obj.getClass();
        Method[] method= cl.getDeclaredMethods();
        for(Method i: method)
        {
            System.out.println(i.getName());
        }
    }
    public  void getFilds(Object obj, String FieldsName)
    {
        try {
            Field field = obj.getClass().getDeclaredField(FieldsName);
            field.setAccessible(true);
            System.out.println (field.get(obj));
        } catch (NoSuchFieldException | IllegalAccessException e) { // без этого оброботчика ошибок гет не хочет работать
            e.printStackTrace();
        }
    }
    public  void getMethod(Object obj, String MethodName)
    {
        try {
            Method method = obj.getClass().getDeclaredMethod(MethodName);
            method.setAccessible(true);
            method.invoke(obj);
        }  catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static<T> void getMethod(Object obj, String MethodName,  T args)
    {
        try {
            Method method = obj.getClass().getDeclaredMethod(MethodName, args.getClass());
            method.setAccessible(true);
            method.invoke(obj, args);
        }  catch ( NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
