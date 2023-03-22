package Develhope_Exercise.OOP._3;

public class Student {
    private String name = null;
    private String surname = null;
    private String id = null;
    private String codiceFiscale = null;
    private int age = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(String id) {
        if (id.length() < 6) {
            this.id = "";
        } else {
            this.id = id;
        }
    }

    public void setCodiceFiscale (String CodiceFiscale) {
        if (CodiceFiscale.length() < 6) {
            this.codiceFiscale = "";
        } else {
            this.codiceFiscale = CodiceFiscale;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
        } else {
            this.age = age;
        }
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getSurname() {
        System.out.println(surname);
        return surname;
    }

    public String getId() {
        if (id.length() < 6) {
            System.out.println("not a valid id");
        } else {
            System.out.println(id);
        }
        return id;
    }

    public String getCodiceFiscale() {
        if (codiceFiscale.length() < 6) {
            System.out.println("not a valid codiceFiscale");
        } else {
            System.out.println(codiceFiscale);
        }
        return codiceFiscale;
    }

    public int getAge() {
        if (age <= 0) {
            System.out.println("not a valid age");
        } else {
            System.out.println(age);
        }
        return age;
    }

    public void getValue () {
        getName();
        getSurname();
        getAge();
        getId();
        getCodiceFiscale();
    }
}
