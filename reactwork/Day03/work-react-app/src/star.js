import React from 'react';
import './StarPattern.css'; // 스타일 파일을 사용해

const StarPattern = () => {
  const rows = 10; // 패턴의 총 행 수

  const generatePattern = () => {
    let pattern = [];
    
    for (let i = 1; i <= rows; i++) {
      let spaces = ''.repeat(rows - i); // 공백 생성
      let stars = '* '.repeat(i); // 별 생성
      pattern.push(spaces + stars); // 공백과 별을 합쳐서 추가
    }
    
    return pattern;
  };

  return (
    <div className="star-pattern">
      {generatePattern().map((line, index) => (
        <div key={index} className="line">
          {line}
        </div>
      ))}
    </div>
  );
};

export default StarPattern;