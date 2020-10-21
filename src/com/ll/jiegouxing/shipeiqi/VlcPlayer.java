package com.ll.jiegouxing.shipeiqi;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/21 0021 下午 14:52
 */
public class VlcPlayer implements AdanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("此时Vlc播放的是"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
