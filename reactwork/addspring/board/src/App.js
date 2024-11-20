import React, { useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Board from './pages/BoardList';
import NewBoard from './pages/NewBoard'; // 글쓰기 화면

const App = () => {
  const [boardList, setBoardList] = useState([
    { id: 1, title: "첫 번째 게시글", author: "작성자1", writingTime: "2024-11-20 12:00", content: "첫 번째 게시글의 내용입니다." },
    { id: 2, title: "두 번째 게시글", author: "작성자2", writingTime: "2024-11-20 13:00", content: "두 번째 게시글의 내용입니다." },
    { id: 3, title: "세 번째 게시글", author: "작성자3", writingTime: "2024-11-20 14:00", content: "세 번째 게시글의 내용입니다." },
    // 더 많은 게시글...
  ]);

  const addPost = (newPost) => {
    setBoardList(prevList => [...prevList, newPost]);
  };

  return (
    <Router>
      <Routes>
        <Route path="/" element={<Board boardList={boardList} />} />
        <Route path="/new" element={<NewBoard addPost={addPost} />} />
      </Routes>
    </Router>
  );
};

export default App;
