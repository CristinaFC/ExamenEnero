package es.ulpgc.dis;

import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static es.ulpgc.dis.PokerHand_.PokerHand.Result.Tie;
import static org.assertj.core.api.Assertions.assertThat;

public class PokerHand_ {

    @Test
    public void should_return_Tie_when_one_hand_is_equal_than_the_other(){
        PokerHand hand = new PokerHand("KS 2H 5C JD TD");
        assertThat(hand.compareWith(new es.ulpgc.dis.PokerHand("KS 2H 5C JD TD"))).isEqualTo(Tie);
    }

    static class PokerHand {
        private final String cards;

        public PokerHand(String cards) {
            this.cards = cards;
        }

        public String [] getCards() {
            return cards.split(" ");
        }

        public Result compareWith(es.ulpgc.dis.PokerHand hand){
            for (int i = 0; i < hand.getCards().length; i++) {
                if(!getCards()[i].equals(hand.getCards()[i])) return null;
            }
            return Tie;
        }

        public enum Result{
            Tie;
        }

    }


}
