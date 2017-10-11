package nekio.sample.dp.structural;

/**
 *
 * @author Nekio
 */

import nekio.sample.dp.structural.decorator.AudioPlayer;
import nekio.sample.dp.structural.decorator.ImprovedPlayer;
import nekio.sample.dp.structural.decorator.VideoPlayer;
import nekio.sample.dp.structural.decorator.generic.IPlayer;
import nekio.sample.dp.structural.decorator.generic.Player;

public class DecoratorTest {
    public static void main(String[] args) {
        IPlayer audioPlayer = new AudioPlayer("Winamp");
        audioPlayer.start();
        audioPlayer.pause();
        audioPlayer.stop();
        
        IPlayer videoPlayer = new VideoPlayer(new Player("VLC Media Player"));
        videoPlayer.start();
        videoPlayer.pause();
        videoPlayer.stop();
        
        // Anidando decoradores de diferentes clases
        IPlayer improvedPlayer = new ImprovedPlayer(videoPlayer);
        improvedPlayer.start();
        improvedPlayer.pause();
        improvedPlayer.stop();
        
        // Anidando decoradores de la misma clase
        IPlayer nestedVideoPlayer = new VideoPlayer(videoPlayer);
        nestedVideoPlayer.start();
        nestedVideoPlayer.pause();
        nestedVideoPlayer.stop();
    }
}
