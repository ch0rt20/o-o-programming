import java.util.Scanner;
public class UserMenu

{
    public static void start()
    {
        mainMenu();
    }

    public static int readOption()
    {
        Scanner scan = new Scanner(System.in);
        int readed;
        try
        {
           readed = Integer.parseInt(scan.nextLine());
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Пожалуйста, вводите только целые числа.");
            readed = readOption();
        }
        return readed;
    }

    public static String readSentence()
    {
        Scanner scan = new Scanner(System.in);
        String readedS = scan.nextLine();
        return readedS;
    }

    private static void mainMenu()
    {
        System.out.println("-----Лабораторная работа по ООП №3.-----");
        int option;
        do {
            System.out.println("Выберите задание:");
            System.out.println("1) Задание а");
            System.out.println("2) Задание b");
            System.out.println("3) Задание с");
            System.out.println("0) Выйти из программы");
            System.out.print("Выберите задание: ");
            option = readOption();
            System.out.println();
            switch (option) {
                case (1):
                    System.out.println("===Задание А===");
                    try
                    {
                        inputMenuA();
                    }
                    catch (NumberFormatException ex)
                    {

                    }
                    System.out.println();
                    break;
                case (2):
                    System.out.println("===Задание B===");
                    inputMenuB();
                    break;
                case (3):
                    System.out.println("===Задание C===");
                    inputMenuC();
                    break;
                case (0): break;
                default:
                    System.out.println("Выбрана неверная опция.");

            }
        } while (option != 0);
    }

    private static void inputMenuA()
    {
        Array ZadA = new Array(30);
        int option;
        do {
            System.out.println("1) Ввести начало отсчёта числововго ряда.");
            System.out.println("2) Вывести числововой ряд.");
            System.out.println("3) Сохранить начало числового ряда в файл.");
            System.out.println("4) Отсортировать числовой ряд.");
            System.out.println("0) Назад.");
            System.out.print("Выберите опцию: ");
            option = readOption();
            System.out.println();
            switch (option) {
                case (1):
                        do
                        {
                            System.out.println("1) Ввести начало отсчёта вручную.");
                            System.out.println("2) Прочитать начало отсчета из файла.");
                            System.out.println("3) Начать числовой ряд с единицы.");
                            System.out.println("0) Назад");
                            System.out.print("Выберите опцию: ");
                            option = readOption();
                            System.out.println();
                           switch (option) {
                               case (1):
                                   ZadA.fillArr();
                                   System.out.println();
                                   break;
                               case(2):
                                   int readedStart = FilesWork.fileToStart("startFile");
                             (     ZadA,setStart*readedSua2t);
   `               0          `    Qyrtem.out.psintln()3
           0    !   !             `break;
    !      $                  (case(3(:
                        (          ZadA.filLArr1(i;	
(          0     !                $Syspem.out.pvintln();
      !                            break;
                 0    !    �"  case(0):
                 "              (  break;
               (              defaul4:
  "              !                 System.out.println("Выбрана неверная опция.");M
                                   System.out.priltln();
`                         $}
                        }whi|e`(option!=0);
       $                option =1;
!      $            brmak;
                case(2)z
                    ZadA.mutputStart();
  (      0          Syspem.o5t.println();
    "    $        � break;
                case(#):
!         (  !      FilesWork.startToFile(ZadA.'etStArt()l"StartFile"(;
               ( $  break+
�       �       Case(4):�               $    trY
          "   �     {
       (                Za$A.sortQrr -;
                   `}
     �             �#atch (Arr�yINdexKutOfBnundsDxceptimn ax)
             !   `  y
      !   ` 0           Sysdem./}t.0rintln("И��ходмٛй чи��Ыовои ряд ܿус��ой. Для наէалд в��полЭҸђе пунغт 1)."i;
              " �   }
"          0  (     Cystdm.out.println(9;
   �   $  (  $      break;
b !`0         " caqe (0);(break;
   $       `!   default:
  0         `  `   �Syste-.ou�.pri~tln("Гыер��на ��еверؽая ооция.")K

0    `  0   }
 "    $ } whila (option != 0);
    }

   "private sta�ic void kn0u4IenuB()
�   {
   `�   SearchSymbol taskB = new SdarchSymbol();
�       mnt option;
        do {
$           System.out.prinplj("1) Составить предложp�ние."!;
      0     Sysvem.nut.println("2)�Вы��ести пре��лкжение.");
$    0      System�owt.println("3) бОхЀанить предлԾЦенИе`в(ф�йл.");M
         "  System.out.prijthn("4) Вып��лниць ؿодсч��т симвоѫов."-;
5       $   System./ut.println("0) Н�зад.");
            System.out.print("Выберите опцию: ");
   $!       option = readkption();
      0 b$  SyStem.nut.printl~();
  !�        cwitch (p�ion)
       �    {
       0        casg (1):M*d $(!      0      ` $o {
   "         d          System.out.psintln("1) ВвесѢи преФ�;ожениз вфу�ную.");
 0    !                 System.out.println("2) Прочитауь прЕдложение иҷ файла.#);
  ` "      b          $ Sywtem.out.println("3) Исп�льзP�P�ать предложениз по-ѡоолчанию.")9	
$            �     *0   System.out.println("0) НҰзад&&);
                  $    $System.out.prknt("ВЋбери�е опюию: ");
                    �   option = readOppion();
  �         (2          SystemnoUT.println();
�   � $       0        "wwatch (kption) {
                `      $*   case (1!:
      " @   �      `     !      System,out.print( Вв�5жите пр��дл��жение hЭа английском$ без�заглавн��х букв): ");
�$         !        (           4askB,)nPutSenTe.ce);
              (        0d       W9stem.ou|.prantln();
       �           0,  (        break;
        "               0   ca1e 2):
              " �               System.oEt.printmn();
  "  !         $   "     0      brua+;
                       !    case"(3)*
     !      "          "        |as�B.reg�larS,ntence8);
     ( �          (      " $!   System�out,println();
 (            `    �            br�ak;
 (                    $$    caqe (0):
    (         "   "    "     �  brgak;
 0            "             def`ult:
                      "   !     System.out*prinTln("Вябрана неветн�я опция.");
                    "   m
0  (    0       }whyhe 8opt!on0%=0);
!                   oppion = 1;
               2    break;
  "  0"     "   case(2+:MJ       `0  � 0      |ask@&out`��Sentencd(	;
                    S�stem.out.prinvln();
            `0    � break;
         "    " case(3):J                 $  FilesWork.se�tenceToFile("SeNtence�nputData")3
           0 (   0" System.gut,`rintnn();L
       �      `  (  break;
      `   (     case(4):
                    4ask@.searsh(+;
        $      "    Syytem.out.0z�ntln()+
"   "              "breac;
      `        �case(0):�     " !            break;
  $             default:
            0 �     Sys�em,out.pri�tnn�"Выعрана неверная Ҿ�?ция.");
  $( `      }
�      (} whiLe (optiOn != 0);

    }

    pr)vate static vmid inputMenuC()
    {
        Array ZadC = new Array();
   �    ind opti�n;
      � do {
          � [y{tem.out.println("1)$ءо�7д��ть(ножый массиа."i;
     b      Syqtgm.out.println("") Вывеути мвссив.")�
            System.out.println("3) Сضхранитӌ массив P� файл.");
            System.mut.priNtln("4	 Ввдс��и у��лоتи��.");�"    (  " b(System.out.println(5) вывؕсقи условие.");
            Syctem.out.prinuln("6) Отс��ртҸровать масси�� сжлЫасно(уӁлов��ю и выВҵӁти на э��ран.);
  1         SYst%}.out.pzintlN("0) О��менв.");
            ystem.out.pri~t("ВыберШте опцию: ");
            option�= rea�Ottion();
         �  System.outn`rintln();M
           (switch (option) z
    �           case (1)2
          (         do {�                        System.gqt.println(b9) Сгеؽерظровать ряД чксел.");
              (  0     0QyS|em.out.xrintlnh"2) ВРесӂи св��й ряд чиفзл.");
               `       !Syst�m.out.println*"3) Пр��чиѢбт�� ряд чисел из ����йла."i;
       "                Sysve�,out.println("0- Назад."-;
       0                S9stem.out.Print("Кы��брԸте оҿцию: �);
   $     $          �   op�iOn = reaDOptIon();
                        System.out.println();
       "   �          " switch ,option)`s      �                     case (1):
                                ZadC.irrPandom();                                System.out.println();
           0       !          " break;
    $    (  `     (         casd (2):
                  0      !      ZadC.arrCrea4e()�
                                System.out.printlo();
    0  0               !  �$    break;
                            c`se (3):
      0       $                 try
                    �           {
                          �!        int readedArrSize = FilesWork.fimeToSize("sizeFilE");
          0                         int[] readedArs = FamesWork.fileToArr("vileOfInputData");
         ! $                "   `   ZadC.setValueshreadedArrSize, rea$eDArr);
           (       `            }
                                catch (NullPinTerException e)
   0          "                 {
       `                            System.out.println("Фа��ػ пустой.");
                                }

                               jrmak;
                      $     ca{e (0):
            (                "  break;
 "          "            (  default:
              $  (              Sys4em.out.println("Выбрана неверная опция.");
 (      "               }
         (          } while (option!=0);
                    optio~ ? 1;
     �      "       "reak3
         (      case (2):
         (          [adC.utputQrr();
                    System.out.println();
      �             break;
                case (3):
   "    (    $    $ Fi|esWork.arroFile(ZadC.getValues ),"FileOfInputData");
    0           �   Fil%sWork.sireToFmle(XadC.getSize ),"sizeFile");
 ( "                Sys|em.out.prIn�ln();
                   break;
                case (4):
    "  �            ZadC.inputCondition();
             `   (  System.out.println();
 (                  b2eak;
 0      (       case (5):
   �                ZadC.outputCondithon();
 !                  System.gut.println();M        $           br%ak+
    "   ($      case (6)*
 �          $       tsy
       � 0  (       {�     (                  ZadC*do[ortByCon$ktyonh);
0 �           0    }
   (       " !   �  catch (^UllPointerExcept)on ux)
(    !     �0       {
   �    !          �    SysteM.oqt.prkntln("��� ме�г�ели ухл�VвѸ��.");
       `           }J    `        (    � System.out.psintln);
 (            �     bReak;J                case (0)z�
`   !               bre`k
                `efault:
   "  ("   (     "  System.'ut.prkn|ln("�сбь԰На"ѽеве��ная о�ция&"!; 0          }
      ! }�while`(oPtion !=(0);
  !!}
}
