import React, { useContext } from 'react';
import styled from 'styled-components/native';
import { ThemeContext, ThemeProvider } from '../contexts/ThemeContext';

const StyledText = styled.Text`
    font-size: 24px;
    color: ${({ theme }) => theme.textColor};
    margin-bottom: 20px;
`;

const StyledButton = styled.TouchableOpacity`
    background-color: skyblue;
    padding: 10px 20px;
    border-radius: 5px;
    border : 1px;
`;

const ButtonText = styled.Text`
    color: ${({ theme }) => theme.buttonTextColor};
    font-size: 18px;
`;

const ThemeComponent = () => {
    const { isDarkMode, toggleTheme } = useContext(ThemeContext);

    const theme = isDarkMode
        ? {
              backgroundColor: '#333',
              textColor: '#fff',
              buttonColor: '#666',
              buttonTextColor: '#fff',
          }
        : {
              backgroundColor: '#fff',
              textColor: '#333',
              buttonColor: '#ddd',
              buttonTextColor: '#333',
          };

    return (
        <ThemeProvider theme={theme}>
            <Container style={{ backgroundColor: theme.backgroundColor }}>
                <StyledText>{isDarkMode ? '다크 모드' : '라이트 모드'}</StyledText>
                <StyledButton onPress={toggleTheme}>
                    <ButtonText>모드 변경</ButtonText>
                </StyledButton>
            </Container>
        </ThemeProvider>
    );
};

const Container = styled.View`
    flex: 1;
    justify-content: center;
    align-items: center;
`;

export default ThemeComponent;
