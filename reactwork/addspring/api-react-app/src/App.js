import logo from './logo.svg';
import './App.css';
import {BrowserRouter,Routes, Route} from 'react-router-dom';
import MultiButtons from './MultiButtons';
import Address from './api/Address';
import BookSearch from './api/BookSearch';
import NewsSearch from './api/NewsSearch';
import MapContainer from './api/Map';
import MapContainer2 from './api/Map2';
import MapContainer3 from './api/Map3';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<MultiButtons/>}/>
          <Route path="/address" element={<Address/>}/>
          <Route path="/search" element={<BookSearch/>}/>
          <Route path="/news" element={<NewsSearch/>}/>
          <Route path="/map" element={<MapContainer/>}/>
          <Route path="/map2" element={<MapContainer2/>}/>
          <Route path="/map3" element={<MapContainer3/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
