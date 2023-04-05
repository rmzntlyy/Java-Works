public class Teacher {

    String name;
    String mpno;
    String branch;
    Teacher (String name , String mpno ,String branch){

        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }

    void print_teacher_info(){

        System.out.println(this.name);
        System.out.println(this.mpno);
        System.out.println(this.branch);

    }


}
