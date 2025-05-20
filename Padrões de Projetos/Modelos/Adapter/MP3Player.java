// Implementação concreta da interface MediaPlayer para reprodução de arquivos de áudio MP3
class MP3Player implements MediaPlayer {
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase(anotherString:"MP3")) {
            System.out.println("Playng MP3 file" + fileName);
        } else {
            System.out.println(x:"Invalid media type for MP3 palyer.");
        }
    }

    public void stop(String mediaType) {
        System.out.println(x:"Stopping playback.");
    }
}