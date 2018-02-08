import java.io.*;
import java.util.*;
public class Bubblesort {
	public static void main(String[] args)
	{
			int[] data={10,7,5,3,9,40};
			int temp;
			for(int step = 0;step < data.length-1;step++)
			{
				for(int i=0 ; i<data.length-1-step;i++)
				{
					if(data[i] > data [i+1])
					{
						temp = data[i];
						data[i] = data[i+1];
						data[i+1] = temp;
					}
				}
			}
			for(int j=0;j<data.length;j++)
			{
			System.out.println("the sorted array is" + data[j]);
			}
			
		
	}

}
