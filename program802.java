import java.util.Scanner;
// fibonacci series 
// 0 1 1 2 3 5 8 13 21.....

class program802
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements in series : ");
        int iSize = sobj.nextInt();

        int i = 0,First = 0, Next = 0, Second = 0;

        for(i = 1, First = 0, Second = 1; i <= iSize; i++)
        {
            System.out.println(First+ " ");
            Next = First + Second;

            First = Second;
            Second = Next;
        }
        System.out.println();
    }
}