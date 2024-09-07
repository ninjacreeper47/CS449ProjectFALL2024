import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class RubberDuckManager
{
    public RubberDuckManager(int numDucks, boolean ducksAngry) {
        this.numDucks = numDucks;
        this.ducksAngry = ducksAngry;
        if(numDucks > 0) {
            this.ducksDefeated = false;
        }
        }

    public int numDucks = 0;
    public boolean ducksAngry = false;

    public boolean ducksDefeated = false;

    public void AttackDucks()
    {
        if(ducksDefeated)
        {
            return;
        }
        numDucks--;
        ducksAngry = true;
        if(numDucks < 1)
        {
            ducksDefeated = true;
        }
    }

    public void MultiplyDucks(int factor)
    {
    numDucks *= factor;
    }
    public void NewDuck()
    {
        if (ducksDefeated)
        {
            return;
        }
        if (numDucks >= 2 ) {
            ducksAngry = false;
            numDucks++;
        }
        else
        {
            ducksAngry = true;
        }
    }
    public void printDuckArmy()
    {
        if (ducksAngry)
        {
            System.out.println(" Ducks are rapidly approaching your location");
        for (int i = 0; i <numDucks; i++)
        {
            System.out.println("🦆");
        }
        }
        else
        {
            System.out.print("There are ");
            System.out.print(numDucks);
            System.out.print(" happy little ducks");
            System.out.println();
        }
    }
}
