public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code , String prefix ){

    this.name = name;
    this.code = code;
    this.prefix = prefix;
    int note =0;
    }

    void  add_teacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
        this.teacher=teacher;}else {
            System.out.println("Girilen bilgiler ile hoca eşleşmemekte.!");
        }}

    void printteacherinfo(){

        this.teacher.print_teacher_info();
    }
    void  printcourseinfo(){
        System.out.println("Ders Adı: "+this.name);
        System.out.println("Ders Kodu: "+this.code);
        System.out.println("Ders Önadı: "+this.prefix);
        System.out.println("Ders Notu: "+this.note);

    }}
