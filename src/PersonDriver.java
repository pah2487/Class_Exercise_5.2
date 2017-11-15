/**
 * Driver code for the Person class, tests if the two people are the same then, if they are not the same, tests their attributes
 * @author Patrick H.
 * @since 2017-11-15
 * @version 1.0
 */
public class PersonDriver {
    public static void main(String[] args){
        Person person1 = new Person("James", 25);
        //Person person2 = new Person("James", 25);
        Person person2 = new Person("Samantha", 32);

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println("\nAre they the same person?");
        if (person1.toString().equals(person2.toString())){
            System.out.println("Yes.");
        } else{
            System.out.println("No.");
            System.out.println("\ndo they have the same name?");
            if (person1.getName().equals(person2.getName())){
                System.out.println("Yes, both their names are "+person1.getName());
            } else{
                System.out.println("No,their names are "+person1.getName()+" and "+person2.getName());
            }

            System.out.println("\ndo they have the same age?");
            if (person1.getAge() == person2.getAge()){
                System.out.println("Yes, both their Age is "+person1.getAge());
            } else{
                System.out.println("No.");
                System.out.println("\nwho is older?");
                if (person1.getAge()>person2.getAge()){
                    System.out.println(person1.getName()+" is older than "+person2.getName());
                } else{
                    System.out.println(person2.getName()+" is older than "+person1.getName());
                }
                System.out.println("\nwho is Younger?");
                if (person1.getAge()<person2.getAge()){
                    System.out.println(person1.getName()+" is younger than "+person2.getName());
                } else{
                    System.out.println(person2.getName()+" is younger than "+person1.getName());
                }
                System.out.println("\nThe two people's ages are "+person1.getAge()+"("+person1.getName()+")"+" and "+person2.getAge()+"("+person2.getName()+")");
            }

        }
    }
}
