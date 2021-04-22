package main.lesson2.java;

public class Switch {

  public static void main(String[] args) {
    trafficLight("Красный");trafficLight("Желтый");trafficLight("Зеленый");trafficLight("Синий");
    /*getTrafficLightResult("Красный");getTrafficLightResult("Желтый");getTrafficLightResult("Зеленый");getTrafficLightResult("Синий");*/
  }


  static  void trafficLight (String color){
   /* if ("Красный".equals(color) || "Желтый".equals(color)){
      System.out.println("Ехать нельзя");
    } else if ("Зеленый".equals(color)){
      System.out.println("ехать можно");
      else {
        System.out.println("Неизвестный цвет");*/

      switch (color){
        case "Красный":
        case "Желтый":
          System.out.println("нельзя");
          break;
          case "Зеленый":
          System.out.println("можно");
          break;
        default:
          System.out.println("Неизвестный цвет");

      }
    }

    /*static String getTrafficLightResult(String color){
      case "Красный":
      case "Желтый":
      return "нельзя";

      case "Зеленый":
      return "можно";

      default:
      return "Неизвестный цвет";

    }*/
  }

