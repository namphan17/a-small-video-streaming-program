# Streaming Video with RTSP and RTP

A java program that implement real-time streaming protocol to provide clients video streaming from server.

First, clone the program from this repository
Then, to set up the program, execute the following commands:
```
cd a-small-video-streaming-program\src
javac Client.java
javac Server.java
javac RTPpacket.java
javac VideoStream.java
```
Now we have the program ready, to run it on the server side:
```
java Server 25000
```
On the client side:
```
java Client [Server-IP] 25000 [movie-file-name]
```

To test the program locally, do the following commands with 2 terminal windows, one for the server and the other for the client
```
java Server 25000
java Client 127.0.0.1 25000 [movie-file-name]
```
