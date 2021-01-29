package es.ulpgc.dis;

import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerHand_ {

    @Test
    public void should_return_Tie_when_one_hand_is_equal_than_the_other(){
        PokerHand hand = new PokerHand("KS 2H 5C JD TD");
        assertThat(hand.compareWith(new PokerHand("KS 2H 5C JD TD"))).isEqualTo(PokerHand.Result.Tie);
    }

    @Test
    public void should_return_Win_when_one_han_is_bigger_thar_the_other(){
        PokerHand hand = new PokerHand("AH KH QH JH 10H");
        assertThat(hand.compareWith(new PokerHand("AS 2C 2H 4H 10H"))).isEqualTo(PokerHand.Result.Win);
    }

    @Test
    public void should_return_Loss_when_one_han_is_smaller_thar_the_other(){
        PokerHand hand = new PokerHand("AS KC QH JH 10H");
        assertThat(hand.compareWith(new PokerHand("AH KH QH JH 10H"))).isEqualTo(PokerHand.Result.Loss);
    }

}
