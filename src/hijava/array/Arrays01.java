package hijava.array;

import hijava.oop.Man;

public class Arrays01
{
    public static void main(String[] args)
    {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }


    private static void ex5()
    {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.arraycopy(arr1, 0, arr2, 2, 3);

        for(int i : arr2)
            System.out.println(arr2[i]);
    }

    private static void ex4()
    {
        Man[] manArrays = new Man[9];
        Man[] manArrays2 = new Man[9];
        Man[] manArrays3 = new Man[9];
        for (int i = 0; i < manArrays.length; i++)
        {
            manArrays[i] = new Man("김" + (i + 1) + "수");
            manArrays2[i] = manArrays[i]; // CallByReference shallow copy
            manArrays3[i] = new Man(manArrays[i].getName()); // deep copy (clone)
        }
        pintArrays(manArrays);

        System.out.println("1 = " + manArrays[0].getName());
        System.out.println("2 = " + manArrays2[0].getName());
    }


    private static void ex3()
    {
        Man[] manArrays = new Man[9];
        for (int i = 0; i < manArrays.length; i++)
        {
            manArrays[i] = new Man("김" + (i + 1) + "수");
        }
        pintArrays(manArrays);
    }

    private static void ex2()
    {
        String[] strArrays = new String[100];
        for (int i = 0; i < strArrays.length; i++)
        {
            strArrays[i] = "str" + (i + 1);
        }
        pintArrays(strArrays);
    }


    private static void ex1()
    {
        int[] numArrays = new int[100];
        for (int i = 0; i < numArrays.length; i++)
        {
            numArrays[i] = (i + 1);
        }
        printArrays(numArrays);
    }


    private static void pintArrays(Man[] manArrays)
    {
        for (Man a : manArrays)
            System.out.print(a.getName() + " ");
        System.out.println();
    }

    private static void printArrays(int[] numArrays)
    {
        for (int a : numArrays)
            System.out.print(a + " ");
        System.out.println();
    }

    private static void pintArrays(String[] strArrays)
    {
        for (String a : strArrays)
            System.out.print(a + " ");
        System.out.println();
    }
}
