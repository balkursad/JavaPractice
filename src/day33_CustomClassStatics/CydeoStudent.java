package day33_CustomClassStatics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName;
    public static String programmingLanguage;

    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
    }

    public CydeoStudent(String name, int age, char gender, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+ " is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending the Class");
    }

    public static void printSchoolname(){
        System.out.println("School name is: "+ schoolName);
    }

    public static void programmingLanguage(){
        System.out.println("Students use "+ programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
