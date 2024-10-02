
import Todo from './Todo';
import { useEffect ,useState } from 'react';
import {Container, List, Paper} from "@mui/material";
import './App.css';
import AddTodo from './AddTodo';
import { call } from "./service/ApiService"

export default function App() {
  const [items, setItems] = useState([]);

  useEffect(() => {
    call("/todo", "GET")
      .then(result => setItems(result.data))
  }, [])

  const addItem = (item) =>{
    call("/todo", "GET")
      .then(result => setItems(result.data))
    // item.id = "ID-" + items.length;
    // item.done = false;//done초기화
    // // ...:스프레드 연상자
    // // 배열이나 객체의 요소를 개별적으로 펼쳐서 다른 배열이나 객체에 삽입할 때 사용함.
    // setItems([...items,item]);
    // console.log("items : ",items);  
  };
// map() -> 반복문 안에 들어있는 내용을 하나씩 꺼내서 처리한다.
// key : 요소의 리스트를 만들 때 react에서 컴포넌트를 렌더링 했을 때
// 어떤 아이템이 변경되는지 빠르게 감지하기 위해 사용한다.
// 만약 key가 설정되지 않았다면 가상 dom을 순차적으로 비교하면서 감지하기 때문에 key가 없을 때 보다 속도가 느리다.
  const deleteItem =(item) =>{
  // const newItems = items.filter(e => e.id !== item.id)
  // setItems([...newItems]);
  call("/todo", "DELETE",  item)
      .then(result => setItems(result.data))
  }

  const editItem = () => {
    call("/todo", "PUT",  item)
      .then(result => setItems(result.data))
  }

  let todoItems = items.length > 0 && (
  <Paper style={{margin:16}}>
    <List>
    {items.map((item) =>(
      <Todo 
        item={item} 
        key={item.id}
        editItem={editItem}
        deleteItem={deleteItem}/>
    ))}
    </List>
  </Paper>
  );

  //JSX문법 : 자바스크립트 코드 안에 HTML코드가 들어가는 것
  //Babel : JSX로 작성된 자바스크립트를 순수 자바스크립트로 만들어주는 라이브러리

  {/* props를 컴포넌트에 전달하기
  이름 = {useState값} */}
  return (
    <div className="App">
      <Container maxWidth="md">
        <AddTodo addItem={addItem}/>
        <div className='TodoList'>{todoItems}</div> 
      </Container>
    </div>
  );
}
