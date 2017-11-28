create table customer
(
cusno number(4) constraint customer_pk primary key,
eventno number (4),
ID varchar2(20) not null,
Password  varchar2(20) not null,
Jumin1 number(6) not null,
Jumin2 number(7) not null,
Name varchar2(20) not null,
Tel varchar2(14) not null,
addr varchar2(100),
perinfo varchar2(20)
);
create sequence customer_seq
start with 1 
increment by 1
nocycle
nocache;


create table ticket
(
ticketno number(4) constraint ticket_pk primary key,
empno number(4), 
ticketinfo varchar2(300) not null,
price number(38) not null,
discount varchar2(400) not null,
tickets varchar2(20) not null
);
create sequence ticket_seq
start with 1 
increment by 1
nocycle
nocache;

create table prepass
(
prepassno number(5) constraint prepass_pk primary key,
empno number(4)
rideno number(4)

)




