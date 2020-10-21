package com.ll.jiegouxing.shipeiqi;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/21 0021 下午 14:55
 */
public class MediaAdapter implements MeidaPlayer {
    AdanceMediaPlayer adanceMediaPlayer;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc") ){
            adanceMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")){
            adanceMediaPlayer.playMp4(fileName);
        }
    }

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            adanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            adanceMediaPlayer = new Mp4Player();
        }
    }


}
