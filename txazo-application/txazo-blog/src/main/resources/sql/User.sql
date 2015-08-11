drop table User;

create table User (
    id int(11) unsigned not null auto_increment comment 'id',
    userName varchar(20) not null default '' comment 'userName',
    passWord varchar(16) not null default '' comment 'passWord',
    encryptKey varchar(8) not null default '' comment 'encryptKey',
    email varchar(30) not null default '' comment 'email',
    avatar varchar(50) not null default '' comment 'avatar',
    privilege int(11) unsigned not null default 0 comment 'privilege',
    isDeleted tinyint(3) unsigned not null default 0 comment 'isDeleted',
    createTime datetime not null default '1970-01-01 00:00:00' comment 'createTime',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment 'updateTime',
    primary key (id),
    unique (userName),
    key (email),
    key (createTime)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='User';