/**
 * class composed of age and name.
 * @author Patrick H.
 * @since 2017-11-15
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;

    /**
     * constructs new person with given values
     * @param name person's name
     * @param age person's age
     */
    public Person(String name, int age){
    this.name = name;
    this.age = age;
    }
    /**
     * returns person's name value
     * @return person's name
     */
    public String getName(){
        return name;
    }
    /**
     * returns person's age value
     * @return person's age
     */
    public int getAge() {
        return age;
    }
    /**
     * sets a person's name value
     * @param name person's name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * sets person's age value
     * @param age person's age
     */
    public void setAge(int age){
        this.age = age;
    }
    /**
     *returns person's name and age values as a string
     */
    @Override
    public String toString(){
        return "Name: "+this.name+", Age: "+this.age;
    }
}
