/* package 를 보고  찾아감 , JVM 에게 알려주는 hijava.practice */
package hijava.practice;

/**
 * 코드 설명 내용 설명...
 * @author Jane
 * @update say 함수 추가
 * @date 2022-04-04
 */

/* JVM 어딘가에 HelloJava 가 존재 그안에 say 가 존재 */
public class HelloJava
{

    /* JVM -> JVM 이 구동될때 실행되는 Method 가 Main은 JVM say 는 HelloJava */
    public static void main(String[] args)
    {
        /* 한줄 한줄을 byteCode 로 번역 , Java는 Interpreter ';' 단위로 번역 */
        HelloJava.say("Hi!!");
        say("HelloJava");
        System.out.println("HelloJava"); //JVM이 스스로 화면에 출력
    }

    /* Thread 가 say 를 찾고 HI의 주소를 전달 를 say 에 전달 */
    public static void say(String msg)
    {
        /* System Class 안에 out Class 안에 println Method */
        /* msg -> HI 의 주소 , 번지를 찾아가서 값을 뿌려줌 */
        System.out.println(msg);
    }
}
