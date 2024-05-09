package com.example.some_cool_library;

import java.util.HashMap;
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    @Override
    public HashMap<String, Video> popularVideos(){
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }


    @Override
    public Video getVideo(String videoId){
        connectToServer("http://www.youtube.com/"+ videoId);
        return getSomeVideo(videoId);
        

    }


    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }
    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "LiGBiotafogo.avi"));
        hmap.put("mkafksangasj", new Video("424234324324", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("3j4h2jk34j44", "Dancing vide.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("mfoi2i3434343", "Barcelona vs Liga.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Curso UDMEY.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }
    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }

}
