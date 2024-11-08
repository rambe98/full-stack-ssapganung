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

const users = [
  { id: '1', name: 'John Doe', email: 'john@example.com' },
  { id: '2', name: 'Jane Smith', email: 'jane@example.com' },
  { id: '3', name: 'Alice Johnson', email: 'alice@example.com' },
];

const UserListScreen = ({ navigation }) => {
  return (
    <Container>
      <StyledText>유저 목록</StyledText>
      {users.map((user) => (
        <Button
          key={user.id}
          title={`프로필 보기 - ${user.name}`}
          onPress={() => navigation.navigate('UserProfileScreen', { userId: user.id })}
        />
      ))}
    </Container>
  );
};

export default UserListScreen;
