//参考　https://techacademy.jp/magazine/22228
//参考　https://www.motokis-brain.com/article/12
package Othello;

import java.util.Scanner;

public class Othello{
    public static void main(String[]args){
        Board.initialize();
        Board.showBoard();
        //コンソールからの入力を受け付ける
        Scanner s = new Scanner(System.in);
        //ゲーム実行中のフラグがtrueの間ループする
        while(Board.game){
            System.out.println("石を置くX座標を入力してください:");
            int x = s.nextInt();
            System.out.println("石を置くY座標を入力してください:");
            int y = s.nextInt();
            Board.setStone(x, y);
        }
    s.close();
    }
}