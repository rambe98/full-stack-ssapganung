-- 숫자 함수
-- ABS() -> 절대값을 반환한다.
SELECT -10, ABS(-10) FROM DUAL; 

-- ROUND()-> 특정 자리수에서 반올림을 하여 반환한다.
SELECT ROUND(1234.567,1), ROUND(1234.567,-1), ROUND(1234.567) FROM DUAL;

-- FLOOR() ->주어진 숫자보다 작거나 같은 정수중 최대값을 반환한다
SELECT FLOOR(2), FLOOR(2.1) FROM DUAL; 
-- TRUNC() -> 특정 자리수에서 잘라내고 반환한다 (버림)
SELECT TRUNC(1234.567,1),TRUNC(1234.567,-1),TRUNC(1234.567) FROM DUAL;
-- SIGN() -> 주어진 값의 음수,정수,0 여부를 반환한다.
SELECT SIGN(-10),SIGN(0),SIGN(10),SIGN(NULL) FROM DUAL;
-- CEIL() ->  주어진 숫자보다 크거나 같은 정수 중 최소값을 반환한다.
SELECT CEIL(2),CEIL(2.1) FROM DUAL;
-- MOD()-> 나누기 후 나머지를 반환한다.
SELECT MOD(1,3),MOD(2,3),MOD(3,3),MOD(4,3),MOD(0,3) FROM DUAL;
-- POWER() -> 주어진 숫자의 지정된 수 만큼의 제곱값을 반환한다.
SELECT POWER(2,1),POWER(2,2),POWER(2,3),POWER(2,0) FROM DUAL;

-- 사원번호가 홀수이면 1, 짝수이면 0을 출력하시오.
SELECT EMPLOYEE_ID , MOD(EMPLOYEE_ID, 2)
FROM EMPLOYEES; 
-- 사원번호가 짝수인 사람들의 사원번호와 이름을 조회하세요
SELECT EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES
WHERE MOD(EMPLOYEE_ID,2)=0 ORDER BY EMPLOYEE_ID;

-- 사원테이블에서 이름, 급여, 급여 1000당 ■의 개수를 채워 조회하세요
-- ex) 급여가 8,000이다. ■■■■■■■■로 표현
SELECT FIRST_NAME, SALARY, RPAD('■',ROUND(SALARY/1000),'■') 
FROM EMPLOYEES ORDER BY SALARY ;

-- 날짜함수 ※ 날짜 + 날짜 : 날짜끼리는 더하기가 안됩니다.
-- SYSDATE : 현재 날짜
-- ADD_MONTHS() -> 특정날짜에 개월수를 더해준다.
SELECT SYSDATE, ADD_MONTHS(SYSDATE, 2)FROM DUAL;
-- MONTHS_BETWEEN() -> 주어진 두 개의 날짜 간격 개월을 반환한다.
SELECT SYSDATE , HIRE_DATE, MONTHS_BETWEEN(SYSDATE,HIRE_DATE)
FROM EMPLOYEES;
-- NEXT_DAY() -> 주어진 일자가 다음에 나타나는 지정요일의 날짜를 반환한다.(1:일요일 ~ 7:토요일)
SELECT NEXT_DAY(SYSDATE, 1) FROM DUAL;
SELECT NEXT_DAY(SYSDATE, '일요일') FROM DUAL;
SELECT NEXT_DAY(SYSDATE, '일') FROM DUAL;
SELECT NEXT_DAY(SYSDATE, SUNDAY) FROM DUAL;-- 안된다, 지역이 한국으로 잡혀있어서
-- LAST_DAY() -> 주어진 일자가 포함된 월의 말일을 반환한다.

--사원테이블에서 모든 사원의 입사일로부터 6개월 뒤의 날짜를 이름, 입사일, 6개월뒤 날짜 순으로 출력
SELECT FIRST_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE,6) NEW_DATE FROM EMPLOYEES; 

-- 사번이 120번인 사원이 입사후 3년 6개월째 되는날 진급예정이다. 진급 예정 날짜를 구하시오.
SELECT FIRST_NAME, ADD_MONTHS(HIRE_DATE,42) PROMOTION 
FROM EMPLOYEES WHERE EMPLOYEE_ID = 120;

-- 모든 사원이 입사일로 부터 오늘까지 몇개월 경과했는지 출력
SELECT SYSDATE, HIRE_DATE, MONTHS_BETWEEN(SYSDATE,HIRE_DATE) 
FROM EMPLOYEES;

-- 사원들의 이름, 입사일, 입사후 오늘까지의 개월수를 조회하되 입사기간이 200개월 
-- 이상인 사람만 출력하고 입사개월수는 소수점 이하 한자리까지만 버림하시오.
SELECT FIRST_NAME, HIRE_DATE, TRUNC(MONTHS_BETWEEN(SYSDATE,HIRE_DATE),1) MONTHS 
FROM EMPLOYEES WHERE TRUNC(MONTHS_BETWEEN(SYSDATE,HIRE_DATE),1) >= 200;

-- 형변환 함수
-- TO_CHAR()
-- 날짜를 형식에 맞춰 문자열로 변환
SELECT TO_CHAR(sysdate,'yyyy-mm-dd'), 
 	   TO_CHAR(sysdate,'yyyy-mm-dd day'), 
	   TO_CHAR(sysdate,'yyyy-mm-dd HH:MI:SS')
FROM dual;

-- 날짜 포맷 형식
-- SCC, CC : 세기
-- YYYY, YY : 년도
-- MM : 월
-- DD : 일
-- DAY : 요일
-- MON : 월명(JAN)
-- MONTH : 월명(JANUARY)
-- HH, HH24 : 시간
-- MI : 분
-- SS : 초

SELECT TO_CHAR(1234567, '9,999,999'), -- '1,234,567' 
  TO_CHAR(1234567, 'L9,999,999.99'), -- '￦1,234,567.00'
  TO_CHAR(12, '0999') -- '0012'
FROM dual;

--TO_DATE
SELECT TO_DATE('2022.04.11'), -- 22/02/11(날짜형)
  TO_DATE('04.11.2022', 'MM,DD,YYYY'), --22/02/11(날짜형)
  TO_DATE('2022.04', 'YYYY.MM'), --22/04/01 : 일 입력 안하면 1일로 변환
  TO_DATE('11', 'DD') -- 22/04/11 : 년, 월 입력 안하면 해당년 해당월로 변환
FROM dual;


-- NULL 처리 함수
-- NULL 값을 다른 값으로 변경

-- NVL(컬럼,치환할 값)
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, COMMISSION_PCT 
FROM EMPLOYEES WHERE COMMISSION_PCT  IS NULL;

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, NVL(COMMISSION_PCT,0) 
FROM EMPLOYEES WHERE COMMISSION_PCT  IS NULL;
-- NVL2(컬럼,NULL이 아닐 때 치환할 값, NULL일 때 치환할 값)
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, NVL2(COMMISSION_PCT,'보너스 받음','보너스 안받음') 
FROM EMPLOYEES;
-- 순위 함수
-- RANK() OVER() 그룹 내 순의를 계산하여 NUMBER타입으로 순위를 반환
-- RANK() OVER(ORDER BY 컬럼)
SELECT RANK() OVER(ORDER BY SALARY DESC) AS "RANK", FIRST_NAME, SALARY 
FROM EMPLOYEES;

-- DENSE_RANK 그룹 내 순위를 계산하여 NUMBER타입으로 순위를 반환 중복 순위 계산 안함
-- DENSE_RANK() OVER(ORDER BY 컬럼)
SELECT DENSE_RANK() OVER(ORDER BY SALARY DESC) AS "RANK", FIRST_NAME, SALARY 
FROM EMPLOYEES;

-- 집계함수 : 여러 행들에 대한 연산의 결과를 하나의 행으로 반환한다.
-- 집계 함수는 NULL을 체크하지 않는다. 단 COUNT(*)의 경우 NULL도 포함한 값을 반환한다.
-- COUNT()	행들의 개수를 반환
select count(*) from employees;
-- MIN()	행들의 최소값을 반환
SELECT MIN(SALARY) FROM EMPLOYEES;
-- MAX()	행들의 최대값을 반환
SELECT MAX(SALARY) FROM EMPLOYEES;
-- SUM()	행들의 합계를 반환
SELECT SUM(SALARY) FROM EMPLOYEES;
-- AVG()	행들의 평균을 반환한다.
SELECT AVG(SALARY) FROM EMPLOYEES;
-- STDDEV()	행들의 표준편차를 반환한다.
SELECT STDDEV(SALARY) FROM EMPLOYEES;
-- VARIANCE()행들의 분산을 반환한다.
SELECT VARIANCE(SALARY) FROM EMPLOYEES;

-- 사원 테이블에서 보너스를 받는 사원의 수를 조회
SELECT COUNT(COMMISSION_PCT) FROM EMPLOYEES;
-- 사원 테이블에서 직종이 'SA_REP'인 사원들의 평균급여, 최고 급여, 최저급여, 급여의 총 합을 조회하세요
SELECT AVG(SALARY) AVG,MAX(SALARY) MAX,MIN(SALARY) MIN, SUM(SALARY) SUM  
FROM EMPLOYEES WHERE JOB_ID = 'SA_REP';
-- 사원 테이블에서 부서의 개수를 출력하세요
SELECT COUNT(DISTINCT DEPARTMENT_ID) 
FROM EMPLOYEES;
-- 부서 번호가 80번인 사원들의 평균 급여를 소수점 둘째 자리에서 반올림 하세요
SELECT ROUND(AVG(SALARY),1) AVG 
FROM EMPLOYEES WHERE DEPARTMENT_ID = 80;

-- GROUP BY (그룹화) : 특정테이블에서 소그룹을 만들어 결과를 분산시켜 얻고자 할 때
-- GROUP BY : ~별 (예 : 부서별 인원수)

-- 각 부서별 급여의 평균과 총 합을 출력
SELECT DEPARTMENT_ID,AVG(SALARY), SUM(SALARY) 
FROM EMPLOYEES GROUP BY DEPARTMENT_ID;

-- 부서별 , 직종별로 그룹을 나눠 인원수를 출력하되, 부서번호가 낮은 순으로 정렬하세요
SELECT DEPARTMENT_ID, JOB_ID, COUNT(*)
FROM EMPLOYEES GROUP BY DEPARTMENT_ID, JOB_ID 
ORDER BY DEPARTMENT_ID ;

-- 각 직종별 인원수를 출력
SELECT JOB_ID, COUNT(*) FROM EMPLOYEES GROUP BY JOB_ID;
-- 각 직종별 급여의 합을 출력
SELECT JOB_ID, SUM(SALARY) FROM EMPLOYEES GROUP BY JOB_ID;
-- 부서별로 가장 높은 급여를 조회
SELECT DEPARTMENT_ID , MAX(SALARY) 
FROM EMPLOYEES GROUP BY DEPARTMENT_ID ;
-- 부서별 급여의 합계를 내림차순으로 조회
SELECT DEPARTMENT_ID , SUM(SALARY) 
FROM EMPLOYEES GROUP BY DEPARTMENT_ID 
ORDER BY SUM(SALARY) DESC;



CREATE TABLE 월별매출 (
    상품ID VARCHAR2(5),
    월 VARCHAR2(10),
    회사 VARCHAR2(10),
    매출액 INTEGER );
    
INSERT INTO  월별매출 VALUES ('P001', '2019.10', '삼성', 15000);
INSERT INTO  월별매출 VALUES ('P001', '2019.11', '삼성', 25000);
INSERT INTO  월별매출 VALUES ('P002', '2019.10', 'LG', 10000);
INSERT INTO  월별매출 VALUES ('P002', '2019.11', 'LG', 20000);
INSERT INTO  월별매출 VALUES ('P003', '2019.10', '애플', 15000);
INSERT INTO  월별매출 VALUES ('P003', '2019.11', '애플', 10000);

SELECT * FROM 월별매출;

-- ROLLUP()
-- ROLLUP(A) : A 그룹핑 -> 합계
-- ROLLUP(A,B) : A,B그룹핑 -> A소계/합계
-- ROLLUP(A,B,C) : A,B,C그룹핑 -> (A소계,B소계)/합계
SELECT 상품ID, 월, SUM(매출액) FROM 월별매출
GROUP BY ROLLUP(상품ID,월);

-- CUBE() : 항목들간의 다차원 적인 소계
-- GROUP BY 절에 명시한 모든 컬럼에 대해 소그룹 합계를 계산해준다.
SELECT 상품ID,월, SUM(매출액) FROM 월별매출
GROUP BY CUBE(상품ID,월);

SELECT 상품ID,월, SUM(매출액) FROM 월별매출
GROUP BY GROUPING  SETS(상품ID,월);

-- HAVING  where 절 처럼 특정 조건을 추가한다고 생각 하시면 됩니다.

-- 각 부서별 평균 급여러ㅡㄹ 소수점 한자리까지 ㅂ	ㅓ림으로 조회하되/
-- 갓 평균 급여가 10000미만인 그룹만 조회해야 하며 부서 번호가 50번 이하는 무서만 존재
select department_id, TRUNC(AVG(salary),1)
from employees where department_id<=50 
group by department_id
having TRUNC(AVG(salary, 1)) <10000;

--각 부서별 번호, 급여의 합, 평균 인원수 순으로 출력하되
--급여의 합이 30000이상인 경우만 출력해야하며
-- 급여의 평균은 소수점 둘째자리에서 반올림하기

select department_id, SUM(salary), ROUND(AVG(salary),1),COUNT(*) 
from employees group by department_id having SUM(salary)>=30000;



CREATE TABLE test001(
	num NUMBER PRIMARY KEY,
	name varchar2(100)
);

SELECT * FROM ALL_INDEXES WHERE TABLE_NAME = 'TBL_STUDENT';

-- 이름이 'MICHAEL'이고, 직종이 'MK_MAN'인 사원의 급여보다
-- 만이 받는 사원들의 정보를 사번, 이름, 직종. 급여순으로 출력

SELECT SALARY FROM EMPLOYEES 
WHERE FIRST_NAME  = 'Michael' AND JOB_ID = 'MK_MAN';

-- 13000보다 많이 받는 사원들의 정보를 사번, 이름, 직종, 급여순으로 출력
SELECT EMPLOYEE_ID,FIRST_NAME,JOB_ID,SALARY 
FROM EMPLOYEES WHERE SALARY >(SELECT SALARY FROM EMPLOYEES 
WHERE FIRST_NAME  = 'Michael' AND JOB_ID = 'MK_MAN');

-- 사원 번호가 150번인 사원의 급여와 같은 급여를 받는 사원들의 정보를
-- 사번, 이름 , 급여 순으로 출력하세요.
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY
FROM EMPLOYEES WHERE SALARY = (SELECT SALARY FROM EMPLOYEES
WHERE EMPLOYEE_ID = 150);

-- 급여가 회사 전체 평균 급여 이상인 사람들의 이름과 급여 조회하기
SELECT FIRST_NAME, SALARY FROM EMPLOYEES 
WHERE SALARY>=(SELECT AVG(SALARY) FROM EMPLOYEES);

-- 사번이 111번인 사원의 직종과 같고 사번이 159번인 사원의 급여보다 
-- 많이 받는 사원들의 정보를 사번, 이름, 직종, 급여 순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY 
FROM EMPLOYEES WHERE JOB_ID = (SELECT JOB_ID FROM EMPLOYEES
WHERE EMPLOYEE_ID = 111) 
AND SALARY > (SELECT SALARY FROM EMPLOYEES
WHERE EMPLOYEE_ID = 159);








