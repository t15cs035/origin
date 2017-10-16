/**
 * ばば抜きのプレイヤークラス。
 */

public class Player {

	/** プロパティ */
    /** 名前 */
    private String name_;
    
    /** 自分の手札 */
    private Hand myHand_ = new Hand();
    
    /** （自分に関連する）進行役 */
    private Master master_;
    
    /** （自分に関連する）テーブル */
    private Table table_;
    
    /**
     * 引数付きコンストラクタ
     * 
     * @param name 名前
     * @param master 進行役
     * @param table テーブル
     */
    public Player(String name, Master master, Table table)
    {
    	this.name_ = name;
    	this.master_ = master;
    	this.table_ = table;
    }

    /** メソッド */
    /**
     * カードを自分の手札に加えて、同じ数のカードがあったら捨てる
     * 
     * @param card
     */
    private void dealCard(Card card)
    {
    	// カードを自分の手札に加える
    	myHand_.addCard(card);
    	
    	// 今加えたカードと同じカードを探す
    	Card[] sameCards = myHand_.findSameNumberCard();
    	
    	// 同じカードがあったらテーブルに捨てる
    	if (sameCards != null)
    	{
    		System.out.print(this + " : ");   // 誰が捨てたのかを画面に表示する。PlayerクラスのtoStringが呼ばれる
    		table_.disposeCard(sameCards);
    	}
    }
    
    /**
     * カードを配る → 受け取る。
     * 
     * @param card 受け取ったカード
     */
    public void receiveCard(Card card)
    {
    	dealCard(card);  // dealCardそのまま
    }

    /**
     * 順番を指名する。
     * 
     * @param nextPlayer 次のプレイヤー
     */
    public void play(Player nextPlayer)
    {
    	// 次のプレイヤーに手札を出してもらう
    	Hand nextHand = nextPlayer.showHand();
    	
    	// 手札から一枚引く
    	Card pickedCard = nextHand.pickCard();
    	
    	// 引いた結果を画面に表示
    	System.out.println(this + " : " + nextPlayer + "さんから " + pickedCard + " を引きました");
    	
    	// 引いたカードを自分の手札に加え、同じ数のカードがあったら捨てる → dealCard
    	******;
    	
    	// 手札が 0 になった？
    	if (****** == 0)
    	{
    		// 進行役にあがりを宣言する
    		master_.declareWin(this);
    	}
    	else
    	{
    		// 現在の手札を画面に表示
    		System.out.println(this + " : 残りの手札は " + myHand_ + "です");
    	}
    }

    /**
     * 手札を出す。
     * 
     * @return 自分の手札
     */
    public Hand showHand()
    {
    	// この時点で手札の残りが1枚ならばあがりを宣言する
    	if (**** == 1)
    	{
    		master_.declareWin(this);
    	}
    	
    	// 出す前にシャッフルする
    	myHand_.shuffle();
    	
    	return myHand_;
    }

    /**
     * プレイヤーの名前を返す
     * 
     * @return プレイヤーの名前
     */
    public String toString()
    {
    	return name_;
    }

}
