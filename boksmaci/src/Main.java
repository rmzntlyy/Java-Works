public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Ahmet",20,200,85);
        Fighter f2 = new Fighter("Mehmet",13,154,82);


    Match match = new Match(f1,f2,80,90);
    match.run();

    }
}