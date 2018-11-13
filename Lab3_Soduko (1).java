/*
Noble Thomas 
02/21/2018
Sodoku Checker
 */
package lab3_soduko;

/**
 *
 * @author Noble
 */
public class Lab3_Soduko {
    public static void main(String[] args) {
        int  puzzle[][] = { 
  { 7, 8, 9, 1, 2, 3, 4, 5, 6}, // [Row 0]
  { 4, 5, 6, 7, 8, 9, 1, 2, 3}, // [Row 1]
  { 1, 2, 3, 4, 5, 6, 7, 8, 9}, // [Row 2]
  { 2, 3, 4, 5, 6, 7, 8, 9, 1}, // [Row 3]
  { 5, 6, 7, 8, 9, 1, 2, 3, 4}, // [Row 4]
  { 8, 9, 1, 2, 3, 4, 5, 6, 7}, // [Row 5]
  { 3, 4, 5, 6, 7, 8, 9, 1, 2}, // [Row 6]
  { 6, 7, 8, 9, 1, 2, 3, 4, 5}, // [Row 7]
  { 9, 1, 2, 3, 4, 5, 6, 7, 8} }; // [Row 8]

//Temporary  List
int[]tempList = new int [9];


System.out.println("Soduko Input:" );

//Print Orginal Soduko Puzzle
 for (int i = 0; i <= 8; ++i){
    for(int j =0; j <=8; ++j){
        if(j<=8){
        int temp = puzzle[i][j];
        System.out.print(temp + " ");
        }
        
    }System.out.println();
   }

   


//Checks Row 
String validRow = "";
outerRowloop:
for (int i = 0; i <= 8; i++){
    for(int j =0; j <=8; j++){
        tempList[j]= puzzle[i][j];
    }
        for(int k = 0; k < tempList.length; k++){
            for(int m = k+1; m < tempList.length; m++){
                if(tempList[k] == tempList[m]){
                validRow = ("Invalid: There is a duplicate in row: " + (i+1));
                break outerRowloop;
                } else {
                validRow = ("Rows 1,2,3,4,5,6,7,8,9 are valid");
                }
        
            }
        }
        

   }
System.out.println(validRow);

//Checks Column 
String validColumn = "";
outerColumnloop:
for (int i = 0; i <= 8; i++){
    for(int j =0; j <=8; j++){
        tempList[j]= puzzle[j][i];
    }
        for(int k = 0; k < tempList.length; k++){
            for(int m = k+1; m < tempList.length; m++){
                if(tempList[k] == tempList[m]){
                validColumn = ("Invalid: There is a duplicate in column: " +  (i+1)) ;
                break outerColumnloop;
                } else {  
                validColumn = ("Columns 1,2,3,4,5,6,7,8,9 are valid");
                }
              
        
            }
        }
   }
System.out.println(validColumn );

//Checks 3 by 3 Box 
String validSection = "";
outerSectionloop:
for (int i = 0; i <= 8; i++){
    for(int j =0; j <=8; j++){
        tempList[j]= puzzle[(i/3)* 3 + j / 3][ i * 3 % 9 + j % 3 ];
    }
        for(int k = 0; k < tempList.length; k++){
            for(int m = k+1; m < tempList.length; m++){
                if(tempList[k] == tempList[m]){
                validSection = ("Invalid: There is a duplicate in a box");
                break outerSectionloop;
                } else {
                validSection = ("Valid: There is no duplicate in any box");
                }
        
            }
        }
   }
System.out.println(validSection);
//END
 }
}
