drop database LovingBook;
create database LovingBook;
use LovingBook;

create table ROLE(
	ROLE_ID integer auto_increment,
    ROLE_NAME varchar(20) not null,
    DESCRIPTION varchar(50) null,
    
    primary key (ROLE_ID)
);

create table STAFF_ACCOUNT(
	STAFF_ID integer auto_increment,
    USERNAME varchar(25) not null unique,
    PASSWORD varchar(50) not null,
    FIRST_NAME varchar(25) null,
    LAST_NAME varchar(25) null,
    YEAR_OF_BIRTH integer null,
    GENDER varchar(12) null,
    EMAIL varchar(50) null unique,
    STAFF_PHONE varchar(15) null unique,
    PHOTO varchar(120) null,
    STATUS tinyint default 1,
    
    primary key (STAFF_ID)
);

create table CUSTOMER_ACCOUNT(
	CUSTOMER_ID integer auto_increment,
    USERNAME varchar(25) not null unique,
    PASSWORD varchar(50) not null,
    FIRST_NAME varchar(25) null,
    LAST_NAME varchar(25) null,
    YEAR_OF_BIRTH integer null,
    GENDER varchar(12) null,
    EMAIL varchar(50) null unique,
    CUSTOMER_PHONE varchar(15) null unique,
    STATUS tinyint default 1,
    PHOTO varchar(120) null,
    
    primary key (CUSTOMER_ID)
);

create table ADDRESS(
	ADDRESS_ID integer auto_increment,
    CITY varchar(50) not null,
    DISTRICT varchar(50) not null,
    WARD varchar(50) not null,
    STREET varchar(50) not null,
    HOUSE_NUMBER integer not null,
    
    primary key (ADDRESS_ID)
);

create table STAFF_ADDRESS(
	STAFF_ID integer,
    ADDRESS_ID integer,
    
    primary key (STAFF_ID, ADDRESS_ID),
    foreign key (STAFF_ID) references STAFF_ACCOUNT(STAFF_ID),
    foreign key (ADDRESS_ID) references ADDRESS(ADDRESS_ID)
);

create table CUSTOMER_ADDRESS(
	CUSTOMER_ID integer,
    ADDRESS_ID integer,
    
    primary key (CUSTOMER_ID, ADDRESS_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER_ACCOUNT(CUSTOMER_ID),
    foreign key (ADDRESS_ID) references ADDRESS(ADDRESS_ID)
);

create table DISCOUNT(
	DISCOUNT_ID integer auto_increment,
	DISCOUNT_NAME varchar(50) not null,
    DISCOUNT_VALUE numeric(2,2) not null,
    DISCOUNT_EXPIRE datetime not null,
    
    primary key (DISCOUNT_ID)
);

create table CUSTOMER_DISCOUNT(
	CUSTOMER_ID integer,
    DISCOUNT_ID integer,
    
    primary key (CUSTOMER_ID, DISCOUNT_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER_ACCOUNT(CUSTOMER_ID),
    foreign key (DISCOUNT_ID) references DISCOUNT(DISCOUNT_ID)
);

create table CATEGORY(
	CATEGORY_ID integer auto_increment,
    CATEGORY_NAME varchar(50) not null,
    
    primary key (CATEGORY_ID)
);

create table AUTHOR(
	AUTHOR_ID integer auto_increment,
    AUTHOR_NAME varchar(50) not null,
    
    primary key (AUTHOR_ID)
);

create table PUBLISHER(
	PUBLISHER_ID integer auto_increment,
    PUBLISHER_NAME varchar(50) not null,
    PHONE_CONTACT varchar(15) null,
    
    primary key (PUBLISHER_ID)
);

create table BOOK(
	BOOK_ID integer auto_increment,
    TITLE varchar(50) not null,
    PUBLICATION_DATE datetime not null,
    PRICE bigint not null,
    QUANTITY integer not null,
    PHOTO varchar(120) not null,
    PUBLISHER_ID integer not null,

	primary key (BOOK_ID),
    foreign key (PUBLISHER_ID) references PUBLISHER(PUBLISHER_ID)
);

create table CATEGORY_BOOK(
	CATEGORY_ID integer,
    BOOK_ID integer,
    
    primary key (CATEGORY_ID, BOOK_ID),
    foreign key (CATEGORY_ID) references CATEGORY(CATEGORY_ID),
    foreign key (BOOK_ID) references BOOK(BOOK_ID)
);

create table AUTHOR_BOOK(
	AUTHOR_ID integer,
    BOOK_ID integer,
    
    primary key (AUTHOR_ID, BOOK_ID),
    foreign key (AUTHOR_ID) references AUTHOR(AUTHOR_ID),
    foreign key (BOOK_ID) references BOOK(BOOK_ID)
);

create table REVIEW(
	REVIEW_ID integer auto_increment,
    CONTENT varchar(50) null,
    REVIEW_DATE datetime not null,
    
    primary key (REVIEW_ID)
);

create table STAFF_REVIEW(
	STAFF_ID integer,
    REVIEW_ID integer,
    
    primary key (STAFF_ID, REVIEW_ID),
    foreign key (STAFF_ID) references STAFF_ACCOUNT(STAFF_ID),
    foreign key (REVIEW_ID) references REVIEW(REVIEW_ID)
);

create table CUSTOMER_REVIEW(
	CUSTOMER_ID integer,
    REVIEW_ID integer,
    
    primary key (CUSTOMER_ID, REVIEW_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER_ACCOUNT(CUSTOMER_ID),
    foreign key (REVIEW_ID) references REVIEW(REVIEW_ID)
);

create table BOOK_REVIEW(
	BOOK_ID integer,
    REVIEW_ID integer,
    
    primary key (BOOK_ID, REVIEW_ID),
    foreign key (BOOK_ID) references BOOK(BOOK_ID),
    foreign key (REVIEW_ID) references REVIEW(REVIEW_ID)
);

create table ORDERS(
	ORDER_ID integer auto_increment,
    ORDER_DATE datetime not null,
    DISCOUNT_ID integer not null,
    STATUS tinyint default 1,
    
    primary key (ORDER_ID),
    foreign key (DISCOUNT_ID) references DISCOUNT(DISCOUNT_ID)
);

create table STAFF_ORDER(
	STAFF_ID integer,
    ORDER_ID integer,
    
    primary key (STAFF_ID, ORDER_ID),
    foreign key (STAFF_ID) references STAFF_ACCOUNT(STAFF_ID),
    foreign key (ORDER_ID) references ORDERS(ORDER_ID)
);

create table CUSTOMER_ORDER(
	CUSTOMER_ID integer,
    ORDER_ID integer,
    
    primary key (CUSTOMER_ID, ORDER_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER_ACCOUNT(CUSTOMER_ID),
    foreign key (ORDER_ID) references ORDERS(ORDER_ID)
);

-- create table CART(

-- );



