public class PersonTest {
    public static void main(String[] args) {
        Person mark = new Person("000001", "Mark", "Dsilva", "Mr.", 2004);
        System.out.println(mark.fullName());
        System.out.println(mark.formalName());
        System.out.println(mark.getAge());
        System.out.println(mark.getAge(2012));
        System.out.println(mark.toCSVDataRecord());

    }
}