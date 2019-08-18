# Integer Sequence

This integer sequence behaves unexpectedly after 638 interations.

File at /src/com/company/Main.java generates coordinates from the sequence and sends the to a plain text file data.dat

This file can be imported into any plotting software such as Gnuplot.

If using gnuplot,

```
$ gnuplot
gnuplot> set autoscale y
gnuplot> set autoscale x
gnuplot> plot 'data.dat' with points pointtype 5
```

Run the for loop for 700 iterations and you will see that something odd happens in the graph after 638 iterations.

Amazing Graphs a [Youtube](https://youtu.be/pAMgUB51XZA) Numberphile video

Using Java 11