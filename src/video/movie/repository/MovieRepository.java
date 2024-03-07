package video.movie.repository;

import video.common.Condition;
import video.movie.domain.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static video.common.Condition.*;

public class MovieRepository {

    private static final Map<Integer, Movie> movieDatabase = new HashMap<>();

    static {
        insertTestMovieData();
    }

    //테스트 데이터 생성 및 삽입
    private static void insertTestMovieData() {
        Movie movie1 = new Movie("인터스텔라", "미국", 2014);
        Movie movie2 = new Movie("포레스트 검프", "미국", 1994);
        Movie movie3 = new Movie("너의 이름은", "일본", 2017);
        Movie movie4 = new Movie("라라랜드", "미국", 2016);
        Movie movie5 = new Movie("레옹", "프랑스", 1994);
        Movie movie6 = new Movie("어바웃 타임", "영국", 2013);
        Movie movie7 = new Movie("타이타닉", "미국", 1998);
        Movie movie8 = new Movie("인생은 아름다워", "이탈리아", 1999);
        Movie movie9 = new Movie("쇼생크 탈출", "미국", 1995);
        Movie movie10 = new Movie("기생충", "대한민국", 2019);

        movieDatabase.put(movie1.getSerialNumber(), movie1);
        movieDatabase.put(movie2.getSerialNumber(), movie2);
        movieDatabase.put(movie3.getSerialNumber(), movie3);
        movieDatabase.put(movie4.getSerialNumber(), movie4);
        movieDatabase.put(movie5.getSerialNumber(), movie5);
        movieDatabase.put(movie6.getSerialNumber(), movie6);
        movieDatabase.put(movie7.getSerialNumber(), movie7);
        movieDatabase.put(movie8.getSerialNumber(), movie8);
        movieDatabase.put(movie9.getSerialNumber(), movie9);
        movieDatabase.put(movie10.getSerialNumber(), movie10);
    }



    // 영화 추가하기
    public void addMovie(Movie movie) {
        movieDatabase.put(movie.getSerialNumber(), movie);
    }

    // 영화 검색하기
    public List<Movie> searchMovieList(Condition condition, String keyword) throws Exception{
        
        if (condition == TITLE) {  // 1. 제목으로 검색했을때
            return searchByTitle(keyword);
        } else if (condition == NATION) {  // 2. 국가로 검색했을때
            return searchByNation(keyword);
        } else if (condition == PUB_YEAR) {  // 3. 발행연도로 검색했을때
            return searchByPubYear(keyword);
        } else {   // 전체를 검색했을때
            return searchAll();
        }

    }

    // 4. 전체 검색했을때
    private List<Movie> searchAll() {
        List<Movie> searchList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            searchList.add(movie);
            
        }
        return searchList;
    }

    
    // 3. 발행연도로 검색했을때
    // 문자열 숫자로 변환하는 과정에서 예외 발생 가능성이 있기 때문에 throws 추가.
    // 실행과정에서 예외발생
    private List<Movie> searchByPubYear(String keyword) throws NumberFormatException {
        List<Movie> searchList = new ArrayList<>();
        
        // 입력값을 String 으로 받았기 때문에 int 로 변환해서 비교
        int targetYear = Integer.parseInt(keyword); // 키워드의 값을 정수로 전환

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            if (movie.getPubYear() == targetYear) {
                searchList.add(movie);
            }
        }
        return searchList;
    }

    // 2. 국가로 검색했을때
    private List<Movie> searchByNation(String keyword) {
        List<Movie> searchList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            if (movie.getNation().equals(keyword)) {
                searchList.add(movie);
            }
        }
        return searchList;
    }

    // 1. 영화제목으로 검색했을때
    private List<Movie> searchByTitle(String keyword) {
        List<Movie> searchList = new ArrayList<>();

        for (int key : movieDatabase.keySet()) {
            Movie movie = movieDatabase.get(key);
            if (movie.getMovieName().equals(keyword)) {
                searchList.add(movie);
            }
        }
        return  searchList;
    }

    // 영화 삭제하기
    public static Movie deleteMovie(int delmovieNum) {
       return movieDatabase.remove(delmovieNum);
    }


}









