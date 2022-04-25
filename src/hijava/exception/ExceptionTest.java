package hijava.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionTest
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("test.txt");
            fis.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        catch (IOException e) // FileNotFoundException 이 IOException 의 자식
        {
            e.printStackTrace();
        }

        //개선된 버전 close 는 finally 에서 하는것이 좋음 (좋은 코드)
        FileInputStream fis2 = null;
        try
        {
           fis2 = new FileInputStream("test.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        finally
        {
            try
            {
                fis2.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        //좋은 코드 !! (최종 버전)
        try(FileInputStream fis = new FileInputStream("test.txt"))
        {
            System.out.println("000000000000000000000000000000000");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        catch (IOException e) // FileNotFoundException 이 IOException 의 자식
        {
            e.printStackTrace();
        }
        


     /*
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("test.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Error Message : " + e.getMessage());
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
      */
    }
}
