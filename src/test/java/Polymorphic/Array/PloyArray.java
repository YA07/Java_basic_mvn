package Polymorphic.Array;

public class PloyArray {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Person("zeus",9999);
        persons[1] = new Student("Tom",17,100);
        persons[2] = new Student("Tim",16,99);
        persons[3] = new Teacher("Django",55,300000);
        persons[4] = new Teacher("Bitch",58,400000);

        for (int i =0;i<persons.length;i++){
            System.out.println(persons[i].say());
        }
    }
}

