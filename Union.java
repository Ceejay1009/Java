import java.util.*;


public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers for Array1: ");
        for (int i = 0; i < 5; i++) {
            arr1.add(input.nextInt());
        }
        System.out.print("Enter five integers for Array2: ");
        for (int i = 0; i < 5; i++){
            arr2.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++){
            System.out.print(arr1.get(i)+"\t");
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.print(arr2.get(i)+"\t");
        }

        System.out.println();
        System.out.print("The combined list is: "+ union(arr1,arr2)+"\t");

    }
    public static ArrayList<Integer> union(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> UnionArr = new ArrayList<>();
        UnionArr.addAll(arr1);
        UnionArr.addAll(arr2);
        return UnionArr;
    }
}
