# Integer Sequence

## The rule

   ```
   n ->  0 1 2 3 4 5 6 7 8 9
   a(n) ->  1 1 4 8 2
   if no common factor between n and a(n-1)
   if gcd(n,a(n-1)) = 1
   a(n) = a(n-1) + n + 1
   OR
   if gcd > 1
   a(n) = a(n-1)/gcd(n, a(n-1))
   ```

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
