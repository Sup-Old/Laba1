package Laba1;
public class Student {
    private String surname;
    private int age;

    private boolean zadol;

    public Student(String surname, int age, boolean zadol) {
        this.surname = surname;
        this.age = age;
        this.zadol = zadol;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isZadol() {
        return zadol;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setZadol(boolean zadol) {
        this.zadol = zadol;
    }

    public int averageAge(Student[] arr){
        int age=0;
        for (int i = 0; i < arr.length; i++) {
            age+=arr[i].getAge();
        }
        return age/arr.length;
    }

    public int countOfZad(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].isZadol()==true){
                count++;
            }
        }
        return count;
    }
}