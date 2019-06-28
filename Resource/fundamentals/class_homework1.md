### Homework – Classes 1


#### Tasks

1. Create a class that holds information about a `Movie`
```
movie name
main actor name
year
genre (Comedy, Drama, Fantasy, Horror)
IMDB score (1.00 - 10.00), default 5.00
cinema ticket price, default 2 (dollars)
```

- create constructor from all but IMDB score and ticket price
- create getters for all fields
- create setters for IMDB score and ticket price
- add a field that stores how many `Movie` instances we create in our code
(update this field each time a new object is created)
- create a function that decreases the ticket price with a known value
- create a method that increases the year by 1
- test the Movie class:
  - create 3 Movies with the following data
  ```
    Venom, Tom Hardy , Sci-Fi, 2018, 9.2, 5$
    Bohemian Rhapsody, Rami Malek, Drama, Brie Larson, 2018, 10, 6$
    The Hustle, Anne Hathaway, Comedy, 2018 , 5.3, 3$
  ```
  - print them to the console in a human readable format
  - decrease first two movies IMDB score with 2.5
  - increase the year for the last movie
  - print the total movies counter
  - print all movies again
  - add all movies to an array named `movies`
  - print all names from the `movies` array
  - get the average IMDB score for the `movies` array.


2. What will the following code print and why (usually this is a white paper test):
```
int i = 10;
Integer j = 5;
System.out.println(i++ - --j + "" + i + j);
```

