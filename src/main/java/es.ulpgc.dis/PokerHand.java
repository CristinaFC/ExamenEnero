package es.ulpgc.dis;


import java.util.ArrayList;

public class PokerHand {

    private final String cards;
    ArrayList<Card>mycards = new ArrayList<>();

    public PokerHand(String cards) {
        this.cards = cards;
    }

    public void addCards(){
        for (String s: cards.split(" ")) {
            this.mycards.add(new Card(s.split("")[0], s.split("")[1]));
        }
    }

    public ArrayList<Card> getCards() {
        return mycards;
    }


    public boolean areEquals(PokerHand hand){
        if(cards.equals(hand.cards)) return true;
        return false;
    }

    public boolean isSameSuit(){
        String [] suits = {"S","H","D","C"};
        boolean res = false;
        for (String s: suits) {
            for (Card card:mycards){
                res = true;
                if (!card.getSuit().equals(s)) {
                    res = false;
                    break;
                }
            }
        }
        return res;

    }

    public Result compareWith(PokerHand hand){
        if(areEquals(hand)) return Result.Tie;
        if(this.isFlush() && this.isSameSuit()) return Result.Win;
        return Result.Loss;
    }

    private boolean isFlush() {
        String [] values = {"A","K","Q","J","10"};
        int i= -1;
        for (Card card: mycards) {
            if(!card.getValue().equals(values[i++])) return false;
        }
        return true;
    }

    public enum Result{
        Win,Loss,Tie;
    }
}
