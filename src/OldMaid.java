/**
 * ばば抜きプログラム。
 */

public class OldMaid {

	public static void main(String[] args) {
        // 進行役の生成
        Master master = new Master();
        
        // テーブルの生成
        Table field = new Table();
        
        // プレイヤーの生成
        Player yamamoto = new Player("山本", master, field);
        Player go       = new Player("郷　", master, field);
        Player stomo    = new Player("鈴木", master, field);
        
        // 進行役へプレイヤーを登録
        master.registerPlayer(yamamoto);
        master.registerPlayer(go);
        master.registerPlayer(stomo);
        
        // トランプを生成する
        Hand trump = createTrump();
        
        // ゲームの準備をする
        master.prepareGame(trump);
        
        // ゲームを開始する
        master.startGame();
	}

    /**
     * 53枚のトランプを生成する。
     * 
     * @return トランプを格納したHand
     */
    private static Hand createTrump()
    {
        Hand trump = new Hand();
        
        // 各スート52枚のカードを生成する
        for (int number = 1; number <= 13; number++)
        {
            trump.addCard(new Card(Card.CLUB, number));
            trump.addCard(new Card(Card.DIAMOND, number));
            trump.addCard(new Card(Card.HEART, number));
            trump.addCard(new Card(Card.SPADE, number));
        }
        
        // ジョーカーを一枚加える
        trump.addCard(new Card(0, Card.JOKER));
        
        return trump;
    }

}
