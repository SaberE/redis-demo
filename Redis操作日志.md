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

