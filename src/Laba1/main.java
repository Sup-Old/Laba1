package Laba1;
public class main {
    public static void main(String[] args){

        Student student1 = new Student("ghjfd", 23, true);
        Student student2 = new Student("gf", 25, false);

        Student student3 = new Student("ghgf", 21, false);

        Student student4 = new Student("gfgf", 25, true);

        Student student5= new Student("gfh", 20, false);
        WriteInfo writeInfo = new WriteInfo();
        writeInfo.print(student1);
        System.out.println();
        writeInfo.print(student2);
        System.out.println();
        writeInfo.print(student3);
        System.out.println();
        writeInfo.print(student4);
        System.out.println();
        writeInfo.print(student5);
        System.out.println(-);
        Student []arr = {student1,student2, student3, student4, student5};
        System.out.println("Average age of student"+ student1.averageAge(arr));
        System.out.println("Count of zadolzh"+student1.countOfZad(arr));
    }
}

