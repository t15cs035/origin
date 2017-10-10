/**
 * ばば抜きの手札を表すクラス。
 */

import java.util.ArrayList;

public class Hand {

	/** プロパティ */
	/** 手札にあるカードを保持するためのリスト */
    private ArrayList hand_ = new ArrayList();

    /** メソッド */
    /**
     * カードを加える。
     * 
     * @param card 加えるカード
     */
    public void addCard(Card card)
    {
    }

    /**
     * カードを引く。
     * 
     * @return 引いたカード
     */
    public Card pickCard()
    {
    }

    /**
     * 同じ数のカードを探す。
     * 同じ数のカードがない場合は null を返します。
     * 
     * @return 同じ数のカード
     */
    public Card[] findSameNumberCard()
    {
    }

    /**
     * 枚数を数える。
     * 
     * @return 手札にあるカードの枚数
     */
    public int getNumberOfCards()
    {
    }

    /**
     * シャッフルする。
     */
    public void shuffle()
    {
    }

}
