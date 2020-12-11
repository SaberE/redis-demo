I:\develop\env\Redis-x64-3.2.100>redis-server.exe redis.windows-service.conf

I:\develop\env\Redis-x64-3.2.100>redis-server.exe redis.windows.conf
                _._
           _.-``__ ''-._
      _.-``    `.  `_.  ''-._           Redis 3.2.100 (00000000/0) 64 bit
  .-`` .-```.  ```\/    _.,_ ''-._
 (    '      ,       .-`  | `,    )     Running in standalone mode
 |`-._`-...-` __...-.``-._|'` _.-'|     Port: 6379
 |    `-._   `._    /     _.-'    |     PID: 4272
  `-._    `-._  `-./  _.-'    _.-'
 |`-._`-._    `-.__.-'    _.-'_.-'|
 |    `-._`-._        _.-'_.-'    |           http://redis.io
  `-._    `-._`-.__.-'_.-'    _.-'
 |`-._`-._    `-.__.-'    _.-'_.-'|
 |    `-._`-._        _.-'_.-'    |
  `-._    `-._`-.__.-'_.-'    _.-'
      `-._    `-.__.-'    _.-'
          `-._        _.-'
              `-.__.-'

[4272] 05 Dec 11:21:49.975 # Server started, Redis version 3.2.100
[4272] 05 Dec 11:21:49.976 * DB loaded from disk: 0.000 seconds
[4272] 05 Dec 11:21:49.976 * The server is now ready to accept connections on port 6379

============================================================客户端================================================================
127.0.0.1:6379> keys *
1) "k1"
127.0.0.1:6379> set k2 v2
OK
127.0.0.1:6379> dbsize
(integer) 2
127.0.0.1:6379> set k3 123456789
OK
127.0.0.1:6379> dbsize
(integer) 3
127.0.0.1:6379> set k4 aldshasldhofafsabfnaiukdhaosl;dsalindalf;da
OK
127.0.0.1:6379> dbsize
(integer) 4
127.0.0.1:6379> keys *
1) "k3"
2) "k2"
3) "k4"
4) "k1"
127.0.0.1:6379> dbsize
(integer) 7
(4.97s)

localhost:6379> migrate 127.0.0.1 6380 "" 0 100 copy keys k1 k2
OK
127.0.0.1:6379[1]> set k6 1_v6
OK
127.0.0.1:6379[1]> move k6 0
(integer) 1
127.0.0.1:6379[1]> select 0
OK
127.0.0.1:6379> get k6
"1_v6"
127.0.0.1:6379> object refcount k1
(integer) 1
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> object refcount k1
(integer) 1
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> set k7 v1
OK
127.0.0.1:6379> object refcount k1
(integer) 1
127.0.0.1:6379> get k7
"v1"
127.0.0.1:6379> object encoding k1
"embstr"
127.0.0.1:6379> object encoding k2
"embstr"
127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇ [EX seconds] [PX milliseconds] [NX|XX]127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇr [EX seconds] [PX milliseconds] [NX|XX127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇra [EX seconds] [PX milliseconds] [NX|X127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇraw [EX seconds] [PX milliseconds] [NX|127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ [EX seconds] [PX milliseconds] [NX127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ [EX seconds] [PX milliseconds] [127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ￂ [EX seconds] [PX milliseconds] 127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ￂ￫ [EX seconds] [PX milliseconds]127.0.0.1:6379> set k8 Redis￐ﾡￓￚﾵ￈ￓￚ44ﾸ￶ￗￖﾽￚﾵￄￗￖﾷ￻ﾴﾮￊￇembstrﾱ￠ￂ￫ﾡﾢﾴ￳ￓￚ44ﾸ￶ￗￖﾽￚￊￇrawﾱ￠ￂ￫
OK
127.0.0.1:6379> get k8
"Redis\xd0\xa1\xd3\xda\xb5\xc8\xd3\xda44\xb8\xf6\xd7\xd6\xbd\xda\xb5\xc4\xd7\xd6\xb7\xfb\xb4\xae\xca\xc7embstr\xb1\xe0\xc2\xeb\xa1\xa2\xb4\xf3\xd3\xda44\xb8\xf6\xd7\xd6\xbd\xda\xca\xc7raw\xb1\xe0\xc2\xeb"
127.0.0.1:6379> object encoding k8
"raw"
127.0.0.1:6379> obejct idletime k1
(error) ERR unknown command 'obejct'
127.0.0.1:6379> object idletime k1
(integer) 448
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> object idletime k1
(integer) 9
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> object idletime k1
(integer) 13
127.0.0.1:6379>
127.0.0.1:6379>                                                                                                                                         
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> persist k1
(integer) 0
127.0.0.1:6379> expire k1 10
(integer) 1
127.0.0.1:6379> persist k1
(integer) 1
127.0.0.1:6379> persist k1
(integer) 0
127.0.0.1:6379>                                                                                                                                         
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> ttl k1
(integer) -2
127.0.0.1:6379> ttl k2
(integer) -1
127.0.0.1:6379> ttl k1
(integer) -2
127.0.0.1:6379> expire k1 3
(integer) 0
127.0.0.1:6379> ttl k1
(integer) -2
127.0.0.1:6379> get k1
(nil)
127.0.0.1:6379> set k1 v1
OK
127.0.0.1:6379> expire k1 100
(integer) 1
127.0.0.1:6379> get k1
"v1"
127.0.0.1:6379> ttl k1
(integer) 91
127.0.0.1:6379> pttl k1
(integer) 82065
127.0.0.1:6379>                                                                                                                                         
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> randomkey
"k4"
127.0.0.1:6379> randomkey
"k4"
127.0.0.1:6379> randomkey
"k4"
127.0.0.1:6379> randomkey
"k3"
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> set k1 v1
OK
127.0.0.1:6379> rename k1 k1-1
OK
127.0.0.1:6379> get k1
(nil)
127.0.0.1:6379> get k1-1
"v1"
127.0.0.1:6379>  
127.0.0.1:6379>  
127.0.0.1:6379>   
127.0.0.1:6379> renamenx k1-1 k2
(integer) 0
127.0.0.1:6379> get k1-1
"v1"
127.0.0.1:6379> renamenx k1-1 k1
(integer) 1
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> set k1 v1
OK
127.0.0.1:6379> dump k1
"\x00\x02v1\a\x00\xa0\xd7e\xad\xc3\x9a\xacA"
127.0.0.1:6379>    
127.0.0.1:6379> 
127.0.0.1:6379> 
127.0.0.1:6379> 
127.0.0.1:6379> restore k9 10 "\x00\x02v1\a\x00\xa0\xd7e\xad\xc3\x9a\xacA"
(error) BUSYKEY Target key name already exists.
127.0.0.1:6379> restore k10 10000 "\x00\x02v1\a\x00\xa0\xd7e\xad\xc3\x9a\xacA"
OK
127.0.0.1:6379> get k10
"v1"
127.0.0.1:6379> get k10
(nil)
127.0.0.1:6379>    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> type k1
string
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lpush list1 v1 v2 v3 v4
(integer) 4
127.0.0.1:6379> lrange list1 0 -2
1) "v4"
2) "v3"
3) "v2"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
4) "v1"
127.0.0.1:6379> blpop list1 1000
1) "list1"
2) "v4"
127.0.0.1:6379> lrange list1 0 -1
1) "v3"
2) "v2"
3) "v1"
127.0.0.1:6379> 
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
4) "v1"
127.0.0.1:6379> brpop list2 list1 1000
1) "list1"
2) "v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
127.0.0.1:6379>               
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
4) "v1"
127.0.0.1:6379> lrange list2 0 -1
1) "v6"
2) "v5"
3) "v2"
4) "v1"
127.0.0.1:6379> brpoplpush list1 list2 1000
"v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v4"
2) "v3"
3) "v2"
127.0.0.1:6379> lrange list2 0 -1
1) "v1"
2) "v6"
3) "v5"
4) "v2"
5) "v1"
127.0.0.1:6379>     
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lindex list1 0
"v1"
127.0.0.1:6379> lindex list1 -1
"v4"
127.0.0.1:6379> lindex list1 5
(nil)
127.0.0.1:6379>               
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
127.0.0.1:6379> rpush list1 v1
(integer) 5
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
5) "v1"
127.0.0.1:6379> linsert list1 before v1 v5
(integer) 6
127.0.0.1:6379> lrange list1 0 -1
1) "v5"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v1"
127.0.0.1:6379> linsert list1 before v6 v6
(integer) -1
127.0.0.1:6379>                                      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> llen list1
(integer) 6
127.0.0.1:6379> llen list12345
(integer) 0
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v5"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v1"
127.0.0.1:6379> lpop list1
"v5"
127.0.0.1:6379> rpop list1
"v1"
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
127.0.0.1:6379>    
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
127.0.0.1:6379> lpush list1 v0
(integer) 5
127.0.0.1:6379> rpush list1 v5 v6
(integer) 7
127.0.0.1:6379> lrange list1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v5"
7) "v6"
127.0.0.1:6379>  
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v0"
2) "v1"
3) "v2"
4) "v3"
5) "v4"
6) "v5"
7) "v6"
127.0.0.1:6379> lpushx list1 v-1
(integer) 8
127.0.0.1:6379> lpushx list213 v0
(integer) 0
127.0.0.1:6379> lrange list213 0 -1
(empty list or set)
127.0.0.1:6379> lpush list213 v0
(integer) 1
127.0.0.1:6379> lrange list213 0 -1
1) "v0"
127.0.0.1:6379>   
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lpush list1 v0 v1 v2 v3  v4 v4 v3 v2 v1 v0
(integer) 10
127.0.0.1:6379> lrem list1 0 v0
(integer) 2
127.0.0.1:6379> lrange list1 0 -1
1) "v1"
2) "v2"
3) "v3"
4) "v4"
5) "v4"
6) "v3"
7) "v2"
8) "v1"
127.0.0.1:6379> lrem list1 1 v1
(integer) 1
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v3"
3) "v4"
4) "v4"
5) "v3"
6) "v2"
7) "v1"
127.0.0.1:6379> lrem list1 -1 v2
(integer) 1
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v3"
3) "v4"
4) "v4"
5) "v3"
6) "v1"
127.0.0.1:6379> lrem list 0 v7
(integer) 0
127.0.0.1:6379>      
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379>
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v3"
3) "v4"
4) "v4"
5) "v3"
6) "v1"
127.0.0.1:6379> lset list1 1 v2
OK
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v2"
3) "v4"
4) "v4"
5) "v3"
6) "v1"
127.0.0.1:6379> lset list1 -1 v3
OK
127.0.0.1:6379> lrange list1 0 -1
1) "v2"
2) "v2"
3) "v4"
4) "v4"
5) "v3"
6) "v3"
127.0.0.1:6379>                                              