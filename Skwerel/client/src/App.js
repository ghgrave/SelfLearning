import {useState} from 'react'
import './App.css';
import axios from 'axios'
import keys from "./config/keys";
import { url } from './helpers/helpers';

function App() {

  const [rows, setRows] = useState([]);
  const performSearch = (searchTerm)=>  {
    if(!searchTerm || searchTerm.trim().length === 0 ) return setRows([])
    const queryRoute = `/search/movie?api_key=${keys.tmdb_api_key}&query=${searchTerm}`;
    axios.get(url+queryRoute)
      .then((searchResults) => {
        let movieRows = [];
        searchResults.data.results.forEach((movie) => {
          let {poster_path, id, title} = movie
          let poster = "https://image.tmdb.org/t/p/w200" + poster_path
          const movieRow = (
            <div key={id}>
              <img src={poster} alt={title} />
              {title}
            </div>
          );
          movieRows.push(movieRow);
        });
        setRows(movieRows)
      })
      .catch(error => console.log('Error coming from API:', error));
  }

  const searchChangeHandler = (event) => {
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
          autoComplete='off'
        />
        {rows}
    </div>
  );
}

export default App;
