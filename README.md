# Integer Sequence

## The rule



   ```
   n ->  0 1 2 3 4 5 6 7 8 9
   a(n) ->  1 1 4 8 2
   if no common factor between n and a(n-1)
   if (gcd(n,a(n-1)) = 1){
   a(n) = a(n-1) + n + 1
   } else {
   if gcd > 1
   a(n) = a(n-1)/gcd(n, a(n-1))
   }
   ```

Where gcd (greatest common divisor) is a function which compares two integers to find their gcd, then we and plot the pairs (n, a(n)).

This integer sequence behaves unexpectedly after 638 iterations.

File at /src/com/company/Main.java generates coordinates from the sequence and sends the to a plain text file data.dat

This file can be imported into any plotting software such as Gnuplot.

If using Gnuplot,

```
$ gnuplot
gnuplot> set autoscale y
gnuplot> set autoscale x
gnuplot> plot 'data.dat' with points pointtype 5
```

Run the for loop for 700 iterations and you will see that something odd happens in the graph after 638 iterations.

For Amazing Graphs a [Youtube](https://youtu.be/pAMgUB51XZA) Numberphile video

Using Java 11
