public class Patterns {
    public static void main(String[] args){
        //A
        int r, c;
        for(r = 1;r <= 6; r++) {
            for(c = 1;c <= r; c++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
//        //B
//        int r, c;
//        for(r = 6;r >= 1; r--) {
//            for(c = 1;c <= r; c++) {
//                System.out.print(c + "\t");
//            }
//            System.out.println();
//        }
//        //C
//        int r, c, sp;
//        for(r = 1;r <= 6; r++) {
//            for(sp = 6;sp > r; sp--) {
//                System.out.print("\t");
//            }
//            for(c = r;c >= 1; c--){
//                System.out.print(c + "\t");
//            }
//            System.out.println();
//        }
//        //D
//        int r, c, sp;
//        for(r = 6;r >= 1; r--) {
//            for(sp = 6;sp > r; sp--) {
//                System.out.print("\t");
//            }
//            for(c = 1;c <= r; c++) {
//                System.out.print(c + "\t");
//            }
//            System.out.println();
//        }
    }
}
