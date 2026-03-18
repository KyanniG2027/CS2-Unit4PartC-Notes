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
      String[][] seatingChart = new String[4][6]; // total number of items 4*6= 24

      //SET A VALUE by accessing a cell
      //ACCESS a cell: arrayName[row][col]
      seatingChart[0][0] = "Mia"; 
      seatingChart[0][5] = "Sohaila"; //6 columns, 5 is the FINAL INDEX! 
      seatingChart[1][0] = "Ethan";
      seatingChart[1][5] = "Zach";
      seatingChart[2][1] = "Aaniyah";
      seatingChart[2][3] = "Simeon";
      seatingChart[2][4] = "Bowe"; //second to last column 
      seatingChart[3][0] = "Max S";
      seatingChart[3][2] = "Max";
      seatingChart[3][3] = "Kyanni";
      seatingChart[3][4] = "Danny";
      seatingChart[3][5] = "Matthew";

      // Shortcut: INITALIZIER LISTS
      //use double curly brackets to set values 
      // for a 20 array right away!

      String[][] bingo = {
                        {"!","A","11"} , 
                        {"$","<3", ":)"} , 
                        {",","20","x"}
                         };
      //Look at new array
      System.out.println(bingo); // no built in toString
      //have to use a loop or access indiviual items 
      System.out.println(bingo[0][0] );
      System.out.println(bingo[1][1]);
      System.out.println(bingo[1][2]);

      //4.12 AD Array TRAVERSALS (loops)
      // A row in a 2D array is just a 1D array
      //when we loop, we go ROW first 
      //then every COL in that row 

      //ENCHANED FOR-EACH loops (nested)
      //outer loop iterates through all ROWS 
      for (String[] row : seatingChart) {
         //for every col in that current row
         for (String col : row){
            System.out.println(col + " " );
          }
          System.out.println();

    }
    //remember that For-Each loops are only
    //for visiting evert-item, not changing values

    //STANDARD for loops requires tracking the index
    //and knowing how many items in each row/col
    //array.length provides # of ROWS in a 2D array
    int numRows = seatingChart.length; //4
    //array[0].length provie3w # of COLS
    int numCols = seatingChart[0].length;
    //seating chart of [0] is literally the first whole row 

    //use this info in the standard for loop
    for(int r = 0; r < seatingChart.length; r++ ) {
      for( int c = 0; c < seatingChart[0].length; c++) {
         System.out.print(seatingChart[r][c] + " " );
         // can modify values in a standard for loop!
         seatingChart[r][c] = "🪑" + seatingChart[r][c];
         System.out.print(seatingChart[r][c] + " ");
      }
     
      System.out.println(); // new line every row 
    }

 
      // CALL the two methods defined outside the main 
      int[][] matrix = { {1,2,3} , {4,5,6} };
      System.out.println(getRowTotal(0, matrix) );
      System.out.println(getRowTotal(1, matrix) ); //second row

  
  
  
   } // ends main method

   //definition method to count items in a specific row
    public static int getRowTotal (int row, int[][] array) {
      //prepare the return value 
      int sum= 0;
      //loop through the row 
      for( int currentCol : array[row] ){
         sum+= currentCol; 

      }

      return sum;

    }

} // ends class
   
