import java.io.*;
import java.utiil.Scanner;
public class DemoTranslation
{
 public static void main(String[] args) 
	{
	 int[]bt=new int[20],wt=new int[20],tat=new int[20];
	 int n;
	 float wtong,tatavg;
	 System.out.println("\n Enter the number of process---");
	 n=STDIN_SCANNER.nextInt();
	 for(int i=0;i<n;i++)
	 System.out.println("\n Enter Burst time for process"+i+"---");
	 bt[i]=STDIN_SCANNER.nextInt();
	}
	wt[0]=(int)(wtavag=0);
	tat[0]=(int))(tatavg=bt[0]);
	for(int i=1;i<n;i++)
	{
		wt(i)=wt[i-1]+bt[i-1];
		tat(i)=tat[i-1]+bt[i-1];
		wtavg=wtavg+wt[i];
		tatavg=tatavg+tat[i];
	}
System.out.println("\t PROCESS \t BURST TIME \t WAIOTING TIME \t TURN AROUND TIME");
	{
		for(inti=0;i<n;i++);
		System.out.println("\n \t P"+i" \t \t"+bt[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);
		System.out.println("\n Average waiting time----%f",wtava\n);
         System.out.println("\n Average turn around time----%f",wtava\n);
public final Scanner STDIN_SCANNER=new Scanner(System.in);
	}






		 



	