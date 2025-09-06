package com.valeriy;

public class WebSite {
    String url;
    int viewCount;
    boolean isFunnySite;

    //String[] menuItems = new String[3];{"login", "logout", "profile"};
    String[] menuItems = {"login", "logout", "profile"};

//    String menuItem0 = "login"; второй вариант написания
//    String menuItem1 = "logout";
//    String menuItem2 = "profile";

    //public WebSite(){ //Данная конструкция уже была сгенерирована Java по умолчанию, но мы её не видим
    //    this.url = null;
    //    this.viewCount = 0;
    //    this.isFunnySite = false;
    //}

    public WebSite(){
    }

    public WebSite(String url, boolean isFunnySite) {
        this.url = url;
        this.isFunnySite = isFunnySite;
    }

//    void setViewCount(int count){
//        this.viewCount = count;
//    }

    void setViewCount(int count){
        if (viewCount>0){ // == сравнение, безопасно использовать для сравнения примитивных данных // !(...>0) - логическое отрицание / && - аперсанд (означает И) || - или
            System.out.println("denied!"); //в Java можно не писать фигурные скобки если if else состоит из одной строки
        } else {
            this.viewCount = count;
        }
    }

    boolean isThisSiteIsFunny(){
        return isFunnySite; //после ключевого слова return выполнение метода заканчивается
    }

    void open() { //void означает, что метод ничего наружу не возвращает
        System.out.println("Opened!");
        if (isFunnySite){
                System.out.println("xD");
        }
        else {
            System.out.println(":(");
        }
    }

    void printItems(){
        for (int i=0; i < menuItems.length; i++){
            System.out.println(menuItems[i]);
            menuItems[i] = "smth"; //можем присвоить значение индексу
        }

//        int i = 0;
//        while (i<menuItems.length){
//            System.out.println(menuItems[i]);
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println(menuItems[i]);
//            menuItems[i] = "smth";
//            i++;
//        } while (i<menuItems.length);

//        for (String menuItem : menuItems) {
//            System.out.println(menuItem);
//        }
    }
}
