public class Grid {

    char[][] grid = new char[3][3];

    public void drawGrid()
    {
        for (int i =0; i<3;i++)
        {
            System.out.println("_____");
            for(int j= 0; j<3;j++)
            {
                System.out.println("|"+grid[i][j]+"|");
            }
        }
    }
}
