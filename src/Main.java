import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Мое случайное число = " + generateRandomAge());
        System.out.println(weather(generateRandomAge(),20));
        System.out.println(weather(generateRandomAge(),0));
        System.out.println(weather(generateRandomAge(),-20));
        System.out.println(weather(generateRandomAge(),50));
        System.out.println(weather(generateRandomAge(),40));

    }

    public static String weather(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age <= 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age >= 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        }else{
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(80);
        return age;
    }
}
