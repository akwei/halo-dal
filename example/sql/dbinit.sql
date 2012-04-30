CREATE SCHEMA daltest0 DEFAULT CHARACTER SET utf8 ;
CREATE SCHEMA daltest1 DEFAULT CHARACTER SET utf8 ;

CREATE TABLE daltest0.user0 (
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

CREATE TABLE daltest1.user1 (
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


