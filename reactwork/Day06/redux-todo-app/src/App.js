import './App.css';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux'; // Redux와 React 연결을 위한 Hook
import { addTodo, removeTodo } from './actions'; // 액션 생성 함수 불러오기


function TodoApp() {
  const [input, setInput] = useState(''); // 입력값을 관리하는 로컬 상태
  const todos = useSelector((state) => state.todos); // Redux에서 todos 상태를 가져옴
  const dispatch = useDispatch(); // 액션을 디스패치하는 함수 가져오기
  const [deletedTodos, setDeletedTodos] = useState([]);// 삭제된 할일을 저장할 배열

  const handleAddTodo = () => {
    if (input.trim()) {
      dispatch(addTodo(Date.now(), input)); // 새로운 Todo를 추가 (id는 현재 시간으로 고유값 생성)
      setInput(''); // 입력창 비우기
    }
  };

  const handleRemoveTodo = (id) => {
    const todoToRemove = todos.find(todo => todo.id === id);
    if (todoToRemove) {
      setDeletedTodos([...deletedTodos, todoToRemove]); // 삭제된 할일 추가
      dispatch(removeTodo(id)); // Todo 삭제
    }
  };
  
  const handleRestoreTodo = () => {
    if (deletedTodos.length > 0) {
      const lastDeletedTodo = deletedTodos[deletedTodos.length - 1];
      dispatch(addTodo(lastDeletedTodo.id, lastDeletedTodo.text)); // 마지막 삭제된 Todo 복원
      setDeletedTodos(deletedTodos.slice(0, -1)); // 삭제된 목록에서 마지막 요소 제거
    } else {
      alert('복원할 할일이 없습니다!');
    }
  };

  const handleKeyPress = (e) => {
    if (e.key === 'Enter') {
      if (input.trim()) {
        handleAddTodo();
      } else {
        alert('할일을 입력해 주세요!');
      }
    }
  };

  return (
    <div className="App">
      <h1>할일 리스트</h1>
        <input
          type="text"
          value={input}
          onChange={(e) => setInput(e.target.value)}
          onKeyPress={handleKeyPress}
          placeholder="추가할 일을 적어주세요"
        />
        <button onClick={handleAddTodo}>할일 추가</button>
        <button onClick={handleRestoreTodo}>복원하기</button>

        <ul>
          {todos.map((todo) => (
            <li key={todo.id}>
              {todo.text} 
              <button onClick={() => handleRemoveTodo(todo.id)}>지우기</button>
            </li>
          ))}
        </ul>
    </div>
  );
}

export default TodoApp;
