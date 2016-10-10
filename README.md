# blog
A blog project using bootstrap and jquery as front-end, using spring springmvc and mybatis as back-end

这只是个Demo，由于对前端一无所知，所以简单抄袭了几个bootstrap首页上的示例html，编辑博客使用百度的空间ueditor，与后台交互完全使用ajax，主要关注于后端技术，实现了首页展示，管理员控制台，新建博客，编辑博客等基本功能。


##Back-end：

Spring SpringMVC Mybatis Mysql SpringSecurity

##Front-end:

Bootstrap jQuery ueditor

##注意

数据库使用mysql，建库建表时考虑不周，暂时没想那么多，只建了几个字段，语句如下：

		create database blog;
		use blog;
		create table PostForm(
		    id int(100) NOT NULL AUTO_INCREMENT,
		    title varchar(100) NOT NULL,
		    content varchar(10000) NOT NULL,
		    tags varchar(30) NOT NULL,
		    PRIMARY KEY (id)
		)
		
		create table UserForm(
		    userName varchar(30) NOT NULL,
		    password varchar(30) NOT NULL
		)
		
暂时没用到UserForm，Springsecurity内存管理用户名密码，可更改。
##待完成：

搜索功能（预计使用Elastic Search）

缓存（预计使用Redis）

对于一个博客系统，ES和Redis也许太重量级了，但是为了练习一下与Spring的集成，后续还是会这么做
