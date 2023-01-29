package jp.ac.uryukyu.ie.e225729;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class playersetting{
    Scanner scanner = new Scanner(System.in);
    int player_nizuu;
    List<Integer> player_list;
    public void player_nizu_setting(){
        System.out.println("プレイヤーの数を入力して下さい。");
        player_nizuu = scanner.nextInt();
        player_list = new ArrayList<>(player_nizuu);
    }
    public static void main(String[] args){

    }
}