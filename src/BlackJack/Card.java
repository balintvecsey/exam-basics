package BlackJack;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class Card {
  String color, value, card;

  public Card(String value, String color){
    this.color = color;
    this.value = value;
    this.card = value + color;
  }
}
