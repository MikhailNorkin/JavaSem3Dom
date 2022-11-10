
//Пусть дан произвольный список целых чисел, удалить из него четные числа


package Tasks;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List listA = new ArrayList();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        System.out.println(listA);
        int max = listA.size()-1;
        for (int i = max; i >= 0; i--) {
            if (i%2 != 0){
                listA.remove(i);
            }
        }
        System.out.println(listA);
    }    
}
