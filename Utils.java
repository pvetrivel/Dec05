package DEC05;

import DEC05.model.Team;

public class Utils {

    static  int wicketProbability = 0;
    private Utils() {
        throw new AssertionError("dont instatntiate");
    }


    public static int doRandom(int someParam, Team bat) {
     // static  int wicketProbability = 0;
        int random = (int) (Math.random() * someParam);

        if (random==7) {
            if (bat.getTeamName().equals("Batsman")) {
                if (wicketProbability > 1) {
                    wicketProbability = 0;
                    return 7;
                } else {
                    wicketProbability++;
                    return 0;
                }
            }
        }
            return random;
        }


    public static void printMessage(String message) {
        System.out.println(message);
    }
}

