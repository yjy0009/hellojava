package hijava.oop;

public class Student
{
    private String studentNo;
    private String name;
    private String age;
    private String telNo;
    private String eMail;

    public Student(String name)
    {
//        this.name = name;
        setName(name);
    }

    public String getStudentNo()
    {
        return studentNo;
    }

    public void setStudentNo(String studentNo)
    {
        this.studentNo = studentNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String geteMail()
    {
        return eMail;
    }

    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }


    public String getTelNo()
    {
        /*
        if(telNo != null)
        {
            char[] phone = telNo.toCharArray();
            for (int i = telNo.length() - 1; i >= telNo.length() - 4; i--)
                phone[i] = '*';
            return String.valueOf(phone);
        }
         */

        if(telNo != null || telNo.length() < 4)
            return telNo;
        else
            return telNo.substring(0,telNo.length() - 4);

      /*
      if(telNo != null)
      {
        String lastString = phonNum.substring(phonNum.length() - 4, phonNum.length());
        return phonNum.replace(lastString, "****");
       }
      */
    }

    public void setTelNo(String telNo)
    {
        this.telNo = telNo;
    }

    @Override
    public String toString()
    {
        return " Student \n" +
                " [ \n" +
                "   학번 : " + this.studentNo + "\n" +
                "   나이 : " + this.age + "\n" +
                "   이름 : " + this.name + "\n" +
                "   전화번호 : " + getTelNo() + "\n" +
                " ] ";
    }
}
