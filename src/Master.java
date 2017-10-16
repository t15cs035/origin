/**
 * ばば抜きの進行役を表すクラス。
 */

import java.util.ArrayList;

public class Master {

	/** プロパティ */
    /** プレイヤーのリスト */
    private ArrayList players_ = new ArrayList();

    /**
     * ゲームの準備をする
     * 
     * @param cards トランプを進行役の手札として渡す
     */
    public void prepareGame(Hand cards)
    {
    	System.out.println("【カードを配ります】");
    	
    	// トランプをシャッフルする
    	****;
    	
    	// トランプの枚数を取得
    	int numberOfCards = cards.getNumberOfCards();
    	
    	// プレイヤーの人数を取得
    	int numberOfPlayers = players_.****;
    	
    	// プレイヤーに一枚ずつカードを配る
    	for (int index=0; index < numberOfCards; index++)
    	{
    		// 進行役の手札から一枚引く
    		Card card = ****;
    		
    		// 各プレイヤーに順番に card を渡す
    		Player player = (Player) players_.get(index % numberOfPlayers);
    		player.*****;
    	}
    }
    
    /**
     * ゲームを開始する
     */
    public void startGame()
    {
        System.out.println("\n【ばば抜きを開始します】");

        // プレイヤーが一人になるまで繰り返す
        for (int count = 0; players_.size() > 1; count++)
        {
            int playerIndex = count % players_.size();
            int nextPlayerIndex = (count + 1) % players_.size();

            // 指名するプレイヤーの取得
            Player player = (Player) players_.get(playerIndex);

            // 次のプレイヤーの取得
            Player nextPlayer = (Player) players_.get(nextPlayerIndex);

            // プレイヤーを指名する
            System.out.println("\n" + player + "さんの番です");
            player.play(nextPlayer);
        }

        // プレイヤーが上がって残り1名になるとループを抜ける
        System.out.println("【ばば抜きを終了しました】");
    }

    /**
     * 上がりを宣言する。
     * 
     * @param winner 上がったプレイヤー
     */
    public void declareWin(Player winner)
    {
    	// 上がったプレイヤーを画面に表示
    	System.out.println(winner + "さんが上がりました");
    	
    	// 上がったプレイヤーをリスト players_ から外す
    	players_.remove(******);
    	
    	// 残りのプレイヤーが一人ならば終了を宣言する
    	if (players_.size() == 1)
    	{
    		Player loser = (Player) players_.get(0);
    		Sytem.out.println(loaser + "さんの負けです");
    	}
    }

    /**
     * ゲームに参加するプレイヤーを登録する。
     * 
     * @param player 参加するプレイヤー
     */
    public void registerPlayer(Player player)
    {
        // リストに参加者を追加する
        players_.*****;
    }

}
