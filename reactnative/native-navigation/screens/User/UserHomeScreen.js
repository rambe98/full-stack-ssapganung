import React from 'react';
import { Button } from 'react-native';
import styled from 'styled-components/native';

const Container = styled.SafeAreaView`
  flex: 1;
  justify-content: center;
  align-items: center;
  background-color: white;
`;

const StyledText = styled.Text`
  font-size: 30px;
  margin-bottom: 20px;
`;

const UserHomeScreen = ({ navigation }) => {
  return (
    <Container>
      <StyledText>회원 관리</StyledText>
      <Button
        title="유저 목록 보기"
        onPress={() => navigation.navigate('UserListScreen')}
      />
    </Container>
  );
};

export default UserHomeScreen;
