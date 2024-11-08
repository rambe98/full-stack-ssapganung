import React from 'react';
import styled from 'styled-components/native';

const Container = styled.SafeAreaView`
  flex: 1;
  justify-content: center;
  align-items: center;
  background-color: white;
`;

const StyledText = styled.Text`
  font-size: 30px;
  margin-bottom: 10px;
`;

const users = [
  { id: '1', name: 'John Doe', email: 'john@example.com' },
  { id: '2', name: 'Jane Smith', email: 'jane@example.com' },
  { id: '3', name: 'Alice Johnson', email: 'alice@example.com' },
];

const UserProfileScreen = ({ route }) => {
  const { userId } = route.params;
  const user = users.find(u => u.id === userId);

  if (!user) {
    return (
      <Container>
        <StyledText>유저를 찾을 수 없습니다</StyledText>
      </Container>
    );
  }

  return (
    <Container>
      <StyledText>이름 : {user.name}</StyledText>
      <StyledText>이메일 : {user.email}</StyledText>
    </Container>
  );
};

export default UserProfileScreen;
