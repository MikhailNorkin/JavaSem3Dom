package Tasks;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> listA = new ArrayList();
        listA.add(3);
        listA.add(10);
        listA.add(1);        
        
        int min = listA.get(0);
        int max = listA.get(0);
        int sum = listA.get(0);

        for (int i = 1; i < listA.size(); i++) {
            if (min > listA.get(i)){
                min = listA.get(i);
            }
            if (max < listA.get(i)){
                max = listA.get(i);
            }
            sum = sum + listA.get(i);
            
        }

        System.out.println("min = "+min);
        System.out.println("max = "+max);
        System.out.println("серднее = "+sum/listA.size());

    }
}
