public class Main {
    public static void main(String[] args) {
        String[][] TintinsRecept = new String[2][3];
        TintinsRecept[0][0] = "Lollipop";
        TintinsRecept[0][1] = "Lollipop";
        TintinsRecept[0][2] = "Lollipop";

        TintinsRecept[1][0] = "banana";
        TintinsRecept[1][1] = "apple";
        
        for (int i = 0; i < TintinsRecept.length; i++) {
            for (int j = 0; j < TintinsRecept[i].length; j++) {
                System.out.println(TintinsRecept[i][j] + " ");
            }
        }
    }
}
