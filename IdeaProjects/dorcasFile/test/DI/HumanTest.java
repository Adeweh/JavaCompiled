package DI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    public void diTest(){
        DorcasWalk dorcasWalk = new DorcasWalk();
        Walk catWalk = new CatWalk();
        Human jumie = new Human();
        jumie.walk();
        jumie.setWalkInPidgin(catWalk);
        jumie.walk();
    }
    @Test
    void testAbstractClass(){
        AbstractNonsense abstractNonsense = new AbstractNonsense() {
//                 @Override
       public void run() {
                System.out.println("I am running");
            }
        };
        abstractNonsense.run();

        AbstractNonsense second = new AbstractNonsense() {
      //      @Override
      public void run() {
                System.out.println("I am sleeping");
            }
        };
        AbstractNonsense third = new AbstractNonsense() {
            };
        second.run();
        }

}