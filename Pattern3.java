import java.util.*;
class Pattern3
{
	static void printPatternOneRowDEc(char ch,int nc)
	{
		for(int i=0;i<nc;i++)
		{
	System.out.print(ch);
	}
	System.out.print("\n");
	}
	static void printPatternInc(int nr,char ch)
	{
for(int i=nr;i>0;i--)
		{
	printPatternOneRow(ch,i);
		}
	}
	static void printPatternInc(int nr,char ch)
	{
		for(int i=1;i<=nr;i++)
		{
			printPatternOneRow(ch,i)
		}
	}
		public static void main(String[] args) 
	{
int n=9;
char c='m';	
	if(n%2==0)
		{
printPatternInc(int)n/2, c);
printPatternDec(n+1)/2), c);
	}
	else
		{
printPatternInc((int)(n/2), c);
printPatternDec((int)(n+1)/2, c);
		}
	}
}