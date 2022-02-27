import java. util. Scanner;
public class Votes {
    public static void main(String[] args){
    //Variable declaration
    int maxVote = 0, winner = 0;
    int total = 0;
    float percent;
    //string array to store names
    String[] names = new String[5];
    //int array to store votes
    int[] votes = new int[5];
    //Create a scanner
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < names.length; i++){
        System.out.print("Enter Candidate" + (i + 1) + "'s name: ");
        names[i] = input.nextLine();
        System.out.print("Enter "+ names[i]+ " votes received: ");
        votes[i] = input.nextInt();
        input.nextLine();
    }
    for ( int i=0; i < votes.length; i++ ) {
        total += votes[i];
    }
    for (int i = 0; i < votes.length; i++){
        if (maxVote < votes[i]) {
            maxVote = votes[i];
            winner = i;
        }
    }
    System.out.println("Candidate\t Votes Recieved\t\t % of total Votes");
    for( int i = 0; i < votes.length; i++){
        percent = (((float)votes[i]/total)*100);
        System.out.println(names[i]+ "\t\t\t" + votes[i] + "\t\t\t\t\t" + percent);
    }
    System.out.println();
    System.out.println("Total" + " " + total);
    System.out.println("the winner is " + names[winner]);
    }
}