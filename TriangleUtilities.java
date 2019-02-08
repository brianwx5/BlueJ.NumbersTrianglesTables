        
        public class TriangleUtilities {
            public static String getRow(int numberOfStars) {
                String outcome = "";
                for (int i = 0; i < numberOfStars; i++) {
                    outcome = outcome + "*";
        
                } return outcome;
            }
        
            public static String getTriangle(int numberOfRows) {
                String outcome = "";
                String star = "*";
                
            for (int i=1; i <= numberOfRows; i++) {
                for (int j =0; j < i; j++) {
                    outcome =outcome + star;
                }
            outcome = outcome + "\n";
            
        }   return outcome;

    }

    public static String getSmallTriangle() {
        
        String outcome = "";
        String star = "*";
        int i = 1;

        while (i <= 4)
        { 
            for(int j = 0; j < i; j++) {
                outcome = outcome + star;
            } 
            outcome = outcome + "\n";
            i++;
        }

        return outcome;
    }

    public static String getLargeTriangle() {
                String outcome = "";
        String star = "*";
        int i = 1;

        while (i <= 9)
        { 
            for(int j = 0; j < i; j++) {
                outcome = outcome + star;
            } 
            outcome = outcome + "\n";
            i++;
        } return outcome;
    } 
}
