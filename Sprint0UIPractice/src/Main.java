
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String[] args = {"these","arguments","do not ", "matter"};
                CS449Sprint0GUIPractice.main(args);

            }
        });

        RubberDuckManager ducks = new RubberDuckManager(10,false);
        ducks.printDuckArmy();
        ducks.MultiplyDucks(2);
        ducks.printDuckArmy();
        ducks.AttackDucks();
        ducks.printDuckArmy();
        ducks.NewDuck();
        ducks.printDuckArmy();
    }
}
