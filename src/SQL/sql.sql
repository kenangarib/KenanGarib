create table public.student (


	id integer primary key not null,
	name varchar not null,
	surname varchar not null,
	groupid int,
	foreign key (groupid) references public.group(groupid)

);

-- create table teacher (

-- 	id int primary key not null,




-- 	name varchar not null,
-- 	surname varchar not null,
-- 	groupid int,
-- 	foreign key(groupid) references public.group(groupid)

-- );

select public.student.id, public.student.name, public.student.surname from public.student
inner join public.group  on public.student.groupid=public.group.groupid