public class lesson2 {


   public float Task1(Integer a, Integer b, Integer c) {
        if (a % 2 == 0) //Если а – четное посчитать а*б/с,
        {
            return a * b / c;
        } else if ((a + c) % 2 == 0 || (b + c) % 2 == 0)//если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
        {
            return (float) Math.pow(a, c);
        }
        return a + b - c;//иначе посчитать  а+б-с
    }

    public int Task2(int x, int y, int z) //Определить какой области принадлежит точка с координатами (х,у,z)
    {
        if (x > 0 && y > 0) return 1;

        else if (x < 0 && y > 0) return 2;

        else if (x < 0 && y < 0) return 3;

        else if (x > 0 && y < 0) return 4;

        else
            return 0;


    }

    public int Task3(int n)//Вычислить факториал числа n. n! = 1*2*…*n-1*n;
    {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public int Task4(Integer a)//Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321
    {

        StringBuffer buffer = new StringBuffer(a.toString());
        String str = buffer.reverse().toString();
        return Integer.parseInt(str);
    }

    public int[] Task5(int[] arr)//Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
    {
        int hlen = arr.length / 2;
        int cpos = hlen + arr.length % 2;
        for (int i = 0; i < hlen; i++) {
            int t = arr[i];
            arr[i] = arr[cpos + i];
            arr[cpos + i] = t;
        }
        return arr;
    }

    public int[] Task6(int[] arr)//Отсортировать массив (пузырьком (Bubble)
    {
 /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public String Task7(Integer a)//целого числа в строку
    {
        return a.toString();
    }

   public String Task8(Float a)//вещественного числа в строку
    {
        return a.toString();
    }

    public int Task9(String s)//строки в целое число
    {
        if (isNumber(s)) {
            return Integer.parseInt(s);
        }
        return -1;
    }

    public Float Task10(String s)//строки в вещественное число
    {
        if (isNumber(s)) {
            return Float.parseFloat(s);
        }
        return (float) -1.0;
    }

   public int Task11(String s)//Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова
    {
        String[] splitArray = s.split("([^а-яА-Яa-zA-Z']+)'*\\1*");
        int minLength = Integer.MAX_VALUE;
        for (String word : splitArray) {
            int wordLength = word.length();
            if (wordLength < minLength) {
                minLength = wordLength;
            }
        }
        return minLength;
    }

    public int Task12(String s)//Подсчитать количество слов во введенной пользователем строке
    {
        String[] splitArray = s.split("([^а-яА-Яa-zA-Z']+)'*\\1*");

        return splitArray.length;
    }

    public String Task13(String s)//В заданной строке удалить последнее слово
    {
        String[] splitArray = s.split("([^а-яА-Яa-zA-Z']+)'*\\1*");
        splitArray[splitArray.length - 1] = "";
        return "";// Arrays.toString(splitArray);
    }

    public boolean isNumber(String str) {
        if (str == null || str=="") return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
