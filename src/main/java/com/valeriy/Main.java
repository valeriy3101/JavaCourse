package com.valeriy;

public class Main {
    // Используемые типы данных. Что значит хранить данные, зная их тип? Это значит в Java создать переменную с типом этих данных
    //примитивные типы данных
    char aChar = 'c'; //можно хранить символы(буквы) можно считать целочисленными типом. В одинарных кавычках.
    byte aByte = 1; // 8 бит для каждого типа данных в памяти выделен свой размер
    short aShort = 2; //16 бит
    int anInt = 3; // 32 бита чаще всего его используют
    long aLong = 5; // 64 бита. Тип данных - название переменной - оператор присвоения - значение
    Integer anInt2 = 3; // обёртка типа данных
    Short aShort2 = 4;

    // с плавающей точкой
    float aFloat = 0.12f;
    double aDouble = 0.13; //обычно данный тип используют, но АРИФМЕТИКА с числами с плавающей точкой неточная

    boolean aBoolean = true; //логический тип данных - true/false

    //Объектно-ссылочный тип данных
    String aString = "Hello"; // Строка. Не примитивный тип данных, а объектный тип
    // = - оператор присвоения.

    //Для примитивных типов данных значения есть по умолчанию. Для целых чисел = 0, дробных 0.0, логический - false, char - символ 0
    //Для объектных - null

    public static void main(String[] args) {
      WebSite newsSite = new WebSite("ya.ru/news", false); // new - ключевое слово, с которого начинается создание всех объектов в Java
        //String можно создавать без слова new
        // () - круглые скобочки - вызов конструктора по умолчанию без аргументов
        WebSite ytSite = new WebSite("youtube.com", true); //мы можем создавать объекты сразу с каким-то состоянием


        newsSite.setViewCount(5); //метод вызывается из объекта
        newsSite.open();
        ytSite.open();
        newsSite.printItems();

//        char a = 'a', b, c = 'c';
//        b = (char) ((a + c) / 2); // Можно складывать, вычитать, делить и умножать
//        // Но из-за особенностей арифметики Java результат приходится приводить к типу char явно
//        System.out.println(b); // Выведет символ 'b'

        String a = "Hello", b = "World";
        System.out.println(a + " " + b); // Здесь + означает объединение (конкатенацию) строк
        // Пробел не вставляется автоматически

//        String foo = "a string";
//        String bar = "a string"; // bar будет указывать на тот же объект что и foo
//        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор
//        System.out.println("foo == bar ? " + (foo == bar)); // == сравнивает ссылки на объекты
//        System.out.println("foo равен bar ? " + (foo.equals(bar))); // Метод equals служит для проверки двух объектов на равенство
//        System.out.println("foo == baz ? " + (foo == baz));
//        System.out.println("foo равен baz ? " + (foo.equals(baz)));
        
//        boolean isSiteFunny = newsSite.isThisSiteIsFunny();
//        System.out.println(isSiteFunny);
//        System.out.println(newsSite.viewCount);
//        System.out.println(ytSite.viewCount) ;

//        }
    }
}
