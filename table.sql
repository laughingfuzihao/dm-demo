CREATE TABLE "LAUGHING"."user"
(
"id" VARCHAR2(50) NOT NULL,
"name" VARCHAR2(50),
"age" INT,
NOT CLUSTER PRIMARY KEY("id")) STORAGE(ON "MAIN", CLUSTERBTR) ;
