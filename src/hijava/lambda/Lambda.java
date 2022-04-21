package hijava.lambda;

import hijava.jdkbase.Student;

/**
 * Lambda(Functional) Interface
 *
 * @FunctionalInterface 는 함수선언이 하나만 가능 -> 허구 그냥 껍데기 두개가 있을 필요가 없다
 * Lambda 식 자체가 Interface 가 되버림 Ld ld = (x,y) -> x * y;
 * 함수를 담아놓을 공간으로 @FunctionalInterface 사용 , Call 할때 사용 ld.mul(10,20);
 */
public class Lambda
{
    public static void main(String[] args)
    {
        Ld ld = (x, y) -> x * y;
//        public int fn(int x, int y)
//        {
//            return x * y;
//        }
        int result = ld.mul(10, 20);
        System.out.println("result = " + result);

        LdStudent ls1 = (i, s) -> new Student(i, s);
        LdStudent ls2 = (i, s) -> new Student(String.valueOf(Integer.parseInt(i) * 1000), s + "님");

        stufn(ls1, "100", "Hong");
        stufn(ls2, "200", "Kim");

        /**
         * 가독성이 좋다
         * 편리하다
         * */

        LdCalc add = (x, y) -> x + y;
        LdCalc sub = (x, y) -> x - y;
        LdCalc mul = (x, y) -> x * y;
        LdCalc div = (x, y) -> x / y;

        System.out.println(add.oper(10,20));
        System.out.println(sub.oper(10,20));
        System.out.println(mul.oper(10,20));
        System.out.println(div.oper(10,20));
    }

    private static void stufn(LdStudent ls, String id, String name)
    {
        Student stu = ls.makeStudent(id, name);
        System.out.println(stu);
    }

}
