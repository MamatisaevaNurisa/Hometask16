public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();

        for (Animal animal1 : animals) {
            if (animal1.getClass().getName().equals("Shark")) {
                ((Shark) animal1).attack();
                ((Shark) animal1).sleep();
            }
            else if (animal1.getClass().getName().equals("Turtle")) {
                ((Turtle)animal1).swim();
                ((Turtle)animal1).sleep();
            }
            else if (animal1.getClass().getName().equals("Eagle")) {
                ((Eagle)animal1).fly();
                ((Eagle)animal1).sleep();
            }
        }



        for (Animal animal2 :animals) {
            if (animal2 instanceof Shark){
                ((Shark) animal2).attack();
            }
            else if (animal2 instanceof Turtle) {
                ((Turtle)animal2).swim();

            }
            else if(animal2 instanceof Eagle){
                ((Eagle)animal2).fly();

            }

        }

    }
}