
## 创建书籍表
create table book(
	id int(11) primary key AUTO_INCREMENT, ## 主键id
	name varchar(50) not null, ## 书籍名称
	author varchar(50) not null, ## 作者
	price double(11,2) not null, ## 价格
	publish_time date default null ## 出版时间
);

## 插入数据
insert into book values(null,'三国演义','罗贯中',99.00,'1991-01-01');
insert into book values(null,'红楼梦','曹雪芹',188.00,'1992-02-02');
insert into book values(null,'西游记','吴承恩',88.00,'1993-03-03');
insert into book values(null,'java基础','若权',200.00,'1994-04-04');
insert into book values(null,'linux全集','王师傅',500.00,'1995-05-05');

## 新建用户表
create table user (
	id int(11) primary key AUTO_INCREMENT,
	username varchar(50) not null,
	password varchar(50) not null
);

## 插入管理员用户
insert into user values(null,'admin','admin');