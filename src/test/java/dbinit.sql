CREATE SCHEMA daltest00 DEFAULT CHARACTER SET utf8 ;
CREATE SCHEMA daltest01 DEFAULT CHARACTER SET utf8 ;
CREATE SCHEMA daltest10 DEFAULT CHARACTER SET utf8 ;
CREATE SCHEMA daltest11 DEFAULT CHARACTER SET utf8 ;

CREATE TABLE daltest00.user0 (
  userid bigint(20) unsigned NOT NULL auto_increment,
  nick varchar(10) NOT NULL,
  sex int(10) unsigned default NULL,
  addr varchar(300) NOT NULL,
  intro varchar(300) NOT NULL,
  createtime datetime NOT NULL,
  uuid bigint(20) unsigned NOT NULL,
  uuid2 double default NULL,
  uuid3 double NOT NULL,
  uuid4 float NOT NULL,
  uuid5 float default NULL,
  uuid6 tinyint(4) NOT NULL,
  uuid7 tinyint(4) default NULL,
  uuid8 smallint(6) NOT NULL,
  uuid9 smallint(6) default NULL,
  uuid10 bigint(20) default NULL,
  uuid11 int(11) NOT NULL,
  uuid12 int(11) default NULL,
  PRIMARY KEY  (userid)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



CREATE TABLE daltest00.person0 (
  pid int(11) NOT NULL auto_increment,
  name varchar(45) NOT NULL,
  level int(11) NOT NULL,
  PRIMARY KEY  (pid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE daltest01.person0 (
  pid int(11) NOT NULL auto_increment,
  name varchar(45) NOT NULL,
  level int(11) NOT NULL,
  PRIMARY KEY  (pid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE daltest01.user0 (
  userid bigint(20) unsigned NOT NULL auto_increment,
  nick varchar(10) NOT NULL,
  sex int(10) unsigned default NULL,
  addr varchar(300) NOT NULL,
  intro varchar(300) NOT NULL,
  createtime datetime NOT NULL,
  uuid bigint(20) unsigned NOT NULL,
  uuid2 double default NULL,
  uuid3 double NOT NULL,
  uuid4 float NOT NULL,
  uuid5 float default NULL,
  uuid6 tinyint(4) NOT NULL,
  uuid7 tinyint(4) default NULL,
  uuid8 smallint(6) NOT NULL,
  uuid9 smallint(6) default NULL,
  uuid10 bigint(20) default NULL,
  uuid11 int(11) NOT NULL,
  uuid12 int(11) default NULL,
  PRIMARY KEY  (userid)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE daltest10.user1 (
  userid bigint(20) unsigned NOT NULL auto_increment,
  nick varchar(10) NOT NULL,
  sex int(10) unsigned default NULL,
  addr varchar(300) NOT NULL,
  intro varchar(300) NOT NULL,
  createtime datetime NOT NULL,
  uuid bigint(20) unsigned NOT NULL,
  uuid2 double default NULL,
  uuid3 double NOT NULL,
  uuid4 float NOT NULL,
  uuid5 float default NULL,
  uuid6 tinyint(4) NOT NULL,
  uuid7 tinyint(4) default NULL,
  uuid8 smallint(6) NOT NULL,
  uuid9 smallint(6) default NULL,
  uuid10 bigint(20) default NULL,
  uuid11 int(11) NOT NULL,
  uuid12 int(11) default NULL,
  PRIMARY KEY  (userid)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE daltest11.user1 (
  userid bigint(20) unsigned NOT NULL auto_increment,
  nick varchar(10) NOT NULL,
  sex int(10) unsigned default NULL,
  addr varchar(300) NOT NULL,
  intro varchar(300) NOT NULL,
  createtime datetime NOT NULL,
  uuid bigint(20) unsigned NOT NULL,
  uuid2 double default NULL,
  uuid3 double NOT NULL,
  uuid4 float NOT NULL,
  uuid5 float default NULL,
  uuid6 tinyint(4) NOT NULL,
  uuid7 tinyint(4) default NULL,
  uuid8 smallint(6) NOT NULL,
  uuid9 smallint(6) default NULL,
  uuid10 bigint(20) default NULL,
  uuid11 int(11) NOT NULL,
  uuid12 int(11) default NULL,
  PRIMARY KEY  (userid)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



CREATE TABLE daltest00.account (
  uid varchar(20) NOT NULL,
  city varchar(45) NOT NULL,
  PRIMARY KEY  (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE daltest01.account (
  uid varchar(20) NOT NULL,
  city varchar(45) NOT NULL,
  PRIMARY KEY  (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


