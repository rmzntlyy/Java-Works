public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name , int salary, int workHours , int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    int tax(){

        if (this.salary>1000){

            return ((this.salary*3)/100);
        }

        return 0;
    }
    int bonus(){
        int bonus=0;
        if (this.workHours>40){
            bonus = (this.workHours-40)*30;
            return bonus;
        }
        return 0;
    }

    int raiseSalary(){
        if ((2021-this.hireYear)<10){

            return ((this.salary)/20);
        }
        if ((2021-this.hireYear)>9 && (2021-this.hireYear)<20){

            return ((this.salary*10)/100);
        }else {

            return ((this.salary*15)/100);
        }}

    void printString(){

        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: " +tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+ ((this.salary-this.tax())+(this.bonus()+this.raiseSalary())));
        System.out.println("=================================================================");

    }}
