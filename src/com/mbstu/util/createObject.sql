drop database if exists bank;
 create database  bank;
  use  bank;
drop table if exists t_admin;
drop table if exists t_NewAcc;
drop table if exists DepositInfo;
drop table if exists WithdrawInfo;
drop table if exists transfer;

create table t_admin
(
                   
    adName              varchar(20)     not null,
    adPassword          varchar(20)     not null,
    constraint          pk_oid          primary key     (adName),
    constraint          uk_adName       unique key      (adName)
);

create table t_NewAcc
(
  
    AccNo               varchar(20) not null,
    AccName             varchar(100),
    custName            varchar(100),
    Balance             varchar(100),
    Address             varchar(100),
    secCode             varchar(100),
    MobileNo            varchar(100),
    EmailID             varchar(100),
    Image               blob(200),
  
    constraint          pk_oid          primary key     (AccNo),
    constraint          uk_AccNo        unique key      (AccNo)
);
create table DepositInfo
(
   Name                  varchar(20),
   Account_Num           varchar(20),
   Date                  date,
   Ammount               varchar(20)

);

create table WithdrawInfo
(
   Name                 varchar(20),
   Account_Num          varchar(20),
   Date                  date,
   Ammount              varchar(20)

);

create table transfer
(
   AccNum_from          varchar(20),
   custNamefrom         varchar(20),
   AccNum_to            varchar(20),
   custNameto           varchar(20),
   Date                  date,
   Ammount               varchar(20)
);