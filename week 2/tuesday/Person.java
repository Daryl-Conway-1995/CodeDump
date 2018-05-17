public class Person {
    private String name;
    private int age;
    private String jobTitle;

    public Person(String name, int age, String jobTitle)
    {
        this.age = age;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String name()
    {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        String result = "Name:" +name + " Age:" + age + " Job:" + jobTitle;
        //System.out.println(result);
        return result;
    }


}

/*
*public class MainTest {
    public static void main (String[] args) {

        Person sam = new Person("sam", 23, "cleaner");
        Person lucy = new Person("lucy", 28, "doctor");
        Person thor = new Person("thor", 485, "superhero");

        ArrayList<Person> people= new ArrayList<>();
        people.add(sam);
        people.add(lucy);
        people.add(thor);
        people.add(new Person("nick", 34 , "biologist"));

        Person hold = new Person("",0, "");
        for (Person i : people)
        {
            i.getInfo();
        }

        for (Person i : people)
        {
            if (i.name() == "sam") {
                System.out.println(people.indexOf(i));
            }
        }
    }
}
* */