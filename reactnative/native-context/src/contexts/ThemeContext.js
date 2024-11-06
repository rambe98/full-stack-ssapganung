import React, { createContext, useState } from 'react';

// 1. ThemeContext 생성
const ThemeContext = createContext();

// 2. ThemeProvider 컴포넌트 생성
const ThemeProvider = ({ children }) => {
    // 다크모드와 라이트모드 상태 관리
    const [isDarkMode, setIsDarkMode] = useState(false);

    // 테마 변경 함수
    const toggleTheme = () => {
        setIsDarkMode(prevMode => !prevMode);
    };

    // Context value: 테마 상태와 테마 전환 함수
    const value = {
        isDarkMode,
        toggleTheme,
    };

    return (
        <ThemeContext.Provider value={value}>
            {children}
        </ThemeContext.Provider>
    );
};

export { ThemeProvider, ThemeContext };
