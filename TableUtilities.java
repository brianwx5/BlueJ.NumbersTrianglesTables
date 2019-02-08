  

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int input = 5;
        String space = "";
        for(int i = 1; i <= input ; i++) {
            for (int j = 1; j <= input; j++) {
            space += space.format("%3d", j * i) + " |" ;
            } space = space + "\n";
        } return space;
        
    }

    public static String getLargeMultiplicationTable() {
        int input = 10;
        String space = "";
        for(int i = 1; i <= input ; i++) {
            for (int j = 1; j <= input; j++) {
            space += space.format("%3d", j * i) + " |" ;
            } space = space + "\n";
        } return space;
        
    }

    public static String getMultiplicationTable(int tableSize) {
        
        String space = "";
        for(int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
            space += space.format("%3d", j * i) + " |" ;
            } space = space + "\n";
        } return space;
        
    }
}
