-- mine DB생성
create database mine;


-- mine DB 사용
use mine;
-----------------------태우----------------------------------
CREATE TABLE MY_FILELOAD(
	MF_SEQ INT AUTO_INCREMENT PRIMARY KEY, -- 파일 번호
	MF_CATEGORY VARCHAR(10),  --카테고리
	MF_TITLE VARCHAR(200) NOT NULL, --  파일명
	MF_REGDATE TIMESTAMP DEFAULT NOW() NOT NULL, -- 작성일
	MF_MEMO  VARCHAR(200), -- 메모
	MF_FILE_ID VARCHAR(50) NOT NULL, -- 작성자	
	MF_FILENAME DECIMAL(10), --원본파일 
	MF_NEWFILENAME DECIMAL(10), -- 담아둘거
	
);


