import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const Board = ({boardList}) => {
  const [postsPerPage, setPostsPerPage] = useState(5);
  const [currentPage, setCurrentPage] = useState(1);

  // 페이지네이션 계산
  const totalPages = Math.ceil(boardList.length / postsPerPage);
  const currentPosts = boardList.slice((currentPage - 1) * postsPerPage, currentPage * postsPerPage);

  const handlePageChange = (pageNumber) => {
    setCurrentPage(pageNumber);
  };

  return (
    <Container>
      <Header>
        <Title>게시판</Title>
        <Link to="/new">
          <WriteButton>글쓰기</WriteButton>
        </Link>
      </Header>

      <BoardList>
        {currentPosts.map((post) => (
          <BoardItem key={post.id}>
            <PostTitle>{post.title}</PostTitle>
            <PostAuthor>작성자: {post.author}</PostAuthor>
            <PostTime>| 작성 시간: {post.writingTime}</PostTime>
          </BoardItem>
        ))}
      </BoardList>

      <Footer>
        <Pagination>
          {[...Array(totalPages)].map((_, index) => (
            <PageButton key={index} onClick={() => handlePageChange(index + 1)}>
              {index + 1}
            </PageButton>
          ))}
        </Pagination>

        <PostsPerPageSelector>
          <label>게시글 수: </label>
          <select onChange={(e) => setPostsPerPage(Number(e.target.value))} value={postsPerPage}>
            <option value={1}>1</option>
            <option value={3}>3</option>
            <option value={5}>5</option>
          </select>
        </PostsPerPageSelector>
      </Footer>
    </Container>
  );
};

export default Board;


const Container = styled.div`
  width: 80%;
  margin: 0 auto;
  padding: 20px;
  font-family: Arial, sans-serif;
`;

const Header = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
`;

const Title = styled.h1`
  font-size: 24px;
`;

const WriteButton = styled.button`
  padding: 8px 16px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  
  &:hover {
    background-color: #45a049;
  }
`;

const BoardList = styled.div`
  margin-top: 20px;
  border: 1px;
`;

const BoardItem = styled.div`
  display: flex;
  justify-content: space-between;
  padding: 10px 0;
  border-bottom: 1px solid #ccc;
`;

const PostTitle = styled.p`
  font-weight: bold;
  text-align: left;
  width: 33%;
  color: blue;
`;

const PostAuthor = styled.p`
  text-align: center;
  width: 33%;
`;

const PostTime = styled.p`
  text-align: right;
  width: 33%;
`;

const Footer = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 20px;
`;

const Pagination = styled.div`
  display: flex;
  gap: 5px;
  
`;

const PageButton = styled.button`
  padding: 5px 10px;
  border: 1px solid #ccc;
  background-color: #fff;
  cursor: pointer;
  
  &:hover {
    background-color: #f0f0f0;
  }
`;

const PostsPerPageSelector = styled.div`
  display: flex;
  align-items: center;

  select {
    margin-left: 10px;
    padding: 5px;
  }
`;
