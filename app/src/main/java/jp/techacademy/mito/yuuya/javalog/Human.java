package jp.techacademy.mito.yuuya.javalog;

import android.util.Log;

/**
 * Created by yuyamito on 2017/12/11.
 */

public class Human extends Animal implements Thinkable {
    String hobby; //趣味

    // コンストラクタ
    public Human(String name, int age,String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "。年は" + this.age + "歳です。");
    }

    // メンバ関数
    public void think() {

        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}