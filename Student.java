import java.util.Optional;

public class Student {


    private  String name;
    private Optional<Adress> adress;


    Student(String name,Adress adress){

        this.name = name;
        this.adress = Optional.ofNullable(adress);

    }

    public Student(String name) {
        this(name, null);
    }


    public String getName(){
        return name;
    }

    public Optional<Adress> getAdress(){
        return adress;
    }



    public void printStudentInfo(Student student){
        System.out.println(student.getName());
        student.getAdress().ifPresent(adress -> System.out.println("City" + adress.getCity() + "Region" + adress.getRegion()));
    }

}
