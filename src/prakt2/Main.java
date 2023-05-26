package prakt2;
//Сортировка по второй букве имени, фильтрация по весу кратно 10,
//сортировка по произведению веса на возраст, произведение всех весов.

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Human hum = new Human ();
        hum.task();
    }
}

class Human{
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    int result = 1;
    public Human(){};
    public Human (int age, String firstName, String lastName, LocalDate birthDate, int weight){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getMult(){
        return age*weight;
    }

    public void setResult(int a){
        result *= a;
    }

    public int getResult() {
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString(){
        return "Human {" + " age=" + age + " firstName=" + firstName + " lastName=" + lastName + " birthDate=" + birthDate + " weight=" + weight +" }";
    }
    public void task(){
        Human h1 = new Human(19, "Marat", "Gadzhiev", LocalDate.of(2003,8,3), 72);
        Human h2 = new Human(19, "Erica", "Tsvetcova", LocalDate.of(2004,1,7), 60);
        Human h3 = new Human(19, "Egor", "Shutko", LocalDate.of(2004,2,2), 100);
        ArrayList<Human> listOfHumans = new ArrayList<>();
        listOfHumans.add(h1);
        listOfHumans.add(h2);
        listOfHumans.add(h3);
//1task
        System.out.println("FIRST TASK");
        Stream<Human> stream = listOfHumans.stream();
        stream.sorted((a,b) -> Character.compare(a.getFirstName().charAt(1), b.getFirstName().charAt(1))).forEach(System.out::println);
//2task
        System.out.println("SECOND TASK");
        Stream<Human> stream2 = listOfHumans.stream();
        stream2.filter(human -> human.getWeight()%10 == 0).forEach(System.out::println);
//3task
        System.out.println("THIRD TASK");
        Stream<Human> stream3 = listOfHumans.stream();
        stream3.sorted(Comparator.comparingInt(Human::getMult)).forEach(System.out::println);
//4task
        System.out.println("FOURTH TASK");
        Stream<Human> stream4 = listOfHumans.stream();
        var result = stream4.mapToInt(Human::getWeight).reduce(1, Math::multiplyExact);
        System.out.println(result);
//        stream4.reduce(1, (a, b) -> a * b);
//        stream4.forEach(a->setResult(a.getWeight()));
//        System.out.println(getResult());
    }
}