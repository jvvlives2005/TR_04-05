package nyc.c4q.jvvlives2005;
import java.util.ArrayList;

/**
 * Created by c4q-joshelynvivas on 4/5/15.
 */
public class Person
{
    String  name;
    int     age;
    String  address;
    String  emailAddress;
    char    gender;
    boolean areYouMarried;
    double  height;
    double  weight;
    int     ssnNumber;

    String            city;
    ArrayList<Person> friendList;

    static String planet;
    static int               numberOfPeople = 0;
    static ArrayList<Person> population     = new ArrayList<Person>();

    public Person()
    {
        numberOfPeople++;
        friendList = new ArrayList<Person>();
        age = 0;
        population.add(this);
    }

    public Person(String name) {
        this.name = name;
        age = 0;
        numberOfPeople ++;
    }

    public String getCity(){
        return city;
    }
    public  void setCity(){

    }
    public boolean checkSameCity(Person p1, Person p2) {
        int sum = 0;

    }
    public static void main(String[] args){
        Person p1 = new Person();

        String a = "Hello";

    }
    public double getWeight(){
        return this.weight;
    }
    public static double averageWeight() {
        int sum = 0;
        for (Person person2 : population) {
            sum += person2.getWeight();
        }
        return sum/population;
    }
}
