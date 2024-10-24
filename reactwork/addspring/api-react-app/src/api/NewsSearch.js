import axios from "axios";
import React ,{useState}from "react";
import '../css/news.css'

export default function NewsSearch(){
    const [query,setQuery] = useState(''); //검색어 state
    const [result,setResult] = useState([]); //검색 결과 state
    const [loading,setLoading] = useState(false); //로딩상태
    const [error,setError] = useState(null); 

    const searchNews = () =>{
        try{
            const response = axios.get('http://localhost:9090/api/news',{
                params : {query}
            });
            //검색 결과를 result 상태에 저장
            response.then(res => setResult(res.data.items));
        }catch(err){
            setError('뉴스 검색 실패띠');
        }
    }

    //검색 버튼 클릭시 호출
    const handleSearch = (e) =>{
        if(!query){
            alert('검색어 입력해라잉');
            return;
        }
        e.preventDefault();
        searchNews();
    }
        return(
            <div>
                <h1>네이버 뉴스 검색</h1>
                <form onSubmit={handleSearch}>
                    <input 
                        type='text'
                        value={query}
                        onChange={(e) => setQuery(e.target.value)}
                        placeholder='뉴스 입력해라'
                    />
                    <button type='submit'> 검  색 </button>
                </form>
                <ul>
                    {result.map((news) =>(
                        <li key={news.rss}>
                            {/* 검색 결과를 생성한 시간 */}
                            <p>{news.lastBuildDate}</p>
                            {/* 총 검색 결과 */}
                            <p>{news.total}</p>
                            <p>제 목 : {news.title}</p>
                            <p>링 크 : {news.originallink}</p>
                            <p>요 약 : {news.description}</p>
                            <p>시 간 : {news.pubDate}</p>
                            <a href={news.link} target='_blank' rel='noopener noreferrer'>더보기</a>
                        </li>
                    ))}
                </ul>
            </div> 
        );
}