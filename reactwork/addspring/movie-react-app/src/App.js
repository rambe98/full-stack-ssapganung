import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import { useState } from 'react';
import { useEffect } from 'react';

function App() {

  const [movie, setMovie] = useState([]);

  //useEffect
  //컴포넌트가 렌더링 된 후에 실행된다.
  //useEffect(() =>{
  //렌더링에 영향을 주지않는 코드들이 들어온다.
  //},[])

  //버튼을 누르기전까진 절때 실행이 안됨

  let options = {
    headers:{
    "Content-Type":"application/json"
   },
    url : 'http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=82ca741a2844c5c180a208137bb92bd7&targetDt=20241001',
    method : 'get'
}

const handleClick = () => {
  axios(options)
    .then(response => {
      console.log(response.data.boxOfficeResult.dailyBoxOfficeList);
      setMovie(response.data.boxOfficeResult.dailyBoxOfficeList);
    })
}

  const movieTable = (
    <div>
    <table border="1">
      <tr>
        <th>제목</th>
        <th>개봉날짜</th>
        <th>박스오피스순위</th>
        <th>관객수</th>
      </tr>
      <tbody>
                {movie.map((item) => (
                    <tr>
                        <td>{item.movieNm}</td>
                        <td>{item.openDt}</td>
                        <td>{item.rank}</td>
                        <td>{item.audiCnt}</td>
                    </tr>
                ))}
      </tbody>
    </table>
    </div>
  )

  return (

    <div className='container'>
      <div>
      <button onClick={handleClick}>일별 박스오피스 내용 가져오기</button>
      {movie.length >0 && movieTable}
      </div>
    </div>
  );
}

export default App;
