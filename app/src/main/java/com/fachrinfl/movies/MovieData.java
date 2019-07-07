package com.fachrinfl.movies;

import java.util.ArrayList;

public class MovieData {
    public static String[][] movieData = new String[][]{
            {
                    "Spider-Man: Far from Home",
                    "https://m.media-amazon.com/images/M/MV5BMGZlNTY1ZWUtYTMzNC00ZjUyLWE0MjQtMTMxN2E3ODYxMWVmXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "2h 9min",
                    "Action, Adventure, Sci-Fi",
                    "2 July 2019",
                    "8.1/10",
                    "52,278",
                    "Following the events of Avengers: Endgame (2019), Spider-Man must step up to take on new threats in a world that has changed forever.",
                    "Jon Watts",
                    "Chris McKenna, Stan Lee (based on the Marvel comic book by)",
                    "Tom Holland, Samuel L. Jackson, Jake Gyllenhaal"
            },
            {
                    "Toy Story 4",
                    "https://m.media-amazon.com/images/M/MV5BMTYzMDM4NzkxOV5BMl5BanBnXkFtZTgwNzM1Mzg2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "1h 40min",
                    "Animation, Adventure, Comedy",
                    "21 June 2019",
                    "8.3/10",
                    "52,781",
                    "When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
                    "Josh Cooley",
                    "John Lasseter (original story by), Andrew Stanton (original story by)",
                    "Tom Hanks, Tim Allen, Annie Potts"
            },
            {
                    "Aladdin",
                    "https://m.media-amazon.com/images/M/MV5BMjQ2ODIyMjY4MF5BMl5BanBnXkFtZTgwNzY4ODI2NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg",
                    "2019",
                    "2h 8min",
                    "Adventure, Comedy, Family",
                    "24 May 2019",
                    "7.4/10",
                    "77,902",
                    "A kind-hearted street urchin and a power-hungry Grand Vizier vie for a magic lamp that has the power to make their deepest wishes come true.",
                    "Guy Ritchie",
                    "John August (screenplay by), Guy Ritchie (screenplay by)",
                    "Will Smith, Mena Massoud, Naomi Scott"
            }
    };

    public static ArrayList<MovieModel> getListMovie() {
        ArrayList<MovieModel> list = new ArrayList<>();
        for (String[] data: movieData) {
            MovieModel movie = new MovieModel();
            movie.setTitle(data[0]);
            movie.setCover(data[1]);
            movie.setYear(data[2]);
            movie.setDuration(data[3]);
            movie.setCategory(data[4]);
            movie.setRelease(data[5]);
            movie.setRate(data[6]);
            movie.setVote(data[7]);
            movie.setDescription(data[8]);
            movie.setDirector(data[9]);
            movie.setWriters(data[10]);
            movie.setStars(data[11]);

            list.add(movie);
        }

        return list;
    }
}
