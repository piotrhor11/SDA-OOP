package PersonAndBirthDay;

public class Person {

    private String name;
    private String surname;
    private String PESEL;                       // Nie zapisywać jako int lub long, bo utniemy wiodące 0
    private Gender gender;
    private BirthDay birthDay;

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.PESEL = pesel;
        this.birthDay = new BirthDay(this.PESEL);
        gender = birthDay.getGender();
    }

}
