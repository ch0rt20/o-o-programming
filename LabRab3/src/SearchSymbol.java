public class SearchSymbol
{
    private String stroka;
    private int max = 0;

    //Конструкторы

    public SearchSymbol(String s)
    {
        stroka = s;
    }

    public SearchSymbol()
    {
        stroka = "Somebody once told me...";
    }

    //Методы

    public String getSentence()
    {
        return this.stroka;
    }

    public void inputSentence()
    {
        this.stroka = UserMenu.readSentence();
    }

    public void regularSentence()
    {
        this.stroka = "Somebody once told me...";
    }

    public void outputSentence()
    {
        System.out.println(stroka);
    }

    public void search()
    {
        int[] arr = new int[255];
        for (int i = 0; i < stroka.length(); i++)
        {
            arr[stroka.charAt(i)]++;
        }
        for (int i = 97; i < 123; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.print("Самый частый(ые) символ(ы): ");
        for (int i = 97; i < 123; i++)
        //System.out.println((char) i + " встречается " + arr[i] + " раз");
        {
            if (arr[i] == max)
            {
                System.out.print((char)i + " ");
            }
        }
        System.out.println(". Встречается(ются) "+max+" раз(a).");
    }
}