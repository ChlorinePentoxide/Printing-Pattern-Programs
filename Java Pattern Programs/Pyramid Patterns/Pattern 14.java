class Pattern_47
{
    public static void main(String args[])
    {
        int p_height=4; //change value to increase or decrease the size of piramid

        int max_stars=p_height*2-1;

        int p_space=p_height-1;

        for (int i=p_height; i>=1; i--)
        {
            for (int j=p_space; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=max_stars; k++)
            {
                System.out.print("*");
            }
            max_stars-=2;
            System.out.println();
        }

    } //end of main
}  //end of class


