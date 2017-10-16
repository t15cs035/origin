/**
 * テーブルを表すクラス。
 */

import java.util.ArrayList;

public class Table {

	/** プロパティ */
	/** 捨てられたカードを保持しておくためのリスト */
    private ArrayList disposedCards_ = new ArrayList();

    /** メソッド */
    /**
     * カードを捨てる。
     * 
     * @param card 捨てるカードの配列
     */
    public void disposeCard(Card card[])
    {
    	for (int index=0; index < card.length; index++ )
    	{
    		// 捨てられたカードを表示する
    		System.out.print(card[index] + " ");
    	}
    	System.out.println("を捨てました");
    	
    	// 捨てられたカードは Table クラスの disposedCards_ に追加
    	disposedCards_.***;
    }
}
