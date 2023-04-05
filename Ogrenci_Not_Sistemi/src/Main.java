public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("SERKAN KRAL","8745498","eng");
        Teacher t2 = new Teacher("gül","6546500","trh");
        Teacher t3 = new Teacher("ayşe ","46540","c2");

        Course eng = new Course("mali","eee","eng");
        Course trh = new Course("ahmet","eee","trh");
        Course c2 = new Course("ali","eee","c2");

        eng.add_teacher(t1);
        trh.add_teacher(t2);
        c2.add_teacher(t3);

        Student s1= new Student("ramazan","2018502013","4",eng,trh,c2);
        s1.addBulkExamNote(100,100,20);
        s1.printNote();
        s1.isPass();
}}