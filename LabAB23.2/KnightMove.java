
/**
 * Write a description of class KnightMove here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KnightMove
{
    public static boolean possible(int[][] arr, int row, int col)
    {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        int[] horizontal = {1,2,2,1,-1,-2,-2,-1};
        int[] vertical = {-2,-1,1,2,2,1,-1,-2};
        if(row+vertical[0]>0 && row+vertical[0]<9 && 
           col+horizontal[0]>0 && col+horizontal[0]<9 &&
           arr[row+vertical[0]][col+horizontal[0]]==0)
                one = true;
        if(row+vertical[1]>0 && row+vertical[1]<9 && 
           col+horizontal[1]>0 && col+horizontal[1]<9 &&
           arr[row+vertical[1]][col+horizontal[1]]==0)
                two = true;
        if(row+vertical[2]>0 && row+vertical[2]<9 && 
           col+horizontal[2]>0 && col+horizontal[2]<9 &&
           arr[row+vertical[2]][col+horizontal[2]]==0)
                three = true;
        if(row+vertical[3]>0 && row+vertical[3]<9 && 
           col+horizontal[3]>0 && col+horizontal[3]<9 &&
           arr[row+vertical[3]][col+horizontal[3]]==0)
                four = true;
        if(row+vertical[4]>0 && row+vertical[4]<9 && 
           col+horizontal[4]>0 && col+horizontal[4]<9 &&
           arr[row+vertical[4]][col+horizontal[4]]==0)
                five = true;
        if(row+vertical[5]>0 && row+vertical[5]<9 && 
           col+horizontal[5]>0 && col+horizontal[5]<9 &&
           arr[row+vertical[5]][col+horizontal[5]]==0)
                six = true;
        if(row+vertical[6]>0 && row+vertical[6]<9 && 
           col+horizontal[6]>0 && col+horizontal[6]<9 &&
           arr[row+vertical[6]][col+horizontal[6]]==0)
                seven = true;
        if(row+vertical[7]>0 && row+vertical[7]<9 && 
           col+horizontal[7]>0 && col+horizontal[7]<9 &&
           arr[row+vertical[7]][col+horizontal[7]]==0)
                eight = true;
        if(one||two||three||four||five||six||seven||eight)
            return true;
        else
            return false;
    }
    
    public static String knight(int startRow, int startCol)
    {
        int[][] grid = new int[9][9];
        int[] horizontal = {1,2,2,1,-1,-2,-2,-1};
        int[] vertical = {-2,-1,1,2,2,1,-1,-2};
        for(int[] rowArr: grid)
        {
            for(int item: rowArr)
            {
                item = 0;
            }
        }
        
        grid[startRow][startCol]=1;
        int count = 2;
        do
        {
            count = 2;
            for(int newRow = startRow, newCol= startCol;
                possible(grid,newRow,newCol)&&count<=64; count++)
                {
                    int tempRow = newRow;
                    int tempCol = newCol;
                    do{
                        int movement = (int)(Math.random()*8);
                        newRow = tempRow+vertical[movement];
                        newCol = tempCol+horizontal[movement];
                    }while(newRow<1 || newRow>8 || newCol<1 || newCol>8 || grid[newRow][newCol]!=0);
                    grid[newRow][newCol]=count;
                }
            for(int[] rowArr: grid)
            {
                for(int item: rowArr)
                {
                    item = 0;
                }
            }
        }while(count!=64);
        
        String row1 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row1+=grid[1][i]+" ";
        }
        String row2 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row2+=grid[2][i]+" ";
        }
        String row3 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row3+=grid[3][i]+" ";
        }
        String row4 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row4+=grid[4][i]+" ";
        }
        String row5 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row5+=grid[5][i]+" ";
        }
        String row6 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row6+=grid[6][i]+" ";
        }
        String row7 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row7+=grid[7][i]+" ";
        }
        String row8 = "";
        for(int i=1; i<grid[0].length; i++)
        {
            row8+=grid[8][i]+" ";
        }
        String knight = row1+"\n"+row2+"\n"+row3+"\n"+row4+"\n"+row5+"\n"+row6+"\n"+row7+"\n"+row8;
        return knight;
    }
    
    public static void main()
    {
        System.out.print(knight(1,1));
    }
}
