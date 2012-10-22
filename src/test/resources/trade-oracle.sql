prompt PL/SQL Developer import file
prompt Created on 2011年8月3日 by cx
set feedback off
set define off
prompt Dropping TRADE...
drop table TRADE cascade constraints;
prompt Creating TRADE...
create table TRADE
(
  id           VARCHAR2(32) not null,
  myaccount    VARCHAR2(32),
  remark       VARCHAR2(32),
  type         VARCHAR2(32),
  time         DATE,
  otheraccount VARCHAR2(32),
  balance      NUMBER(11,2)
)
tablespace OTA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 16K
    minextents 1
    maxextents unlimited
  );
comment on table TRADE
  is 'ORACLE交易表';
comment on column TRADE.id
  is '主键';
comment on column TRADE.myaccount
  is '我的帐户';
comment on column TRADE.type
  is '金额';
comment on column TRADE.otheraccount
  is '备注';
comment on column TRADE.balance
  is '时间';
alter table TRADE
  add constraint PK_ATRADE_ID primary key (ID)
  using index 
  tablespace OTA
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for TRADE...
alter table TRADE disable all triggers;
prompt Loading TRADE...
insert into TRADE (id, myaccount, remark, type, time, otheraccount, balance)
values ('1', 'abc', 'abc', 'd', to_date('12-07-2011', 'dd-mm-yyyy'), 'asdfa', 123);
insert into TRADE (id, myaccount, remark, type, time, otheraccount, balance)
values ('2', '123', 'dbd', 'ad', to_date('27-07-2011', 'dd-mm-yyyy'), 'adfxc', 311);
commit;
prompt 2 records loaded
prompt Enabling triggers for TRADE...
alter table TRADE enable all triggers;
set feedback on
set define on
prompt Done.
