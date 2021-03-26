```sql
	create user 'baseballs'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON *.* TO 'baseballs'@'%';
create database baseballs;

select * from user;
select * from team;
select * from stadium;
update team set stadiumId = 3 where id =3;
```