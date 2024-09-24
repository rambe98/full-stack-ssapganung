import './App.css';
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux'; 
import { addTodo, removeTodo } from './actions';


export default function TodoApp() {
  const [input, setInput] = useState('');
  const todos = useSelector((state) => state.todos);
  const dispatch = useDispatch();
  const [deletedTodos, setDeletedTodos] = useState([]);

  const handleAddTodo = () => {
    if (input.trim()) {
      dispatch(addTodo(Date.now(), input));
      setInput('');
    }
  };

  const handleRemoveTodo = (id) => {
    const todoToRemove = todos.find(todo => todo.id === id);
    if (todoToRemove) {
      setDeletedTodos([...deletedTodos, todoToRemove]);
      dispatch(removeTodo(id));
    }
  };
  // 심심해서 삭제한 할일 복원하는것도 만들어봤어염
  const handleRestoreTodo = () => {
    if (deletedTodos.length > 0) {
      const lastDeletedTodo = deletedTodos[deletedTodos.length - 1];
      dispatch(addTodo(lastDeletedTodo.id, lastDeletedTodo.text));
      setDeletedTodos(deletedTodos.slice(0, -1));
    } else {
      alert('복원할 할일이 없습니다!');
    }
  };
  // 엔터키로도 할일 추가 기능 추가
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
    <div>
      <h1>Todo List</h1>
        <input
          type="text"
          value={input}
          onChange={(e) => setInput(e.target.value)}
          onKeyPress={handleKeyPress}
          placeholder="Add a new todo"
        />
        <button onClick={handleAddTodo}>Add Todo(추가)</button>
        <button onClick={handleRestoreTodo}>Restore(복원)</button>

        <ul>
          {todos.map((todo) => (
            <li key={todo.id}>
              {todo.text} 
              <button onClick={() => handleRemoveTodo(todo.id)}>Remove(삭제)</button>
            </li>
          ))}
        </ul>
    </div>
  );
}
