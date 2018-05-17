public class Person {
    private String name;
    private int age;
    private String jobTitle;
    private int index = 0;

    //create
    public Person(String name, int age, String jobTitle)
    {
        this.age = age;
        this.name = name;
        this.jobTitle = jobTitle;
    }



    //get methods
    public String getName()
    {
        return this.name;
    }

    public int getIndex() {
        return index;
    }

    public int getAge() {return this.age;}



    //set methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setJobTitle(String jobTitle) {this.jobTitle =jobTitle;}

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString()
    {
        String result = ""+index+":" +name + ":" + age + ":" + jobTitle;
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