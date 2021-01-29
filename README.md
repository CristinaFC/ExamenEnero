# Poker
Cree una clase mano de poker que tenga un método para compararse con otra mano de poker:

Una mano de poker tiene un constructor que acepta una cadena que contiene 5 cartas:
```java
PokerHand  pokerHand = new PokerHand ("KS 2H 5C JD TD");
```
Las características de la cadena de inicialización son:
- El espacio se utiliza como separador de cartas.
- Cada carta consta de 2 caracteres, donde
- El primer carácter es el valor de la carta: 2, 3, 4, 5, 6, 7, 8, 9, T (en), J (ack), Q (ueen), K (ing), A (ce)
- El segundo carácter representa el palo: S(pades), H(earts), D(iamonds), C(lubs)

El resultado de la comparación de tu mano de poker puede ser una de estas 3 opciones:

```java
Result hand.compareWith(PokerHand hand);

public enum Result {
     Win,
     Loss,
     Tie
}
```