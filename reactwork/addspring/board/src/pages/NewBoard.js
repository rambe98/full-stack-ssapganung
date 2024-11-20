import React, { useState } from 'react';
import styled from 'styled-components';
import { useNavigate } from 'react-router-dom';

const NewBoard = ({ addPost }) => {
    const [title, setTitle] = useState('');
    const [author, setAuthor] = useState('');
    const [content, setContent] = useState('');

    const navigate = useNavigate();  // 페이지 이동을 위한 hook

  // 저장 버튼 클릭 시 처리
  const handleSave = () => {
    const newPost = {
      id: Date.now(),  // 고유 id 생성 (현재 시간으로)
      title,
      author,
      writingTime: new Date().toISOString(),  // 작성 시간 현재 시간
      content
    };

    addPost(newPost);  // 부모 컴포넌트로 새로운 게시글 전달
    navigate('/');  // 게시판 페이지로 돌아가기
  };

  const handleCancel = () => {
    navigate('/');  // 게시판 페이지로 돌아가기
  };

  return (
    <Container>
      <Header>
        <Title>글쓰기</Title>
      </Header>

      <Form>
        <Label>제목</Label>
        <Input
          type="text"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
          placeholder="제목을 입력하세요"
        />

        <Label>작성자</Label>
        <Input
          type="text"
          value={author}
          onChange={(e) => setAuthor(e.target.value)}
          placeholder="작성자를 입력하세요"
        />

        <Label>내용</Label>
        <TextArea
          value={content}
          onChange={(e) => setContent(e.target.value)}
          placeholder="내용을 입력하세요"
        />

        <ButtonContainer>
          <SaveButton onClick={handleSave}>저장</SaveButton>
          <CancelButton onClick={handleCancel}>취소</CancelButton>
        </ButtonContainer>
      </Form>
    </Container>
  );
};

export default NewBoard;

// Styled Components

const Container = styled.div`
  width: 50%;
  margin: 0 auto;
  padding: 20px;
  font-family: Arial, sans-serif;
`;

const Header = styled.div`
  text-align: center;
  margin-bottom: 20px;
`;

const Title = styled.h1`
  font-size: 24px;
`;

const Form = styled.div`
  display: flex;
  flex-direction: column;
`;

const Label = styled.label`
  font-size: 18px;
  margin: 10px 0 5px;
`;

const Input = styled.input`
  padding: 10px;
  font-size: 16px;
  margin-bottom: 15px;
  border: 1px solid #ccc;
  border-radius: 4px;
`;

const TextArea = styled.textarea`
  padding: 10px;
  font-size: 16px;
  margin-bottom: 15px;
  border: 1px solid #ccc;
  border-radius: 4px;
  height: 150px;
`;

const ButtonContainer = styled.div`
  display: flex;
  justify-content: space-between;
`;

const SaveButton = styled.button`
  padding: 10px 20px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;

  &:hover {
    background-color: #45a049;
  }
`;

const CancelButton = styled.button`
  padding: 10px 20px;
  background-color: #f44336;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;

  &:hover {
    background-color: #e53935;
  }
`;
