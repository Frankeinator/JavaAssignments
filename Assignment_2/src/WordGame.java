import java.util.Scanner;
public class WordGame {
    public static void main(String[] args)
    {
        String name, city, college, profession, animal, petName;
        int age;

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = reader.nextLine();

        System.out.print("Enter your age: ");
        age = reader.nextInt(); reader.nextLine();

        System.out.print("Enter a city name: ");
        city = reader.nextLine();

        System.out.print("Enter your college name: ");
        college = reader.nextLine();

        System.out.print("Enter your profession: ");
        profession = reader.nextLine();

        System.out.print("Enter your favorite animal: ");
        animal = reader.nextLine();

        System.out.print("Enter your pet's name: ");
        petName = reader.nextLine();

        System.out.println("There once was a person name " + name + " who lived in " + city + ". At the age of " + age + ",\n" +
                "" + name + " went to college at " + college + ". " + name + " graduated and went to work as a\n" +
                "" + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived\n" +
                "happily ever after!");
    }
}
