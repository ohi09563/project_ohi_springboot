/*ohi09563//12345
*/




create table Board(

                      idx number primary key,
                      name varchar2(50) not null,
                      title varchar2(200) not null,
                      content varchar2(2000) not null,
                      postdate date default sysdate not null,
                      ofile varchar2(200),
                      sfile varchar2(200),
                      downcount number(5) default 0 not null,
                      visticount number default 0 not null,

                      id varchar(50) not null,
                      pass varchar2(50) not null

)