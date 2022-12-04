import java.time.LocalDate;
import java.time.Month;

abstract class Person implements PersonInterface{
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class Student extends Person{
    private String npm;
    private String programStudi;

    public Student(String npm, String programStudi,String name,LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        this.npm = npm;
        this.programStudi = programStudi;
    }
    
    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    @Override
    public void menulis() {
        System.out.println("Menulis Tugas Akhir");
    }
}

interface PersonInterface {
    public void menulis();
}
