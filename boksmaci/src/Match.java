public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2 , int minWeight , int maxWeight){

        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    void run (){
        int i=1;

        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("======="+i+ ".ROUND=======");
                this.f2.health = this.f1.Hit(f2);
                if (isWin()){
                    break;}
                this.f1.health = this.f2.Hit(f1);
                if (isWin()){
                    break;}
                System.out.println(this.f1.name + "sağlık : "+this.f1.health );
                System.out.println(this.f2.name + "sağlık : "+this.f2.health );
                i++;
            }

        }else {
            System.out.println("Sporcuların sikleti uymamaktadır.");
        }}

    boolean isCheck(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin(){

        if (this.f1.health ==0){
            System.out.println(f2.name + " maçı kazandı.!" );
            return true;}

        if ( this.f2.health ==0){
            System.out.println(f1.name + " maçı kazandı.!");
            return true;}

        return false;
    }


}
