import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Array {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    ArrayList<Integer> mas = new ArrayList<>();
    private String usl;
    private int[] nechet = new int[15];
    private int[] chet = new int[15];
    private int[] amas;
    private int size;
    private int k=0;
    private int or;
    private int j;
    private int i;

    //Конструкторы

    public Array()
    {

    }

    public Array (int size) {
        this.size = size;
        for (i=0;i<size;i++)
        {
            mas.add(i,0);
        }
    }

    //Методы

    public void fillArr()
    {
        or = UserMenu.readOption();
        for (i = 0; i < size; i++) {
            mas.add(i, or * or);
            or++;
        }
    }

    public void fillArr1()
    {
        or = 1;
        for (i = 0; i < size; i++) {
            mas.add(i, or * or);
            or++;
        }
        System.out.println("Ряд начинается с 1.");
    }

    public void setStart(int start)
    {
        this.or = start;
        for (i = 0; i < size; i++) {
            mas.add(i, or * or);
            or++;
        }
    }

    public int getStart()
    {
        return or;
    }

    public int[] getValues() {
        int[] amas = new int[mas.size()];
        for(i=0;i<mas.size();i++)
        {
            amas[i]=mas.get(i);
        }
        return this.amas;
    }

    public int getSize()
    {
        return this.size;
    }

    public void setValues(int size, int[]readed)
    {
        for (i = 0; i < size; i++) {
            mas.add(i, readed[i]);
        }
        this.size = size;
    }

    private static int pow(int value, int powvalue) {
        return (int) Math.pow(value, powvalue);
    }

    public void sortArr() {
        for (i = 0; i < 30; i++) {
            if (mas.get(i) % 2 == 0) {
                chet[k] = mas.get(i);
                k++;
            } else {
                nechet[j] = mas.get(i);
                j++;
            }
        }
        System.out.println();
        System.out.println("Чётные:");
        for (k = 0; k < 15; k++) {
            System.out.print(chet[k] + " ");
        }
        System.out.println();
        System.out.println("Нечётные:");
        for (k = 0; k < 15; k++) {
            System.out.print(nechet[k] + " ");
        }
    }

    public void outputStart()
    {
        System.out.println("Начало отсчета числового ряда: " + this.or);
        System.out.println("Числовой ряд:");
        for (i = 0;i<size; i++)
        {
            System.out.print(mas.get(i)+" ");
        }
        System.out.println();
    }

    public void arrCreate()
    {
            System.out.print("Введите размер массива: ");
            size = UserMenu.readOption();

            System.out.print("Введите элементы ряда через пробел: ");
            for (i = 0; i < size; i++)
            {
                mas.add(i, UserMenu.readOption());
            }
            System.out.println("Вводите только целые числа.");
    }

    public void arrRandom()
    {
        size = rand.nextInt(12)+3;
            for (i = 0; i < size; i++)
            {
                mas.add(i, rand.nextInt(50)-25);
            }
        System.out.println("Массив успешно сгенерирован");
    }

    public void outputArr()
    {
        System.out.println("Размер массива: " + size );
        System.out.print("Массив: ");
        for (i = 0; i < size; i++)
        {
            System.out.print(mas.get(i) + " ");
        }
        System.out.println();
    }

    public void inputCondition()
    {
        System.out.print ("Введите условие(без пробелов): ");
        usl = scan.nextLine();
    }

    public void outputCondition()
    {
        System.out.println("Условие: " + usl);
    }

    public void doSortByCondition()
    {
        char[] uslToArray = usl.toCharArray();
        int[] sortArr = new int[size];
        int num = 0;
        int count = uslToArray.length-1;
        for (i = 1; i<uslToArray.length; i++)
        {
            count--;
            num += pow(10, count) * (uslToArray[i]-'0');
        }


            switch (uslToArray[0])
            {
                case '<':
                    for (i = 0; i<size;i++)
                    {
                        if (mas.get(i) < num)
                        {
                            sortArr[k] = mas.get(i);
                            //System.out.print(sortArr[k] + " ");
                            k++;
                        }
                    }
                    break;
                case '>':
                    for (i = 0; i<size;i++)
                    {
                        if (mas.get(i) > num)
                        {
                            sortArr[k] = mas.get(i);
                            //System.out.print(sortArr[k] + " ");
                            k++;
                        }
                    }
                    break;
                case '=':
                    for (i = 0; i<size;i++)
                    {
                        if (mas.get(i) == num)
                        {
                            sortArr[k] = mas.get(i);
                            //System.out.print(sortArr[k] + " ");
                            k++;
                        }
                    }
                    break;
                default:
                    System.out.println("Введенo неверное условие или условие отсутсвует.");
                    return;
            }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        mas.clear();
        size = k;
        for (i=0;i<k;i++)
        {
            mas.add(i,sortArr[i]);
        }
        for (i=0;i<k;i++)
        {
            System.out.print(sortArr[i] + " ");
        }
        System.out.println();
    }
}
