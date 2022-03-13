create CACHED table ChatMessage (
  timeStamp    timestamp     not null ,
  id           varchar(50)   not null ,
  sender       varchar(50)   not null ,
  destination  varchar(50)   not null ,
  body         varchar(5000) not null ,
  shown        boolean       not null
)
