import java.util.Random;
public class Main {
    public static void main(String[] args) {
        String line="---------------------------";
        task1();
        task2max();
        task2min();
        task3();
        task4();
        int sum=task1();
        System.out.println("Сумма трат за месяц составила "+sum+" рублей\n-------------");
        System.out.println("Максимальная сумма трат за день составила "+task2max()+" рублей");
        System.out.println("-------------\nМиниимальная сумма трат за день составила "+task2min()+
                " рублей\n----------------");
        System.out.println("Средняя сумма за месяц состовляет "+task3()+" рублей\n------------");
        for(String i:task4()) {
            System.out.print(i);
        }
    }
    public static String[] task4() {
        /*Задача 4
В бухгалтерской книге появился баг. Что-то пошло не так:
 фамилии и имена сотрудников начали отображаться в обратную сторону.
 Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов
char[ ]
.Напишите код, который в случае такого бага будет выводить фамилии
 и имена сотрудников в корректном виде. В качестве данных для массива используйте:
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
В результате в консоль должно быть выведено: Ivanov Ivan.*/
        String [] reversName={"n", "a", "v", "I", " " , "v", "o", "n", "a", "v", "I"};
        for(int i=0;i<reversName.length/2;i++){
            String temp;
            temp=reversName[i];
            reversName[i]=reversName[reversName.length-1-i];
            reversName[reversName.length-1-i]=temp;
        }
        return reversName;
    }
    public static double task3() {
        //посчитать среднюю сумму
        int []array=generateRandomArray();
        double averageValue=0;
        for(int i:array){
            averageValue+=i;
        }
        averageValue=(double) (averageValue/array.length);
        return averageValue;
    }
    public static int task2min() {
        int []array=generateRandomArray();
        int min=300_001;
        for(int i:array){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static int task2max() {
        /*Задача 2
Также бухгалтерия попросила найти минимальную и максимальную трату за день.
апишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
«Минимальная сумма трат за день составила … рублей.
 \Максимальная сумма трат за день составила … рублей».*/
        int []array=generateRandomArray();
        int max=99_999;
        for(int i:array){
            if(i>max){
                max=i;
            }
         }
        return max;
    }
    public static int  task1() {
/*Бухгалтеры попросили посчитать сумму всех выплат за месяц.
Напишите программу, которая решит эту задачу,
 и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».*/
        int[] array = generateRandomArray();
        int temp = 0;
        for (int i : array) {
            temp += i;
        }
        return temp;
    }
    public static int[] generateRandomArray() {
        Random random=new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(100_000,300_000);
        }
        return arr;
    }
}