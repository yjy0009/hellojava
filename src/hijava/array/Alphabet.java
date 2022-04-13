package hijava.array;

import java.util.Arrays;

public class Alphabet
{
    public static void main(String[] args)
    {
        char[][] alphabet = new char[2][26];
        int a = 65;
        int b = 97;
        for (int i = 0; i < alphabet.length; i++)
        {
            for (int j = 0; j < alphabet[i].length; j++)
            {
                if (i == 0)
                    alphabet[0][j] = (char) a++;
                else
                    alphabet[1][j] = (char) b++;
            }
        }


        for (int i = 0; i < alphabet.length; i++)
        {
            for (int j = 0; j < alphabet[i].length; j++)
            {
                System.out.print(alphabet[i][j] + " ");
            }
            System.out.println();
        }

        int upperStart = 65;
        int lowerStart = 97;

        int[] stars = new int[]{upperStart, lowerStart};
        char[][] arr = new char[2][26];

        for (int start = 0; start < stars.length; start++)
        {
            for (int i = 0; i < 26; i++)
            {
                int x = i + stars[start];
                arr[start][i] = (char)x;
            }
        }
//        for (int i = lowerStart; i < lowerStart + 26; i++)
//        {
//            System.out.println(i + " = " + (char) i);
//        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
