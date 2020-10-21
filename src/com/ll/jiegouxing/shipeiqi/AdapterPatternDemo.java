package com.ll.jiegouxing.shipeiqi;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/21 0021 下午 15:00
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 * 如何解决：继承或依赖（推荐）。
 * 关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","火红的萨日朗");
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
