package firststeps;

public class ContinueBreakConcept {

        public static void main(String args[]){


            for(int i=0; i<3; i++) {
                if (i == 1) {
                    System.out.println(i);
                    break;
                }
            }
            // Illustrating break statement (execution stops when value of i becomes to 4.)
            System.out.println("Break Statement\n");
            for(int i=1;i<=5;i++){
                if(i==2) break;
                System.out.println(i);
            }
            // Illustrating continue statement (execution skipped when value of i becomes to 1.)
            System.out.println("Continue Statement\n");
            for(int i=1;i<=5;i++){
                if(i==2) continue;
                System.out.println(i);
            }

            // Illustrating break statement (execution stops when value of i becomes to 4.)
            System.out.println("Break Statement\n");
            for(int i=1;i<=5;i++){
                if(i==4) break;
                System.out.println(i);
            }
        }
    }

