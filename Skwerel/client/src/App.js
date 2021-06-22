import {useState} from 'react'
import './App.css';

import keys from "./config/keys";

function App() {

  const [rows, setRows] = useState([]);
  const performSearch = (searchTerm)=>  {
    const url = `https://api.themoviedb.org/3`;
    const movieRoute = `/search/movie?api_key=${keys.tmdb_api_key}&query=${searchTerm}`;
    const endpoint = url + movieRoute;
    fetch(endpoint)
      .then((response) => response.json())
      .then((searchResults) => {
        let movies = searchResults.results
        let movieRows = [];
        movies.forEach((movie) => {
          let poster = "https://image.tmdb.org/t/p/w200" + movie.poster_path
          const movieRow = (
            <div key={movie.id}>
              <img src={poster} alt="poster" />
              {movie.title}
            </div>
          );
          movieRows.push(movieRow);
        });
        setRows(movieRows)
      })
      .catch(error => console.log('Error coming from API:', error));
  }

  const searchChangeHandler = (event) => {
    console.log(event.target.value)
    performSearch(event.target.value)
  }
  
  return (
    <div className="App">
      <h1>Skwerel</h1>
      <input
          id="inputField"
          type="text"
          placeholder="enter your movie here"
          onChange={searchChangeHandler}
        />
        {rows}
    </div>
  );
}

export default App;
