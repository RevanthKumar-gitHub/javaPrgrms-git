import java.util.Scanner;
public class QuickSort
{

    static int partition(String arr[],int l,int h)
    {
        String pivot= arr[h];
        int i = l-1;

        for(int j=l;j<h;j++)
        {
            if(arr[j].compareTo(pivot)<0)
            { 
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h]  = temp;

        return (i+1);
    }
    static void quickSort(int l,int h,String arr[])
    {
        int pi;
        if(l<h)
        {
            pi = partition(arr,l,h);
            quickSort(l,pi-1, arr);
            quickSort(pi+1, h, arr);
        }
    }

    static void print(String arr[])
    {
        for(String i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter How Many Names : ");
        int x = in.nextInt();
        String arr[]= new String[x];
        System.out.println("Enter "+x+"names : ");
        for(int i=0;i<x;i++)
        {
            arr[i]= in.next();
            arr[i].toLowerCase();
            
        }
        int n = arr.length;
        quickSort(0, n-1, arr);
        print(arr);

        in.close();;
    }
}

