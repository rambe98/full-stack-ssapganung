import React, { createContext, useState, useContext } from 'react';

// UserContext 생성
const UserContext2 = createContext();

// UserProvider 컴포넌트 정의
export const UserProvider2 = ({ children }) => {
    // 사용자 로그인 상태와 사용자 이름 상태 관리
    const [user, setUser] = useState({ isLoggedIn: false, name: '' });

    const login = (name) => {
        setUser({ isLoggedIn: true, name }); // 로그인 처리
    };

    const logout = () => {
        setUser({ isLoggedIn: false, name: '' }); // 로그아웃 처리
    };

    return (
        <UserContext2.Provider value={{ user, login, logout }}>
            {children}
        </UserContext2.Provider>
    );
};

// UserContext를 쉽게 사용할 수 있도록 hook 제공
export const useUser = () => useContext(UserContext2);

export default UserContext2;
