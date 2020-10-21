package com.ll.jiegouxing.shipeiqi;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/21 0021 下午 14:58
 */
public class AudioPlayer implements MeidaPlayer {
    MeidaPlayer meidaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            meidaPlayer = new MediaAdapter(audioType);
            meidaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
