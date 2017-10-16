/**
 * ばば抜きの手札を表すクラス。
 */

import java.util.ArrayList;

public class Hand {

	/** プロパティ */
	/** 手札にあるカードを保持するためのリスト */
    private ArrayList<Card> hand_ = new ArrayList<Card>();

    /** メソッド */
    /**
     * カードを加える。
     * 
     * @param card 加えるカード
     */
    public void addCard(Card card)
    {
    	// カードをリストの最後に追加する
    	// ArrayList クラスの add メソッドを使う
    	hand_.add(card);
    }

    /**
     * カードを引く。
     * 
     * @return 引いたカード
     */
    public Card pickCard()
    {
    	Card card = ****; // hand_ の先頭からカードを取り出す
    	return card;
    }

    /**
     * 同じ数のカードを探す。
     * 同じ数のカードがない場合は null を返します。
     * 
     * @return 同じ数のカード
     */
    public Card[] findSameNumberCard()
    {
        int numberOfCards = hand_.size();  // 手札の数
        Card[] sameCards = null;           // 同じ数のカード ← 返り値として使う

        // 手札にカードが1枚もない場合は何もしない
        if (numberOfCards > 0)
        {
            // 最後に追加されたカードを取得する
            int lastIndex = numberOfCards - 1;
            Card lastAddedCard = (Card) hand_.get(lastIndex);

            // 最後に追加されたカードの数字を取得する
            int lastAddedCardNum = lastAddedCard.getNumber();

            // 先頭のカードから順に lastAddedCardNum と同じ番号のカードを探す
            for (int index = 0; index < lastIndex; index++)
            {
                Card card = (Card) hand_.get(index);
                if (card.getNumber() == lastAddedCardNum)
                {
                    // 最後に追加されたカードと同じカードが見つかった場合
                    // 見つかった組み合わせをsameCardsに格納し、ループを抜ける
                    sameCards = new Card[2];
                    sameCards[0] = (Card) hand_.remove(lastIndex);
                    sameCards[1] = (Card) hand_.remove(index);

                    break;
                }

                // 同じ数の組み合わせが見つからなかった場合、
                // sameCardsはnullのままとなる。
            }
        }

        return sameCards;
    }

    /**
     * 枚数を数える。
     * 
     * @return 手札にあるカードの枚数
     */
    public int getNumberOfCards()
    {
    	return hand_.size();
    }

    /**
     * シャッフルする。
     */
    public void shuffle()
    {
    	// 手札の枚数を取得
    	int number = hand_.size();
    	
    	// カードを抜き出す位置
    	int pos;
    	
    	// ランダムな位置のカードを抜き取って、最後に加える動作を n 回繰り返す
    	for (int count = 0; count < n; count++)
    	{
    		pos = (int)(Math.random() * number); // pos は 0 から number-1 までの数
    		// pos の位置からカードを抜いて
    		// そのカードを最後に加える
    	}
    }

    /**
     * 手札を画面に出力する（追加）
     */
    public String toString()
    {
    	// 先頭のカードから末尾のカードまでの toString 出力を " "（スペース）で区切った文字列を返す
    	StringBuffer string = new StringBuffer();
    	
    	int size = hand_.size();
    	if (size > 0)
    	{
    		for (int index = 0; index < size; index++)
    		{
    			Card card = (Card)hand_.get(index);
    			string.append(card);
    			string.append(" ");
    		}
    	}
    	return string.toString();
    }
}
