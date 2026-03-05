public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");
   
      //***2D ARRAY DATA STRUCTURE  ***
      // like an Array, but a GRID with 
      //ROWS (horizontal) & COLUMNS (vertical)

      //DECLARE a 2D Array with double square brackets 
      int[][] experimentData; //null (empty) 
      double[][] pointValues; 

      //CREATE?INITIALIZE a 2D array, call constructor 
      experimentData= new int[10][3]; //10 rows 3 columns 
      
      //INITIALIZE a 2D array (declared + create)
      String[][] seatingChart = new String[4][6] // total number of items 4*6= 24

      //SET A VALUE by accessing a cell
      //ACCESS a cell: arrayName[row][col]
      seatingChart[0][0] = "Mia"; 
      seatingChart[0][5] = "Sohaila"; //6 columns, 5 is the FINAL INDEX! 
      seatingChart[1][0] = "Ethan";
      seatingChart[1][5] = "Zach";
      seatinghChart[2][1] = "Aaniyah"
      seatingChart[2][3] = "Simeon";
      seatingChart[2][4] = "Bowe"; //second to last column 
      seatingChart[3][0] = "Max S";
      seatingChart[3][2] = "Max";
      seatingChart[3][3] = "Kyanni";
      seatingChart[3][4] = "Danny";
      seatingChart[3][5] = "Matthew";




   }
}
