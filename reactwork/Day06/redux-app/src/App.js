import logo from './logo.svg';
import './App.css';
import React from 'react';
// Redux와 React를 연결하는 데 필요한 Provider, useDispatch, useSelector를 가져옴
import { Provider, useDispatch, useSelector } from 'react-redux'; 

// Redux 스토어를 가져옴. 이 스토어는 전역 상태를 관리함
import store from './store'; 

// increment와 decrement 액션 생성 함수(action creator)를 가져옴. 
// 이 함수들은 상태를 변경하는 액션을 디스패치하기 위해 사용됨
import { increment, decrement } from './action'; 

function Counter() {
  // useSelector: Redux 스토어에서 상태를 읽어오는 Hook
  // 스토어의 상태 중 count 값을 선택해서 가져옴
  const count = useSelector((state) => state.count);
  
  // useDispatch: Redux 스토어에 액션을 보낼 수 있는 Hook
  // 이 Hook을 사용해 액션을 디스패치할 수 있음
  const dispatch = useDispatch();

  return (
    <div>
      {/* 현재 상태인 count 값을 화면에 출력함 */}
      <h1>Counter: {count}</h1>
      
      {/* Increment 버튼을 클릭하면 increment 액션을 디스패치함 */}
      <button onClick={() => dispatch(increment())}>Increment</button>

      {/* Decrement 버튼을 클릭하면 decrement 액션을 디스패치함 */}
      <button onClick={() => dispatch(decrement())}>Decrement</button>
    </div>
  );
}

function App() {
  return (
    <div className="App">
    {/* Provider: Redux 스토어를 애플리케이션 전체에 제공함 */}
    {/* Provider 안에 있는 모든 컴포넌트는 Redux 스토어에 접근할 수 있음 */}
    <Provider store={store}> 
    {/* Counter 컴포넌트는 Redux 스토어에서 상태를 읽고, 액션을 디스패치할 수 있음 */}
      <Counter />   
    </Provider>
    </div>
  );
}

export default App;
