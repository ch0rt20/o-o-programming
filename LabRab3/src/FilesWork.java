import java.io.*;

public class FilesWork
{
    public static void arrToFile (int[] values,String taskFile)
    {
        try(DataOutputStream dOs = new DataOutputStream(new FileOutputStream(taskFile)))
        {
            dOs.writeInt(values.length);
            for(int i = 0;i< values.length;i++)
            {
                dOs.writeInt(values[i]);
            }
            System.out.println("Массив успешно сохранен в " + taskFile + ".");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден, проверьте наличие файла.");
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи.");
        }
    }

    public static void sentenceToFile (String taskFile)
    {
        try(FileWriter writer = new FileWriter("SentenceInputData.txt",false))
        {
            String text = " ";
            SearchSymbol taskb = new SearchSymbol(text);
            text = taskb.getSentence();
            writer.write(text);
            System.out.println("Текст успешно сохранен в " + taskFile + ".");
        }
        catch (IOException e)
        {
            System.out.println("Неверное имя файла.");
        }
    }

    public static void sizeToFile (int size,String taskFile)
    {
        try(DataOutputStream dOs = new DataOutputStream(new FileOutputStream(taskFile)))
        {
            dOs.writeInt(size);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден.");
        }
        catch (IOException e)
        {
            System.out.println();
        }
    }

    public static void startToFile (int or,String taskFile)
    {
        try(DataOutputStream dOs = new DataOutputStream(new FileOutputStream(taskFile)))
        {
            dOs.writeInt(or);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл отсутствует.");
        }
        catch (IOException e)
        {
            System.out.println("Неверное число в файле");
        }
        System.out.println("Начала отсчета числового ряда успешно загружено в " + taskFile + ".");
        System.out.println();
    }

    public static int fileToStart(String taskFile)
    {
        int or = 0;
        try(DataInputStream dIs = new DataInputStream(new FileInputStream(taskFile)))
        {
            or = dIs.readInt();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Такого файла нет.");
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи.");
        }
        System.out.println("Начало чилового ряда успешно загружено из "+taskFile + ".");
        return or;
    }

    public static int[] fileToArr (String taskFile)
    {
        int[] arrInTime = null;
        try(DataInputStream dIs = new DataInputStream(new FileInputStream(taskFile)))
        {
            int size = dIs.readInt();
            arrInTime= new int[size];
            for(int i = 0;i < size;i++)
            {
                arrInTime[i] = dIs.readInt();
            }
            System.out.println("Массив успешно загружен из " + taskFile + ".");
            System.out.println();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Такого файла нет.");
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи.");
        }
        return arrInTime;
    }

    public static int fileToSize (String taskFile)
    {
        int size = 0;
        try(DataInputStream dIs = new DataInputStream(new FileInputStream(taskFile)))
        {
            size = dIs.readInt();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Такого файла нет.");
        }
        catch (IOException e)
        {
            System.out.println("Ошибка записи.");
        }
        return size;
    }
}
