public class Fighter {
    String name;
    int damage;
    int health;
    int weight;


    Fighter(String name , int damage , int health , int weight){

        this.name= name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

    }

    int Hit (Fighter foe){

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar vurdu.");

        if((foe.health = foe.health - this.damage)<=0){
            return 0;
        }
        return (foe.health = foe.health-this.damage);
    }



}
