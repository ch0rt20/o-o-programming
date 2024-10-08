import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.HttpRequest;
import java.util.ArrayList;

public class GuiForm extends JFrame
{
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JButton TakeInsects;
    private JButton TakeMeat;
    private JButton TakeGrass;
    private JTextField FoodCondition;
    private JButton Feed1Button;
    private JButton Feed6Button;
    private JButton Feed5Button;
    private JButton Feed4Button;
    private JButton Feed3Button;
    private JButton Feed2Button;
    private JTextField FeedCondition;
    private JTextField Animal6;
    private JTextField Animal5;
    private JTextField Animal4;
    private JTextField Animal3;
    private JTextField Animal2;
    private JTextField Animal1;
    private JTextField CheckCondition;
    String foodWeHave = "";
    public GuiForm()
    {
        super("Лаба №5");
        String[] names = new String[]{"Апостол","Покрышка","Султан","Гена","Бегун","Маша"};
        String[] species = new String[]{"Зебра","Слон","Лев","Крокодил","Еж","Медведь"};
        String[] types = new String[]{"Травоядное","Травоядное","Хищник","Хищник","Всеядное","Всеядное"};
        this.add(panel1);
        Animal1.setText("Тип: "+types[0]+", Вид: "+species[0]+", Имя: "+names[0]+", Голод: да");
        Animal2.setText("Тип: "+types[1]+", Вид: "+species[1]+", Имя: "+names[1]+", Голод: да");
        Animal3.setText("Тип: "+types[2]+", Вид: "+species[2]+", Имя: "+names[2]+", Голод: да");
        Animal4.setText("Тип: "+types[3]+", Вид: "+species[3]+", Имя: "+names[3]+", Голод: да");
        Animal5.setText("Тип: "+types[4]+", Вид: "+species[4]+", Имя: "+names[4]+", Голод: да");
        Animal6.setText("Тип: "+types[5]+", Вид: "+species[5]+", Имя: "+names[5]+", Голод: да");
        TakeGrass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodCondition.setText("Вы выбрали траву");
                foodWeHave = "Трава";
            }
        });
        TakeMeat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodCondition.setText("Вы выбрали мясо");
                foodWeHave = "Мясо";
            }
        });
        TakeInsects.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodCondition.setText("Вы выбрали насекомых");
                foodWeHave = "Насекомые";
            }
        });

        Feed1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckCondition.setText("");
                FeedCondition.setText("");
                if (foodWeHave=="")
                {
                    CheckCondition.setText("Вы не выбрали еду");
                }
                else if (Animal1.getText().equals("Тип: "+types[0]+", Вид: "+species[0]+", Имя: "+names[0]+", Голод: да"))
                {
                    CheckCondition.setText(species[0]+" принюхивается");
                    if (foodWeHave.equals("Трава"))
                    {
                        FeedCondition.setText(species[0]+" успешно поел");
                        Animal1.setText("Тип: "+types[0]+", Вид: "+species[0]+", Имя: "+names[0]+", Голод: нет");
                    }
                    else
                        CheckCondition.setText(species[0]+" не ест подобный тип еды");
                }
                else
                    CheckCondition.setText(species[0]+" больше не хочет есть");
            }
        });
        Feed2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckCondition.setText("");
                FeedCondition.setText("");
                if (foodWeHave=="")
                {
                    CheckCondition.setText("Вы не выбрали еду");
                }
                else if (Animal2.getText().equals("Тип: "+types[1]+", Вид: "+species[1]+", Имя: "+names[1]+", Голод: да"))
                {
                    CheckCondition.setText(species[1]+" принюхивается");
                    if (foodWeHave.equals("Трава"))
                    {
                        FeedCondition.setText(species[1]+" успешно поел");
                        Animal2.setText("Тип: "+types[1]+", Вид: "+species[1]+", Имя: "+names[1]+", Голод: нет");
                    }
                    else
                        CheckCondition.setText(species[1]+" не ест подобный тип еды");
                }
                else
                    CheckCondition.setText(species[0]+" больше не хочет есть");
            }
        });
        Feed3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckCondition.setText("");
                FeedCondition.setText("");
                if (foodWeHave=="")
                {
                    CheckCondition.setText("Вы не выбрали еду");
                }
                else if (Animal3.getText().equals("Тип: "+types[2]+", Вид: "+species[2]+", Имя: "+names[2]+", Голод: да"))
                {
                    CheckCondition.setText(species[2]+" принюхивается");
                    if (foodWeHave.equals("Мясо"))
                    {
                        FeedCondition.setText(species[2]+" успешно поел");
                        Animal3.setText("Тип: "+types[2]+", Вид: "+species[2]+", Имя: "+names[2]+", Голод: нет");
                    }
                    else
                        CheckCondition.setText(species[2]+" не ест подобный тип еды");
                }
                else
                    CheckCondition.setText(species[2]+" больше не хочет есть");
            }
        });
        Feed4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckCondition.setText("");
                FeedCondition.setText("");
                if (foodWeHave=="")
                {
                    CheckCondition.setText("Вы не выбрали еду");
                }
                else if (Animal4.getText().equals("Тип: "+types[3]+", Вид: "+species[3]+", Имя: "+names[3]+", Голод: да"))
                {
                    CheckCondition.setText(species[3]+" принюхивается");
                    if (foodWeHave.equals("Мясо"))
                    {
                        FeedCondition.setText(species[3]+" успешно поел");
                        Animal4.setText("Тип: "+types[3]+", Вид: "+species[3]+", Имя: "+names[3]+", Голод: нет");
                    }
                    else
                        CheckCondition.setText(species[3]+" не ест подобный тип еды");
                }
                else
                    CheckCondition.setText(species[3]+" больше не хочет есть");
            }
        });
        Feed5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckCondition.setText("");
                FeedCondition.setText("");
                if (foodWeHave=="")
                {
                    CheckCondition.setText("Вы не выбрали еду");
                }
                else if (Animal5.getText().equals("Тип: "+types[4]+", Вид: "+species[4]+", Имя: "+names[4]+", Голод: да"))
                {
                    CheckCondition.setText(species[4]+" принюхивается");
                    FeedCondition.setText(species[4]+" успешно поел");
                    Animal5.setText("Тип: "+types[4]+", Вид: "+species[4]+", Имя: "+names[4]+", Голод: нет");
                }
                else
                    CheckCondition.setText(species[4]+" больше не хочет есть");

            }
        });
        Feed6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckCondition.setText("");
                FeedCondition.setText("");
                if (foodWeHave=="")
                {
                    CheckCondition.setText("Вы не выбрали еду");
                }
                else if (Animal6.getText().equals("Тип: "+types[5]+", Вид: "+species[5]+", Имя: "+names[5]+", Голод: да"))
                {
                    CheckCondition.setText(species[5]+" принюхивается");
                    FeedCondition.setText(species[5]+" успешно поел");
                    Animal6.setText("Тип: "+types[5]+", Вид: "+species[5]+", Имя: "+names[5]+", Голод: нет");
                }
                else
                    CheckCondition.setText(species[5]+" больше не хочет есть");

            }
        });
    }
}
