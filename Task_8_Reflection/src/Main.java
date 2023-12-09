import java.awt.*;
import java.lang.reflect.*;

    public class Main {

        public static void InfoClass(Class<?> cls){
            System.out.println("################################");
            System.out.println("MAIN INFO CLASS");
            String nameClass = cls.getName();
            System.out.println("Name of class: " + nameClass);
            Field[] fields = cls.getDeclaredFields();
            System.out.println("Fields of class " + nameClass + ": ");
            for (Field field : fields) {
                System.out.println();
                System.out.println("\tType: " + field.getType().getName());
                System.out.println("\tName: " + field.getName());
            }

            System.out.println("\nMETHODS OF CLASS");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            System.out.println("\tConstructors :");
            for (Constructor<?> constructor : constructors) {
                System.out.print("\t\t" + constructor.getName() + " (");
                Parameter[] params = constructor.getParameters();
                for (int i = 0; i < params.length; i++) {
                    System.out.print(params[i].getType().getName() + " " + params[i].getName());

                    if (i < params.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println(")");
            }


            Method[] methods = cls.getDeclaredMethods();
            System.out.println("\tMethods:");
            for (Method method : methods) {
                System.out.print("\t\t" + method.getReturnType().getName() + " " + method.getName() + "(");
                Parameter[] params = method.getParameters();
                for (int i = 0; i < params.length; i += 1) {
                    System.out.print(params[i].getType().getName() + " " + params[i].getName());
                    if (i < params.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println(")");
            }


        };


        public static void main(String[] args) {
            InfoClass(Train.class);
            InfoClass(Color.class);
        };
    };