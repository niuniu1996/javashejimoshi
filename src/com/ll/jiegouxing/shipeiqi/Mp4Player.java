package com.ll.jiegouxing.shipeiqi;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/21 0021 下午 14:53
 */
public class Mp4Player implements AdanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("此时Mp4播放的是" + fileName);
    }
}
