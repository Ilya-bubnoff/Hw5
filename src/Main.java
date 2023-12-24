
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int clientOS = 0;
int clientDiviceYear = 2014;
if(clientOS==0&&clientDiviceYear>2015){
    System.out.println("Установите версию приложения для iOS по ссылке");
}else if(clientOS==0&&clientDiviceYear<=2015) {
    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
}else if(clientOS==1&&clientDiviceYear>2015){
    System.out.println("Установите версию приложения для Android по ссылке");
} else if (clientOS==1&&clientDiviceYear<=2015){
    System.out.println("Установите облегченную версию приложения для Android по ссылке");
}
int year = 2021;
if(year>1584&& ((year%400==0)||(year%4==0&&year%100!=0))){
    System.out.println(year+" год является високосным");
}else{
    System.out.println(year+" год не является високосным");
    }
int deliveryDistance = 95;
if (deliveryDistance<=20){
    System.out.println("Потребуется 1 день доставки");
}else if(deliveryDistance>20&&deliveryDistance<=60) {
    System.out.println("Потребуется 2 дня доставки");
}else if(deliveryDistance>60&&deliveryDistance<=100){
    System.out.println("Потребуется 3 дня доставки");
}else{
    System.out.println("Доставки нет");
}
int monthNumber = 12;
switch(monthNumber) {
    case 12:
    case 1:
    case 2:
        System.out.println("Зимний месяц");
   break;
    case 3:
    case 4:
    case 5:
        System.out.println("Весенний месяц");
   break;
    case 6:
    case 7:
    case 8:
        System.out.println("Летний месяц");
   break;
    case 9:
    case 10:
    case 11:
        System.out.println("Осенний месяц");
    break;
    default:
        System.out.println("Такого месяца не существует");
}
}
}