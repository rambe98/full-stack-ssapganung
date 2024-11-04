import React from 'react';
import styled from 'styled-components/native';

const CalculatorButton = ({ title, onPress }) => {
  return (
    <ButtonContainer onPress={onPress}>
      <ButtonText>{title}</ButtonText>
    </ButtonContainer>
  );
};

const ButtonContainer = styled.TouchableOpacity`
  background-color: skyblue;  /* 버튼 배경 색상 */
  border-radius: 35px;         /* 둥근 모서리 */
  padding: 20px;               /* 패딩 조정 */
  margin: 10px;                /* 버튼 간격 조정 */
  width: 70px;                 /* 너비 조정 */
  height: 70px;                /* 높이 조정 */
  align-items: center;         /* 중앙 정렬 */
  justify-content: center;     /* 중앙 정렬 */
`;

const ButtonText = styled.Text`
  color: #fff;                 /* 텍스트 색상 */
  font-size: 24px;            /* 텍스트 크기 */
`;

export default CalculatorButton;
