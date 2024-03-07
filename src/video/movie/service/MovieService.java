package video.movie.service;

import oop.modi.constructor.pac1.A;
import video.common.AppService;
import video.common.Condition;
import video.movie.domain.Movie;
import video.movie.repository.MovieRepository;
import video.ui.AppUi;

import java.util.ArrayList;
import java.util.List;

import static video.ui.AppUi.*;

public class MovieService implements AppService {
    private final MovieRepository movieRepository = new MovieRepository(); // 객체생성
    @Override
    public void start() {

        while (true) {
            movieManagementScreen();
            int selection = inputInteger(">>> ");

            switch (selection) {
                case 1:  // 1. 신규 영화 DVD 추가
                    insertMovieData();
                    break;
                case 2: // 2. 영화 DVD 정보 검색
                    showSearchMovieData();
                    break;
                case 3 : // 3. 기존 등록 영화 삭제 기능
                    deleteMovieData();
                    break;
                case 4: // 4. 첫 화면으로 가기
                    return;

                default:
                    System.out.println("### 메뉴를 다시 입력하세요.");
            }

        }

    }




    // 1. 신규 영화 DVD 추가
    private void insertMovieData() {
        System.out.println("\n ====== 영화 DVD 정보를 추가합니다. ======");
        String movieName = inputString("# 영화명: ");
        String nation = inputString("# 국가명 ");
        int pubYear = inputInteger("# 발매연도: ");

        Movie newMovie = new Movie(movieName, nation, pubYear);

        movieRepository.addMovie(newMovie);

        System.out.printf("\n### [%s] 정보가 정상적으로 추가 되었습니다.", movieName);

    }

    // 2. 영화 DVD 정보 검색
    // 2-1) 영화검색정보 출력
    private void showSearchMovieData() {

        try {
            List<Movie> movies  = searchMovieData();
            int count = movies.size();
            if (count > 0 ) {
                System.out.printf("\n================================ 검색 결과(총 %d건) ================================\n", count);
                for (Movie movie : movies) {
                    System.out.println(movie);
                }
            } else {
                System.out.println("\n### 검색 결과가 없습니다.");
            }
        } catch (Exception e) {
            System.out.println("\n### 발행연도는 정수로만 입력하세요.");
        }



    }

    // 2-2) 영화 검색 비즈니스 로직
    private List<Movie> searchMovieData() throws Exception{
        System.out.println("\n============== 영화 DVD 검색 조건을 선택하세요. ===============");
        System.out.println("[ 1. 제목검색 | 2. 국가검색 | 3. 발매연도검색 | 4. 전체검색 ]");
        int selection = inputInteger(">>> ");

        Condition condition = Condition.ALL; // 기본은 ALL
        switch (selection) {
            case 1 :
                System.out.println("\n### 제목으로 검색합니다.");
                condition = Condition.TITLE;
                break;
            case 2 :
                System.out.println("\n###  국가명으로 검색합니다.");
                condition = Condition.NATION;
                break;
            case 3 :
                System.out.println("\n### 발매연도로 검색합니다.");
                condition = Condition.PUB_YEAR;
                break;
            case 4 :
                System.out.println("\n### 전체 정보를 검색합니다.");
                break;
            default:
                System.out.println("\n### 해당메뉴는 존재하지않습니다. 전체 정보로 검색합니다.");

        }

        String keyword = "";
        if (condition != Condition.ALL) {
            keyword = inputString("# 검색어: ");
        }

        return movieRepository.searchMovieList(condition, keyword);

    }

    // 3. 영화 삭제 로직
    private void deleteMovieData() {

        try {
            System.out.println("\n### 삭제를 위한 영화 검색을 시작합니다.");
            List<Movie> movies = searchMovieData();

            if (movies.size() > 0) {
                List<Integer> movieNums = new ArrayList<>();
                for (Movie movie : movies) {
                    System.out.println(movie);
                    movieNums.add(movie.getSerialNumber());
                }
                System.out.println("\n### 삭제할 영화의 번호를 입력하세요.");
                int delmovieNum = inputInteger(">>> ");

                if (movieNums.contains(delmovieNum)) {
                    Movie delMovie = MovieRepository.deleteMovie(delmovieNum);
                    System.out.printf("\n### 영화번호: %d %s 영화의 정보를 정상 삭제 하였습니다.\n"
                            ,delMovie.getSerialNumber(),delMovie.getMovieName());
                } else {
                    System.out.println("\n### 검색된 영화 번호로만 삭제가 가능합니다.");
                }
            } else {
                System.out.println("\n### 조회 결과가 없습니다.");
            }


        } catch (Exception e) {
            System.out.println("\n### 발행연도는 정수로만 입력하세요.");
        }




    }


}
