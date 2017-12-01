drop table customer;
create table customer
(
cusno number(4) constraint customer_pk primary key,
eventno number (4),
cusiD varchar2(20) not null,
Password  varchar2(20) not null,
Jumin1 number(6) not null,
Jumin2 number(7) not null,
Name varchar2(20) not null,
Tel varchar2(14) not null,
addr varchar2(100),
perinfo varchar2(20)
);
drop sequence customer_seq;
create sequence customer_seq
start with 1 
increment by 1
nocycle
nocache;

drop table ticket;
create table ticket
(
ticketno number(4) constraint ticket_pk primary key,
empno number(4), 
ticketinfo varchar2(300) not null,
price number(38) not null,
discount varchar2(400) not null,
tickets varchar2(20) not null
);

drop sequence ticket_seq;
create sequence ticket_seq
start with 1 
increment by 1
nocycle
nocache;


drop table prepass;
create table prepass
(
prepassno number(5) constraint prepass_pk primary key,
cusno number(4),
rideno number(4),
prepasstime date
);

drop sequence prepass_seq;
create sequence prepass_seq
start with 1
increment by 1
nocycle
nocache;

drop table ride;
create table ride
(
rideno number(4) constraint ride_pk primary key,
empno number(4),
ridename varchar2(15) not null,
rideinfo varchar2(300) not null,
operation varchar2(20),
opertime varchar2(15) not null,
waittime number(12) not null,
ridelimit varchar2(100) not null,
countpeople varchar2(50) not null,
location varchar2(200) not null,
countride number(12)
);

drop sequence ride_seq;
create sequence ride_seq
start with 1
increment by 1
nocycle
nocache;


drop table convenient;
create table convenient
(
conno number(4) constraint convenient_pk primary key,
empno number(4),
conname varchar2(15) not null,
coninfo varchar2(300) not null,
conoperation varchar2(20) not null,
conlocation varchar2(20) not null
);

drop sequence convenient_seq;
create sequence convenient_seq
start with 1
increment by 1
nocycle
nocache;

drop table nol2emp;
create table nol2emp
(
empno number(4) constraint emp_pk primary key,
empid varchar2(20) not null,
emppass varchar2(20) not null,
Jumin1 number(6) not null,
Jumin2 number(7) not null,
Name varchar2(20) not null,
Tel varchar2(14) not null,
addr varchar2(100),
sal number(7,2) not null,
dname varchar2(14) not null
);

drop sequence nol2emp_seq;
create sequence nol2emp_seq
start with 1
increment by 1
nocycle
nocache;

drop table pay;
create table pay 
(
payno number(4) constraint pay_pk primary key,
cusno number(4),
empno number(4),
ticketno number(4),
coupon varchar2(10),
paydate date,
payment varchar2(15) not null
);

drop sequence pay_seq;
create sequence pay_seq 
start with 1
increment by 1
nocycle
nocache;

drop table event;
create table event
(
eventno number(4) constraint event_pk primary key,
empno number(4),
eventname varchar2(15) not null,
eventinfo varchar2(300) not null,
eventtime varchar2(30) not null,
eventlocation varchar2(300) not null,  
events varchar2(20) not null
);
drop sequence event_seq;
create sequence event_seq
start with 1
increment by 1
nocycle
nocache;

alter table ticket
add constraint nol2emp_empno_fk foreign key (empno) 
references nol2emp(empno);


alter table customer
add constraint event_eventno_fk foreign key (eventno)
references event(eventno);

alter table customer
drop constraint event_eventno_fk;


alter table event
add constraint nol3emp_empno_fk foreign key (empno)
references nol2emp(empno);


alter table ride
add constraint nol4emp_empno_fk foreign key (empno)
references nol2emp(empno);

alter table convenient
add constraint nol5emp_empno_fk foreign key (empno)
references nol2emp(empno);


alter table pay
add constraint nol6emp_empno_fk foreign key (empno)
references nol2emp(empno);

alter table pay
add constraint customer_cusno_fk foreign key (cusno)
references customer(cusno);

alter table pay
add constraint ticket_ticketno_fk foreign key (ticketno)
references ticket(ticketno);

alter table prepass
add constraint customer2_cusno_fk foreign key (cusno)
references customer(cusno);

alter table prepass
add constraint ride_rideno_fk foreign key (rideno)
references ride(rideno);
