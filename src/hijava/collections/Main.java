package hijava.collections;

import hijava.oop.Man;
import hijava.jdkbase.Student;

import java.util.*;

public class Main
{
    final static String[] strs = new String[]{"aaa", "bbb", "ccc"};

    public static void main(String[] args)
    {
        Man m = new Man("맨");
        Student stu = new Student("100", "Hong");

        // Generic 제네릭
        Person<Man> mp = new Person<>();
        mp.set(m);
        System.out.println(mp.getName());
        Person<Student> sp = new Person<>();
        sp.set(stu);
        System.out.println(sp.getName());

        // Collections (List, Set, Map)
        List<String> lst1 = new ArrayList<>(); //부모Type
        ArrayList<String> lst2 = new ArrayList<>(); //자식Type
        LinkedList<String> lst3 = new LinkedList<>();//first, last 가 기본으로 있음 Constant Pool 영역에

        lst1.add("1111");
        lst1.add("2222");
        lst2.add("aaaa");
        lst3.add("3333");
        lst3.add("4444");

        // [1111, 2222] -> [1111, ,2222] 한칸씩 밀어야함 shift 하는 비용이 많이듬 -> LinkedList 사용 (주소만 바꿔치기)
        // ArrayList 중간에 끼어들어가거나 삭제가 없는 경우 있는경우는 LinkedList
        // T item = list.remove(n);
        lst1.add(1, "100");
        lst3.add(1, "2222");
        System.out.println(lst1);
        System.out.println(lst2);
        System.out.println(lst3);

        lst1.add("3333");
        lst1.add("4444");

        boolean isPop = lst1.remove("100");
        System.out.println("isPop : " + isPop);
        System.out.println(lst1);

        String pop = lst1.remove(1);
        System.out.println("pop : " + pop);
        System.out.println(lst1);

        boolean isPop2 = lst1.remove("100");
        System.out.println("isPop2 : " + isPop2);

        int size = lst1.size();
        System.out.println("size : " + size);

        for (int i = 0; i < size; i++)
            System.out.println(i + "번 째 : " + lst1.get(i));

        // Vector 는 SyncronizedList
        // Stack -> LastInFirstOut (LIFO) 장바구니
        // Queue -> FirstInFirstOut (FIFO) 대기줄줄


        List<String> lst4 = new ArrayList<>();

        pushStack_enQueue(lst4);
        System.out.println(lst4);

//        pop(lst4, 2);
        deQueue(lst4, 2);

        System.out.println("----------------------------------");
        System.out.println(lst4);

        //HashSet -> 중복방지 + 순서 없음 , hashCode() 와 equals() 로 판단

        /**
         * BinaryTree 2,1,3,7,5,4
         * 2 를 기준으로 해서 정렬 2 보다 작으니 1 은 왼쪽 ...
         * 기준점을 4 로 변경
         * */

        Set<Student> set = new HashSet<>();
        set.add(new Student("100", "Hong"));
        set.add(new Student("50", "Lee"));
        set.add(new Student("200", "Kim"));
        set.add(new Student("100", "Hong"));
        System.out.println(set);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("100", "Hong"));
        ts.add(new Student("50", "Lee"));
        ts.add(new Student("200", "Kim"));
        ts.add(new Student("100", "Hong"));
        System.out.println(ts);

        // 75% 만확보하는이유 중간중간 끼어들기 편함
        Map<Integer, Student> map = new HashMap<>();
        Student student3 = new Student("100","Hong");
        Student student4 = new Student("200","Hong2");
        Student student5 = new Student("300","Hong3");

        map.put(Integer.parseInt(student3.getId()), student3);
        map.put(Integer.parseInt(student4.getId()), student4);
        map.put(Integer.parseInt(student5.getId()), student5);

        System.out.println(map);

        int searchId = 301;
        if(map.containsKey(searchId)) //NullPointerException 해결
        {
            Student s200 = map.get(searchId);
            System.out.println(s200.getName());
        }
        else
        {
            System.out.println(searchId + " 학생이 없습니다 !! ");
        }
    }


    private static void deQueue(List<String> lst4, int cnt)
    {
        for (int i = 0; i < cnt; i++)
        {
            String deQueueValue = lst4.remove(0);
            System.out.println(i + " - deQueueValue " + deQueueValue);
        }
    }

    private static void pop(List<String> lst4, int cnt)
    {
        for (int i = 0; i < cnt; i++)
        {
            String popValue = lst4.remove(lst4.size() - 1);
            System.out.println(i + " - popValue " + popValue);
        }
    }

    private static void pushStack_enQueue(List<String> lst4)
    {
        for (int i = 0; i < strs.length; i++)
            lst4.add(strs[i]);
    }
}

