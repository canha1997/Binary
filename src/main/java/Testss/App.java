package Testss;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayA=new int [10] ;

        for (int j = 0; j < arrayA.length; j++) {
            System.out.println("Nhap phan tu thu [" + j + "]trong mang");
            arrayA[j] = scanner.nextInt();
        }
        NhoDenLon(arrayA);
        displayArray(arrayA);
        System.out.println("Nhap so ban can tim:");
        int x = scanner.nextInt();
        System.out.println("so can tim nam tai vi tri  " + binarySearch(arrayA, x) + " trong mang");
    }

    public static void NhoDenLon(int[] arrayA) {
        Arrays.sort(arrayA);
        }



    public static int binarySearch(int [] arrayA,int x)
    {
        int max;
        int min=0;
        int mid;
        max=arrayA.length-1;
        while(min <= max)
        {
            mid=(min+max)/2;
            if(arrayA[mid] == x)
            {
                return mid;
            }
            else if(arrayA[mid] < x)
            {
                min=mid+1;
            }
            else
            {
                max=mid-1;
            }
        }
        return -1;
    }
    public static void displayArray(int [] arrayA)
    {
        for(int i=0; i<arrayA.length;i++)
        {
            System.out.println(arrayA[i]);
        }
    }

}

