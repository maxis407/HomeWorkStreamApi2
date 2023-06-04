import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {



    public static void main(String[] args) {

        Adress address1 = new Adress("Moscow","MO");
        Adress adress2 = new Adress("Kazan","KO");
        Adress adress3 = new Adress("St.Peterburg","PO");





       Student student = new Student("Ivan",address1);
        Student student2 = new Student("Maks");
        Student student3 = new Student("Dima",adress2);


        student.printStudentInfo(student);
        student.printStudentInfo(student2);
        student.printStudentInfo(student3);


        List<String> list =  Arrays.asList("Предложение ", " состоит ", "из слов");
        String result = list.stream().reduce((s1,s2) -> s1 + " " + s2).orElse("");

        System.out.println(list);
        System.out.println(result);






    }
}