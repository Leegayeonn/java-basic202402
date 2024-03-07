package song;

import util.Utility;

import java.io.*;
import java.util.*;

import static util.Utility.*;

public class ArtistRepository {

    // key: 가수이름, value: Artist 객체 
    // Map 객체 선언
    private static Map<String, Artist> artistList;

    static {
        artistList = new HashMap<>();
    }

    // 신규 가수를 map 에 추가하는 기능
    public void addNewArtist(String artistName, String SongName) {
        // 1. 신규 가수 정보 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>());
        // 2. 생성된 노래 목록을 리턴받아서 노래 이름을 추가
        artist.getSongList().add(SongName);
        // 3. 완성된 객체를 Map 에 저장
        artistList.put(artistName, artist);
    }


    // 가수명을 전달받아 현재 등록된 가수인지의 여부를 리턴하는 기능
    public boolean isRegisted(String artistName) {
        return artistList.containsKey(artistName);
    }


    /**
     * 기존 가수 정보에 노래만 추가하는 기능
     * @param artistName  사용자의 입력 가수 이름
     * @param songName  사용자의 입력 노래 이름
     * @return - 곡명이 중복되었다면 false,
     *           곡이 정상적으로 추가되었다면 true
     */
    public boolean addNewSong(String artistName, String songName) {
        // Map 에서 기존 가수 객체부터 찾자.
        Artist artist = artistList.get(artistName);
        // Set 의 add 는 add 의 실행결과를 boolean 으로 리턴 -> 중복 발생시 객체추가되지않고 false 리턴
        boolean flag = artist.getSongList().add(songName);
        return flag;
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }


    // 노래 목록을 찾아서 출력하는 기능
    public void showSongList(String artistName) {

//        for ( Artist song : artistList.values()) {
//            System.out.println(song.getSongList());
//        }

        Artist artist = artistList.get(artistName);
        Set<String> songList = artist.getSongList();
        List<String> songs = new ArrayList<>(songList);

        for (int i = 0; i < songs.size(); i++) {
            System.out.printf("* %d. %s\n", i+1, songs.get(i));
        }
    }

    // 데이터 저장 기능
    public void saveData() {
        // 폴더 경로는 Utility 클래스에 상수로 선언되어있음.
        // 폴더가 실존하지 않은 경우 생성을 하고 세이브 파일을 생성해야 합니다.
        // 파일명은 song.sav 로 진행

        File f = new File(FILE_PATH);

            if(!f.exists()){
                f.mkdirs();
            }

         try(FileOutputStream fos = new FileOutputStream(FILE_PATH + "/song.sav")) {

             ObjectOutputStream oos = new ObjectOutputStream(fos);

             oos.writeObject(artistList);
             System.out.println("저장완료 되었습니다!");

         } catch (Exception e) {
             e.printStackTrace();
         }
    }


    // 데이터 로드 기능
    public void loadData() {
        // 세이브 파일이 존재하는지부터 체크합니다.
        // 존재한다면 로드를 진행해서 artistList 에 할당(대입)합니다.
        File f = new File(FILE_PATH + "/song.sav");
        if(f.exists()) {
            try (FileInputStream fis = new FileInputStream(FILE_PATH + "/song.sav")) {
                ObjectInputStream ois = new ObjectInputStream(fis);

                artistList = (Map<String, Artist>) ois.readObject();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("\n# 로드할 세이브 파일 없음!");
        }
    }
}


































