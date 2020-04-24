import java.util.*;
public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c[][]=new int[a][b];
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				c[i][j]=s.nextInt();
			}
		}
		print(c);
	}
		public static void print(int c[][])
		{
			int row =c.length;
			
			int column=c[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println("");
		}
		}
	}

