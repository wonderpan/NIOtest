package demo;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void mian(String[] args){
        int aHundredMillion = 10000;

        Map<Integer, Integer> map = new HashMap<>();

        long s1 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map.put(i, i);
        }
        long s2 = System.currentTimeMillis();

        System.out.println("δ��ʼ����������ʱ �� " + (s2 - s1));


        Map<Integer, Integer> map1 = new HashMap<>(aHundredMillion / 2);

        long s5 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map1.put(i, i);
        }
        long s6 = System.currentTimeMillis();

        System.out.println("��ʼ������"+aHundredMillion/2+"����ʱ �� " + (s6 - s5));


        Map<Integer, Integer> map2 = new HashMap<>(aHundredMillion);

        long s3 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map2.put(i, i);
        }
        long s4 = System.currentTimeMillis();
        System.out.println("��ʼ������Ϊ"+aHundredMillion+"����ʱ��" + (s4 - s3));
    }
}
